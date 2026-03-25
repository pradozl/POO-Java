import java.util.ArrayList;

public class ex1{
    public static void main(String[] args){
        Equipe eq = new Equipe("Águia");
        Jogador j = new Jogador("Ronaldo");
        Jogador j1 = new Jogador("Roberta");
        Jogador j2 = new Jogador("Cleber");
        eq.adicionarJogador(j);
        eq.adicionarJogador(j1);
        eq.adicionarJogador(j2);
        
        System.out.println("A equipe: " + eq.getTime() + " possui os seguintes jogadores:\n");
        eq.listar();
        

    }
}
class Equipe{
    private String time;
    ArrayList<Jogador> listaJogador;

    public Equipe(String time){
        this.time = time;
        listaJogador = new ArrayList<>();
    }
    public void adicionarJogador(Jogador j){
        listaJogador.add(j);
    }
    public void listar(){
        if(listaJogador.isEmpty()){
            System.out.println("Não existe jogadores nessa equipe");
        }else{
            for(Jogador j : listaJogador){
                System.out.println(" - " + j.getNome() + "\n");
            }
        }
    }
    public String getTime(){
        return time;
    }
}
class Jogador{
    private String nome;

    public Jogador(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}