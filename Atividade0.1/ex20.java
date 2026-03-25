import java.util.ArrayList;

public class ex20{
    public static void main(String[] args){
        Biblioteca bibl = new Biblioteca("Biblioteca Dom Pedro II");
        bibl.determinaEndereco("Rua Orlavo Lemes", "Jardim das Folhas");
        Livro liv = new Livro("Noites Brancas", "Dostoievski", "B12");
        bibl.adicionarLivro(liv);
        Livro liv1 = new Livro("A morte de Ivan Llitch", "Tolstói", "C13");
        bibl.adicionarLivro(liv1);
        Livro liv2 = new Livro("A Metamorfose", "Kafka", "D19");
        bibl.adicionarLivro(liv2);

        bibl.listarLivros();
    }
}
class Biblioteca{
    private ArrayList<Livro> listaLivros;
    private String nomeBibli;
    private Endereco endereco;

    public Biblioteca(String nomeBibli){
        this.nomeBibli = nomeBibli;
        this.listaLivros = new ArrayList<>();
    }
    // EXPLICAÇÃO COMPOSIÇÃO:
    // O Endereco é criado dentro da Biblioteca. Se a Biblioteca for destruída,
    // o endereço some junto, pois não faz sentido um endereço de uma biblioteca que não existe.
    public void determinaEndereco(String rua, String bairro){
        this.endereco = new Endereco(rua, bairro);
    }
    // EXPLICAÇÃO AGREGAÇÃO:
    // O Livro é criado fora (na main) e apenas "adicionado" aqui.
    // Se a Biblioteca fechar, os livros continuam existindo e podem ir para outra biblioteca.
    public void adicionarLivro(Livro l){
        listaLivros.add(l);
    }
    public void listarLivros(){
        System.out.println("\n ---- Livros da Biblioteca " + this.nomeBibli + " ----\n");
        if(this.endereco != null){
            System.out.println("Localizada em: " + this.endereco.getRua() + ", " + this.endereco.getBairro() + "\n");
        }else{
            System.out.println("Endereço não informado.");
        }
        for(Livro l : listaLivros){
            System.out.println("Nome do Livro: " + l.getNomeLivro() + " o autor desse livro é o(a): " + l.getAutor() + " e esta no setor: " + l.getSetor());
        }
    }
}
class Endereco{
    private String rua;
    private String bairro;

    public Endereco(String rua, String bairro){
        this.rua = rua;
        this.bairro = bairro;
    }
    public String getRua(){
        return rua;
    }
    public String getBairro(){
        return bairro;
    }
}
class Livro{
    private String nomeLivro;
    private String autor;
    private String setor;

    public Livro(String nomeLivro, String autor, String setor){
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.setor = setor;
    }
    public String getNomeLivro(){
        return nomeLivro;
    }
    public String getAutor(){
        return autor;
    }
    public String getSetor(){
        return setor;
    }
}