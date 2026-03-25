public class ex13{
    public static void main(String[] args){
        System.out.println("=== Testando conta Corrente ===");
        ContaCorrente cc = new ContaCorrente(100.0);

        cc.retirada(10.0);
        cc.retirada(10.0);
        cc.retirada(10.0);
        System.out.println("Saldo após 3 saques: R$ " + cc.getBalanco());

        cc.retirada(10.0);
        System.out.println("Saldo após 4 saques (com taxa): R$ " + cc.getBalanco());

        System.out.println("\n=== Testando conta Poupança ===");
        ContaPoupanca poupanca = new ContaPoupanca(1000.0, 0.05);

        poupanca.adicionarJuros();
        System.out.println("Saldo da poupança com juros: R$ " + poupanca.getBalanco());
    }
}
class ContaBancaria {
    protected double balanco;

    public ContaBancaria(double saldoInicial){
        this.balanco = saldoInicial;
    }
    public void deposito(double valor){
        this.balanco += valor;
    }
    public void retirada(double valor){
        if(valor <= balanco){
            this.balanco -= valor;
    }else{
        System.out.println("Saldo insuficiente");
        }
    }
    public double getBalanco(){
        return balanco;
    }   
}
class ContaCorrente extends ContaBancaria{
    private int contadorTransacao = 0;
    private final double TAXA = 2.50;

    public ContaCorrente(double saldoInicial){
        super(saldoInicial);
    }

    @Override
    public void retirada(double valor){
        super.retirada(valor);
        contadorTransacao++;

        if(contadorTransacao > 3){
            System.out.println("Cobrando taxa de transição");
            super.retirada(TAXA);
        }
    }
}
class ContaPoupanca extends ContaBancaria{
    private double taxaJuros;

    public ContaPoupanca(double saldoInicial, double taxa){
        super(saldoInicial);
        this.taxaJuros = taxa;
    }
    public void adicionarJuros(){
        double juros = getBalanco() * taxaJuros;
        deposito(juros);
    }
}