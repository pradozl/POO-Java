import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 
public class ex11{
    public static void main(String[] args){
        Usuario prado = new Usuario("Prado");
        Usuario joao = new Usuario("João");
        Usuario mari = new Usuario("Maria");

        prado.criarPost("Opa pessoal! Iniciando aqui um projeto em Java, bora que bora");
        prado.criarPost("Sempre pra frente");

        prado.getPost().get(0).Curtir(joao);
        prado.getPost().get(0).Curtir(mari);
        
        prado.getPost().get(1).Curtir(joao);

        prado.exibirFeed();
    }
}
class Usuario{
    private String nome;
    private ArrayList<Postagem> listaPost;

    public Usuario(String nome){
        this.nome = nome;
        this.listaPost = new ArrayList<>();
    }
    public String getNome(){
        return nome;
    }
    public ArrayList<Postagem> getPost(){
        return listaPost;
    }
    public void criarPost(String texto){
        Postagem novoPost = new Postagem(texto);
        this.listaPost.add(novoPost);
    }
    public void exibirFeed(){
        System.out.println("Feed de: " + this.nome);
        if(listaPost.isEmpty()){
            System.out.println("Não há nenhuma postagem");
            return;
        }
        for(Postagem p: listaPost){
            System.out.println(p.toString());
        }
        System.out.println("---------------------------");
    }
}
class Postagem{
    private String texto;
    private LocalDateTime timestamp;
    private ArrayList<Like> listaLike;

    public Postagem(String texto){
        this.texto = texto;
        this.timestamp = LocalDateTime.now();
        this.listaLike = new ArrayList<>();
    }
    public void Curtir(Usuario quemCurtiu){
        Like novaCurtida = new Like(quemCurtiu);
        this.listaLike.add(novaCurtida);
    }

    @Override
    public String toString(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataFormatada = timestamp.format(formatador);

        return "[" + dataFormatada + "] " + texto + "\n" + listaLike.size() + " Likes\n";
    }
}
class Like{
    private Usuario pessoa;

    public Like(Usuario pessoa){
        this.pessoa = pessoa;
    }
    public Usuario getPessoa() {
        return this.pessoa;
    }
}