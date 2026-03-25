public class ex6{
    public static void main(String[] args){
    String frase = "Opa, tudo bem? Da uma passada aqui rapidão depois.";
    String novafrase = frase.replaceAll("[aeiouéã]", "_");
    String novanovafrase = novafrase.replaceAll("[,.?]", "");


    System.out.println(novafrase);
    System.out.println(novanovafrase);
    }
}