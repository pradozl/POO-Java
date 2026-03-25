import java.util.ArrayList;

public class ex13{
    public static void main(String[] args){
        Pedido novoPedido = new Pedido();
    
        novoPedido.adicionarItem("Bola" , 30.87, 2);
        novoPedido.adicionarItem("Rede", 120.32, 3);
        novoPedido.exibirPedidos();
    }
}
class Pedido{
    private ArrayList<Item> ListaItemPedido;

    public Pedido(){
        this.ListaItemPedido = new ArrayList<>();
    }
    public void adicionarItem(String nome, double precoUnitario, int quantidade){
        Item novoItem = new Item(nome, precoUnitario, quantidade);
        this.ListaItemPedido.add(novoItem);
    }
    public double calcularTotal(){
        double total = 0.0;

        for(Item item : ListaItemPedido){
            total += (item.getPrecoUnitario() * item.getQuantidade());
        }
        return total;
    }
    public void exibirPedidos(){
        System.out.println("\n ----- Pedidos ----- \n");
        for(Item item : ListaItemPedido){
            System.out.println("Item: " + item.getNome() + " Qtd: " + item.getQuantidade() + " Preço: R$" + item.getPrecoUnitario());
        }
        System.out.println("----------\n");
        System.out.println("O preço total é: R$" + calcularTotal());
    }
}
class Item{
    private String nome;
    private double precoUnitario;
    private int quantidade;

    public Item(String nome, double precoUnitario, int quantidade){
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }
    public String getNome(){
        return nome;
    }
    public double getPrecoUnitario(){
        return precoUnitario;
    }
    public int getQuantidade(){
        return quantidade;
    }
}
