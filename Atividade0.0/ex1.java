import java.util.Scanner;

public class ex1{

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    float[] array = new float[10];
    float maior = 0;
    float menor = 0;
    System.out.println("Digite 10 números: ");
    for(int i = 0; i < array.length;i++){
        array[i] = sc.nextFloat();

        if(i == 0){
            maior = array[i];
            menor = array[i];
        }
        if(array[i] > maior){
            maior = array[i];
        }
        if(array[i] < menor){
            menor = array[i];
        }
    }
    System.out.println("O maior número é: " + maior + " o menor número é: " + menor);
    sc.close();
    }
}