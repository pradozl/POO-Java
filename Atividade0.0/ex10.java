import java.util.ArrayList;
import java.util.Scanner;

public class ex10{
    public static void main(String[] args){
        Banco novoBanco = new Banco("Banco Bradesco");

        ContaBancaria novaConta = new ContaBancaria("1001-X", 500);
        Cliente novoCliente = new Cliente("Carlos Silva do Lemes", "112", novaConta);

        ContaBancaria novaConta1 = new ContaBancaria("1289-Y", 1500);
        Cliente novoCliente1 = new Cliente("Leonardo Pinheiros de Carvalho", "192", novaConta1);

        novoBanco.adicionarCliente(novoCliente);
        novoBanco.adicionarCliente(novoCliente1);

        ATM caixa = new ATM(novoBanco);
        caixa.Iniciar();

    }
}
class ATM{
    private Banco banco;
    private Scanner teclado;
    private Cliente clienteLog;

    public ATM(Banco banco){
        this.banco = banco;
        this.teclado = new Scanner(System.in);
        this.clienteLog = null;
    }
    public void Iniciar(){
        System.out.println("Bem vindo ao Caixa Eletrônico");
        while(true){
            if(clienteLog == null){
                fazerLogin();
            }else{
                exibirMenu();
            }
        }
    }
    public void fazerLogin(){
        System.out.println("\nDigite o seu ID (ou 'Sair' para desligar): ");
        String idDigitado = teclado.next();

        if(idDigitado.equalsIgnoreCase("sair")){
            System.out.println("Desligando o ATM");
            System.exit(0);
        }

        Cliente encontrado = banco.buscarClienteID(idDigitado);

        if(encontrado != null){
            clienteLog = encontrado;
            System.out.println("\n Olá, " + clienteLog.getNome() + " login realizado com sucesso");
        }else{
            System.out.println("Cliente não encontrado, tente novamente");
        }
    }
    public void exibirMenu(){
        System.out.println("\nMenu Principal");
        System.out.println("1. Ver saldo");
        System.out.println("2. Sacar");
        System.out.println("3. Depositar");
        System.out.println("4. Sair");
        System.out.println("Escolha uma das opções");

        int opc = teclado.nextInt();

        switch(opc){
            case 1:
                System.out.println("Seu saldo atual é: " + clienteLog.getConta().getSaldo());
                break;
            case 2:
                System.out.println("Digite o valor para saque: R$ ");
                double valorSaque = teclado.nextDouble();
                clienteLog.getConta().Sacar(valorSaque);
                break;
            case 3:
                System.out.println("Digite o valor a ser depositado: R# ");
                double valorDeposi = teclado.nextDouble();
                clienteLog.getConta().Depositar(valorDeposi);
                break;
            case 4:
                System.out.println("Saindo da conta de: " + clienteLog.getNome());
                clienteLog = null;
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
class Banco{
    private String nomeBanco;
    private ArrayList<Cliente> listaClientes;

    public Banco(String nomeBanco){
        this.nomeBanco = nomeBanco;
        this.listaClientes = new ArrayList<>();
    }
    public String getNomeBanco(){
        return nomeBanco;
    }
    public void adicionarCliente(Cliente c){
        listaClientes.add(c);
    }
    public Cliente buscarClienteID(String id){
        for(Cliente c : listaClientes){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }
}
class Cliente{
    private String nome;
    private String id;
    private ContaBancaria conta;

    public Cliente(String nome, String id, ContaBancaria conta){
        this.nome = nome;
        this.id = id;
        this.conta = conta;
    }
    public String getNome(){
        return nome;
    }
    public String getId(){
        return id;
    }
    public ContaBancaria getConta(){
        return conta;
    }
}
class ContaBancaria{
    private String numero;
    private double saldo;

    public ContaBancaria(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public String getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    public void Depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depositado o valor de: R$ " + valor);
        }else{
            System.out.println("Valor invalido para deposito");
            }
    }
    public boolean Sacar(double valor){
        if (valor > 0 && saldo >= valor){
            saldo -= valor;
            System.out.println("O valor de: R$ " + valor + " foi sacado com sucesso");
            return true;
        }else{
            System.out.println("Saldo insuficiente para saque ou valor invalido");
            return false;
        }
    }
}