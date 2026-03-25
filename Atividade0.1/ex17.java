import java.util.ArrayList;

public class ex17{
    public static void main(String[] args){
        Equipe guris = new Equipe("Falcão");
        Membro m1 = new Membro("João");
        Membro m2 = new Membro("Flavio");
        Membro m3 = new Membro("Clovis");
        Membro m4 = new Membro("Jhonny");
        Membro m5 = new Membro("Fernanda");
        Membro m6 = new Membro("Teste de Erro");

        guris.adicionarMembro(m1);
        guris.validar();
        guris.adicionarMembro(m2);
        guris.validar();
        guris.adicionarMembro(m3);
        guris.adicionarMembro(m4);
        guris.adicionarMembro(m5);
        guris.adicionarMembro(m6);
    }
}
class Equipe{
    private String nomeEquipe;
    private ArrayList<Membro> time;

    public Equipe(String nome){
        this.nomeEquipe = nome;
        this.time = new ArrayList<>();
    }

    public void adicionarMembro(Membro m){
        if(this.time.size() < 5){
            this.time.add(m);
            System.out.println(m.getNome() + " foi adicionado ao time" + nomeEquipe);
        }else{
            System.out.println("Erro: O time " + nomeEquipe + " já está cheio!");
        }
    }
    public void validar(){
        if(this.time.size() < 2){
            System.out.println("Aviso: Este time ainda é inválido, está faltando membros!\n");
        }else{
            System.out.println("Equipe completa e válida com " + time.size() + " membros\n");
        }
    }
}
class Membro{
    private String nome;
    
    public Membro(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}