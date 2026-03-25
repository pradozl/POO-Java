public class ex3{
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria("Eduardo Pontes");
        conta.depositar(500);
        System.out.println("O saldo da conta de: " + conta.getTitular() + " esta em: R$ " + conta.getSaldo());
    }
}

class ContaBancaria{
    private String titular;
    private double saldo;

    public ContaBancaria(String nomeTitular){
        this.titular = nomeTitular;
        this.saldo = 0;
    }
    public void depositar(double valor){
        if(valor <= 0 ){
            System.out.println("Valor insuficiente para deposito");
        }else{
            this.saldo += valor;
            System.out.println("O deposito de: R$ " + valor + " foi realizado com sucesso");
        }
    }
    public void sacar(double valor){
        if(valor > this.saldo){
            System.out.println("Não há saldo suficiente para saque");
        }else{
            this.saldo -= valor;
            System.out.println("O saque de: R$ " + valor + " foi realizado com sucesso");
        }
    }
    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return this.saldo;
    }
}