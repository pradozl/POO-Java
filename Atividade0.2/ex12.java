public class ex12{
    public static void main(String[] args){

    int[] array = new int[3];

    try{
        System.out.println(array[5]);
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Opa amigão, você tentou acessar uma posição que não existe, toma cuidado.");
    }
}
}