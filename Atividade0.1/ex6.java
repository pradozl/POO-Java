import java.util.ArrayList;

public class ex6{
    public static void main(String[] args){
    Pedido novoPedido = new Pedido();
    
    novoPedido.adicionarItem("Bola" , 129);
    novoPedido.adicionarItem("Rede", 892);

    novoPedido.exibirPedidos();
    }
}
class Pedido{
    private ArrayList<Item> ListaItemPedido;

    public Pedido(){
        this.ListaItemPedido = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco){
        Item novoItem = new Item(nome, preco);
        this.ListaItemPedido.add(novoItem);
    }

    public void exibirPedidos(){
        System.out.println("\n ----- Pedidos ----- \n");
        for(Item item : ListaItemPedido){
            System.out.println("Item: " + item.getNome() + " Preço: " + item.getPreco());
        }
    }
}
class Item{
    private String nome;
    private double preco;

    public Item(String nome, double preco){
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
