public class ex16{
    public static void main(String[] args){
        Produto p1 = new Produto("Teclado Magnético", 250);
        System.out.println("Produto: " + p1.getNome());
        System.out.println("Preço: R$" + p1.getPreco());
    }
}
class Produto{
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
}