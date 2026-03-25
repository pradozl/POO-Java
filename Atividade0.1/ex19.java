import java.util.ArrayList;

public class ex19{
    public static void main(String[] args){
        Autor a = new Autor("Dostoievisk");
        Autor a1 = new Autor("Kafka");
        Livro l = new Livro("Memórias do Subsolo");
        Livro l1 = new Livro("Carta ao Pai");
        
        a1.adicionarLivro(l);
        l1.adicionarAutor(a);
        a1.adicionarLivro(l1);

        a.exibirLivrosdoAutor();
        l.exibirAutoresDoLivro();
    }
}
class Autor{
    private String nome;
    private ArrayList<Livro> listaLivro;

    public Autor(String nome){
        this.nome = nome;
        this.listaLivro = new ArrayList<>();
    }
    public void adicionarLivro(Livro l){
        if(!this.listaLivro.contains(l)){
            this.listaLivro.add(l);
            l.adicionarAutor(this);
        }
    }
    public String getNome(){
        return nome;
    }
    public void exibirLivrosdoAutor(){
        System.out.println("Livros de: " + this.nome);
        if(this.listaLivro.isEmpty()){
            System.out.println("Não há nenhum livro cadastrado.");
        }else{
            for(Livro l : listaLivro){
                System.out.println("  - " + l.getNomeLivro());
            }
        }
        System.out.println("--------------\n");
    }
}
class Livro{
    private String nomeLivro;
    private ArrayList<Autor> listaAutores;

    public Livro(String nomeLivro){
        this.nomeLivro = nomeLivro;
        this.listaAutores = new ArrayList<>();
    }
    public void adicionarAutor(Autor a){
        if(!this.listaAutores.contains(a)){
            this.listaAutores.add(a);
            a.adicionarLivro(this);
        }
    }
    public String getNomeLivro(){
        return nomeLivro;
    }
    public void exibirAutoresDoLivro(){
        System.out.println("Autores de: " + this.nomeLivro);
        if(this.listaAutores.isEmpty()){
            System.out.println("Não há nenhum autor cadastrado.");
        }else{
            for(Autor a : listaAutores){
                System.out.println("  - " + a.getNome());
            }
        }
        System.out.println("--------------\n");
    }
}