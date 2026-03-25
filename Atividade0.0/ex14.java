import java.util.ArrayList;
import java.util.Iterator;

public class ex14{
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("Sol");
        palavras.add("Carro");
        palavras.add("Pão");
        palavras.add("Computador");
        palavras.add("Dia");
        palavras.add("Java");

        System.out.println("Lista Original: " + palavras);
        removerPalavrasCurtas(palavras);
        System.out.println("Lista Filtrada: " + palavras);
    }
    public static void removerPalavrasCurtas(ArrayList<String> lista){
        Iterator<String> inspetor = lista.iterator();
        while (inspetor.hasNext()) {
            String palavraAtual = inspetor.next();
            if (palavraAtual.length() < 4) {
                inspetor.remove(); 
            }
        }
    }
}