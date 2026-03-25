import java.util.ArrayList;

public class ex10{
    public static void main(String[] args){
        Produto p1 = new Produto("Teclado Mecânico x37", 125, 4);
        Produto p2 = new Produto("Faca", 580, 2);
        Cliente cliente = new Cliente("Gabriel Silva Cunha", "111.222.333-44");
        Pedido carrinho = new Pedido(cliente);
        carrinho.adicionarItens(p1,1);
        carrinho.adicionarItens(p2, 2);

        System.out.println("Estoque antes da Compra\n");
        System.out.println(p1.getNomeProd() + ":" + p1.getEstoque() + " unidades");
        System.out.println(p2.getNomeProd() + ":" + p2.getEstoque() + " unidades\n");
        carrinho.fecharPedido();
        System.out.println("Estoque depois da Compra\n");
        System.out.println(p1.getNomeProd() + ":" + p1.getEstoque() + " unidades");
        System.out.println(p2.getNomeProd() + ":" + p2.getEstoque() + " unidades\n");
        
    }   
}
class Cliente{
    private String nome;
    private String CPF;
    private ArrayList<Pedido> listaPedido;

    public Cliente(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
        this.listaPedido = new ArrayList<>();
    }
    public void adicionarPedido(Cliente cliente){
        Pedido pedido = new Pedido(cliente);
        this.listaPedido.add(pedido);
    }
    public String getNome(){
        return nome;
    }
    public String getCPF(){
        return CPF;
    }
}
class Produto{
    private String nomeProd;
    private double preco;
    private int estoque;

    public Produto(String nomeProd, double preco, int estoque){
        this.nomeProd = nomeProd;
        this.preco = preco;
        this.estoque = estoque;
    }
    public String getNomeProd(){
        return nomeProd;
    }
    public double getPreco(){
        return preco;
    }
    public int getEstoque(){
        return estoque;
    }
    public void subtrairEstoque(int quantidade){
        this.estoque -= quantidade;
    }
}
class Pedido{
    private Cliente cliente;
    private ArrayList<ItemPedido> listaItens;

    public Pedido(Cliente cliente){
        this.cliente = cliente;
        this.listaItens = new ArrayList<>();
    }
    public void adicionarItens(Produto produto, int quantidade){
        ItemPedido itens = new ItemPedido(produto, quantidade);
        this.listaItens.add(itens);
    }
    public void fecharPedido(){
        System.out.println("Concluindo pedido do Cliente: " + cliente.getNome());
        for(ItemPedido i : listaItens){
            Produto prod = i.getProduto();
            int qtdDesejada = i.getQuantia();

            if(prod.getEstoque() >= qtdDesejada){
                prod.subtrairEstoque(qtdDesejada);
                System.out.println("Foi adicionado: " + qtdDesejada + "x " + prod.getNomeProd() + " ao seu carrinho.");
            }else{
                System.out.println("Não há produtos suficientes no estoque para esta compra.");
            }
        }
        System.out.println("------------------------\n");
    }
}
class ItemPedido{
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public Produto getProduto(){
        return produto;
    }
    public int getQuantia(){
        return quantidade;
    }
}