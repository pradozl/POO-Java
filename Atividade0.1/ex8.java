import java.util.Scanner;

public class ex8{
    public static void main(String[] args) {
        ContaBancaria teste = new ContaBancaria(0, null);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Titular: ");
        String titulo = sc.nextLine();
        teste.setTitular(titulo);
        System.out.println("Digite o saldo da conta: ");
        double valor = sc.nextDouble();
        teste.setSaldo(valor);

        System.out.println("O titular: " + teste.getTitular() + " possui em sua conta o seguinte saldo: " + teste.getSaldo());

        sc.close();
    }
}
class ContaBancaria{
    private double saldo;
    private String titular;

    public ContaBancaria(){
    }
    public ContaBancaria(double saldo, String titular){
        this.saldo = saldo;
        this.titular = titular;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getTitular(){
        return titular;
    }
    public void setSaldo(double valor){
        if(valor >= 0){
            this.saldo = valor;
        }else{
            System.out.println("Não é permitido valores negativos!");
        }
    }
    public void setTitular(String titulo){
        this.titular = titulo;
    }
}