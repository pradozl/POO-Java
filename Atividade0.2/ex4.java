import java.util.ArrayList;

public class ex4{
    public static void main(String[] args){
        Casa home = new Casa();
        System.out.println("Essa casa possui: " + home.listaQuarto.size() + " quartos");
    }
}
class Casa{
    ArrayList<Quarto> listaQuarto;

    public Casa(){
        listaQuarto = new ArrayList<>();
        Quarto quar = new Quarto("Suite");
        Quarto quar1 = new Quarto("Quarto de visita");
        this.listaQuarto.add(quar);
        this.listaQuarto.add(quar1);
    }
}
class Quarto{
    private String nome;
    
    public Quarto(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}