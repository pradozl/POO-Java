import java.util.ArrayList;
import java.util.Scanner;

public class ex10{
    public static void main(String[] args){
        ArrayList<Livro> listaLivro = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

    for(int i = 0; i < 2;i++){
        Livro lv = new Livro("", "", 0);
        System.out.println("Qual o nome do Livro?");
        lv.setTitulo(sc.nextLine());
        System.out.println("Qual o autor do Livro?");
        lv.setAutor(sc.nextLine());
        System.out.println("Qual o ano de publicação do Livro?");
        lv.setData(sc.nextInt());
        sc.nextLine();

        listaLivro.add(lv);
    }
        for(Livro lv : listaLivro){
            System.out.println("O livro: " + lv.getTitulo() + " do autor: " + lv.getAutor() + " foi lançado em: " + lv.getData());
        }
        sc.close();
    }
}

class Livro{
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
    }
    public String getTitulo(){
    return titulo;
    }
    public String getAutor(){
    return autor;
    }
    public int getData(){
    return anoPublicacao;
    }
    public void setTitulo(String titulo){
    this.titulo = titulo;
    }
    public void setAutor(String autor){
    this.autor = autor;
    }
    public void setData(int anoPublicacao){
    this.anoPublicacao = anoPublicacao;
    }
}