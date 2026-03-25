import java.util.ArrayList;

public class ex3{
    public static void main(String[] args){
        Endereco endCliente = new Endereco("Setor Bueno R. T-31", "Goiania");
        Fatura minhaFatura = new Fatura(endCliente);
        Produto notebook = new Produto("Notebook Dell Inspiron 15", 5000.00);
        Produto mouse = new Produto("Mouse Óptico Logitech", 125.86);
        Produto teclado = new Produto("Teclado Mecânico Redragon", 325.00);

        minhaFatura.adciona(notebook,1);
        minhaFatura.adciona(mouse, 3);
        minhaFatura.adciona(teclado, 4);
        
        System.out.println(minhaFatura.formata());
    }
}

class Fatura{
    private ArrayList<ItemDeLinha> listaDeItens = new ArrayList<>();
    private Endereco endereco;

    public void adciona(Produto produto, int quantidade){
        ItemDeLinha novoItem = new ItemDeLinha(produto, quantidade);
        this.listaDeItens.add(novoItem);
    }
    public String formata(){
        String cupom = "========= CUPOM FISCAL =========\n";
        cupom = cupom + "Entrega " + endereco.getRua() + " - " + endereco.getCidade() + "\n";
        cupom = cupom + "-------------------\n";

        for(int i = 0; i < listaDeItens.size(); i++){
            ItemDeLinha item = listaDeItens.get(i);

            cupom = cupom + item.getQuantidade() + "x " + item.getProduto().getDescricao() + " ..... R$ " + item.getPrecoTotal() + "\n";
        }

        cupom = cupom + "----------------------\n";
        cupom = cupom + "TOTAL A PAGAR: R$ " + calcularFaturaTotal() + "\n";

        return cupom;
    }

    public double calcularFaturaTotal(){
        double valorTotal = 0;

        for(int i = 0; i < listaDeItens.size(); i++){
            ItemDeLinha itemAtual = listaDeItens.get(i);
            valorTotal = valorTotal + itemAtual.getPrecoTotal();
        }
        return valorTotal;
    }
    public Fatura(Endereco endereco){
        this.endereco = endereco;
    }
    public void adicionarItem(ItemDeLinha novoItem){
        this.listaDeItens.add(novoItem);
    }
}

class Endereco{
    private String rua;
    private String cidade;

    public Endereco(String rua, String cidade){
        this.rua = rua;
        this.cidade = cidade;
    }
    public String getRua(){
        return rua;
    }
    public String getCidade(){
        return cidade;
    }
}

class ItemDeLinha{
    private int quantidade;
    private Produto produto;

    public double getPrecoTotal(){
        return quantidade * produto.getPreco();
    }   

    public ItemDeLinha(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public Produto getProduto(){
        return produto;
    }
}

class Produto{
    private String descricao;
    private double preco;

    public Produto(String descricao, double preco){
        this.descricao = descricao;
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }
    public String getDescricao(){
        return descricao;
    }
}
