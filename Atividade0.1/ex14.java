import java.util.ArrayList;

public class ex14{
    public static void main(String[] args){
        Filme f = new Filme("Devoradores de Estrelas", 3.5);
        Filme f1 = new Filme("Drive", 1.25);
        Cinema cine = new Cinema("Cinemark");
        cine.adicionarSala(1);
        cine.adicionarSala(2);
        cine.getListaSalas().get(0).adicionarSessao("19:30", f);
        cine.getListaSalas().get(0).adicionarSessao("23:00", f1);
        cine.getListaSalas().get(1).adicionarSessao("16:20", f);
        
        cine.exibirProgramacao();
    }
}
class Cinema{
    private String nome;
    private ArrayList<Sala> listaSalas;

    public Cinema(String nome){
        this.nome = nome;
        this.listaSalas = new ArrayList<>();
    }
    public void adicionarSala(int numero){
        Sala sl = new Sala(numero);
        this.listaSalas.add(sl);
    }
    public ArrayList<Sala> getListaSalas(){
        return listaSalas;
    }
    public void exibirProgramacao(){
        System.out.println("------ Programação do Cinema: " + this.nome + " ------\n");
        for(Sala sala : listaSalas){
            System.out.println("\n Sala " + sala.getNum() + ":");
            if(sala.getListaSessoes().isEmpty()){
                System.out.println("Não há nenhuma sessão nesta sala");
            }else{
                for(Sessao sessao : sala.getListaSessoes()){
                    System.out.println("As: " + sessao.gethora() + " | Filme: " + sessao.getFilme().getTitulo() + " o qual possui uma duração de: " + sessao.getFilme().getDuracao() + " horas");
                }
            }
        }
        System.out.println("--------------------------------\n");
    }
}
class Sala{
    private int numero;
    private ArrayList<Sessao> listaSessoes;

    public Sala(int numero){
        this.numero = numero;
        this.listaSessoes = new ArrayList<>();
    }
    public void adicionarSessao(String horario, Filme filme){
        Sessao sess = new Sessao(horario,filme);
        this.listaSessoes.add(sess);
    }
    public int getNum(){
        return numero;
    }
    public ArrayList<Sessao> getListaSessoes(){
        return listaSessoes;
    }
}
class Sessao{
    private String horario;
    private Filme filme;

    public Sessao(String horario, Filme filme){
        this.horario = horario;
        this.filme = filme;
    }
    public String gethora(){
        return horario;
    }
    public Filme getFilme(){
        return filme;
    }
}
class Filme{
    private String titulo;
    private double duracao;

    public Filme(String titulo, double duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }
    public String getTitulo(){
        return titulo;
    }
    public double getDuracao(){
        return duracao;
    }
}