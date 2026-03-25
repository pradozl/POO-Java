import java.util.Scanner;

public class ex18{
    public static void main(String[] args){
        Calculadora calc = new Calculadora();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int n = sc.nextInt();
        System.out.println("Digite um número inteiro:");
        int n1 = sc.nextInt();
        System.out.println("Digite um número inteiro:");
        int n2 = sc.nextInt();
        System.out.println("Digite um número:");
        double d = sc.nextDouble();
        System.out.println("Digite um número inteiro:");
        double d1 = sc.nextDouble();

        int resultado = calc.somar(n,n1);
        System.out.println("Soma de dois inteiros: " + resultado);
        int resultado1 = calc.somar(n,n1,n2);
        System.out.println("Soma de trÊs inteiros: " + resultado1);
        double resultado2 = calc.somar(d,d1);
        System.out.println("Soma de dois numeros: " + resultado2);
        sc.close();
    }
}
class Calculadora{
    public int somar(int num, int num1){
        return num + num1;
    }
    public int somar(int num, int num1, int num2){
        return num + num1 + num2;
    }
    public double somar(double num, double num1){
        return num + num1;
    }
}