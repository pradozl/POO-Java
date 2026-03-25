import java.util.ArrayList;
import java.util.List;

public  class ex7{
    public static void main(String[] args){
        MaquinaV maquina = new MaquinaV();
        
        maquina.abastecer(new Produto("Coca-Cola", 5.00));
        maquina.abastecer(new Produto("Monster", 15.00));
        maquina.inserirMoeda(new Moeda(5.00));
        maquina.inserirMoeda(new Moeda(20.00));
        maquina.comprar("Monster");
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
class Moeda{
    private double valor;

    public Moeda(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return valor;
    }
}
class MaquinaV{
    private List<Produto> estoque = new ArrayList<>();
    private List<Moeda> caixa = new ArrayList<>();
    private double saldoInserido = 0;

    public void abastecer(Produto p){
        estoque.add(p);
    }
    public void inserirMoeda(Moeda m){
        this.caixa.add(m);
        this.saldoInserido += m.getValor();
        System.out.println("Saldo atual: R$ " + saldoInserido);
    }
    public void comprar(String nomeProduto){
        for (Produto p: estoque){
            if(p.getNome().equalsIgnoreCase(nomeProduto)){
                if(saldoInserido >= p.getPreco()){
                    double troco = saldoInserido - p.getPreco();
                    System.out.println("Vendendo " + p.getNome());
                    darTroco(troco);
                    estoque.remove(p);
                    saldoInserido = 0;
                    return;
                }else{
                    System.out.println("Saldo insuficiente");
                    return;
                }
            }
        }
        System.out.println("Produto não encontrado");
    }
    private void darTroco(double valor){
        if(valor > 0){
            System.out.printf("Dando troco R$ %.2f %n", valor);
        }
    }
}