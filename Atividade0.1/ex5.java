import java.util.Scanner;

public class ex5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calcula calculo = new Calcula();

        int x, y;
        double w, z;
        double[] array = new double[2];

        System.out.println("Qual número inteiro deseja somar?: ");
        x = sc.nextInt();
        System.out.println("Qual número inteiro deseja somar?: ");
        y = sc.nextInt();

        System.out.println("Qual número decimal deseja somar?: ");
        w = sc.nextDouble();
        System.out.println("Qual número decimal deseja somar?: ");
        z = sc.nextDouble();

        System.out.println("Quais número farão parte do seu array de soma?: ");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextDouble();
        }

        System.out.println("Soma Inteiros: " + calculo.somar(x, y));
        System.out.println("Soma Decimais: " + calculo.somar(w, z));
        System.out.println("Soma Array: " + calculo.somar(array));
        
        sc.close();
    }
}
class Calcula {
    public int somar(int x, int y){
        return x + y;
    }
    public double somar(double w, double z){
        return w + z;
    }
    public double somar(double[] array){
        double total = 0;

        for(double numero : array){
            total += numero;
        }
        return total;
    }
}