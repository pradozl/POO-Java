import java.util.ArrayList;

public class ex17{
    public static void main(String[] args){
        Loja minhaLoja = new Loja();

        Cliente c1 = new Cliente("João", 20.0);
        Cliente c2 = new Cliente("Ronaldo", 30.0);
        Cliente c3 = new Cliente("Roger", 60.0);
        Cliente c4 = new Cliente("Pedro", 80.0);
        Cliente c5 = new Cliente("Flavia", 10.0);

        minhaLoja.adicionarCliente(c1);
        minhaLoja.adicionarCliente(c2);
        minhaLoja.adicionarCliente(c3);
        minhaLoja.adicionarCliente(c4);
        minhaLoja.adicionarCliente(c5);

        String melhor = minhaLoja.getNomedoMelhorCliente();
        System.out.println("O melhor cliente da lojinha foi o: " + melhor);
    }
}
class Loja{
    private ArrayList<Cliente> ListaDeCliente = new ArrayList<>();

    public String getNomedoMelhorCliente(){
        
    double maior = 0;
    String maiorNome = "";

        for(int i = 0; i < ListaDeCliente.size(); i++){
            Cliente clienteAtual = ListaDeCliente.get(i);

            if(i == 0){
                maior = clienteAtual.getValorTotalGasto();
                maiorNome = clienteAtual.getNome();
            }else{

            if(clienteAtual.getValorTotalGasto() > maior){
                maior = clienteAtual.getValorTotalGasto();
                maiorNome = clienteAtual.getNome();
            }
        }
    }
        return maiorNome;
    }

    public void adicionarCliente(Cliente novoCliente){
        ListaDeCliente.add(novoCliente);
    }
}
class Cliente{
     private String nome;
    private Double valorGasto;

    public Cliente(String nome, double valorGasto){
        this.nome = nome;
        this.valorGasto = valorGasto;
    }

    public  String getNome(){
        return this.nome;
    }
    public Double getValorTotalGasto(){
        return this.valorGasto;
    }
}


    