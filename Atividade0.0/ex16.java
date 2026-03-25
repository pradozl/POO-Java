interface Mensuravel {
    double getMedida();
}
class ContaBancaria2 implements Mensuravel {
    private double balanco;

    public ContaBancaria2(double balanco) {
        this.balanco = balanco;
    }
    @Override
    public double getMedida() {
        return this.balanco;
    }
}
class Pais implements Mensuravel {
    private String nome;
    private double populacao;

    public Pais(String nome, double populacao) {
        this.nome = nome;
        this.populacao = populacao;
    }
    public String getNome(){
        return nome;
    }
    @Override
    public double getMedida() {
        return this.populacao;
    }
}
public class ex16{
    public static double getMedia(Mensuravel[] objects) {
        if (objects.length == 0) return 0;

        double soma = 0;
        
        for (Mensuravel m : objects) {
            soma += m.getMedida();
        }
        
        return soma / objects.length;
    }

    public static void main(String[] args) {
        
        System.out.println("=== TESTE COM CONTAS BANCÁRIAS ===");
        ContaBancaria2[] contas = new ContaBancaria2[3];
        
        contas[0] = new ContaBancaria2(1000.0);
        contas[1] = new ContaBancaria2(2000.0);
        contas[2] = new ContaBancaria2(3000.0);
        
        System.out.println("Média dos saldos: R$ " + getMedia(contas));


        System.out.println("\n=== TESTE COM PAÍSES ===");
    
        Pais[] paises = new Pais[2];
        
        paises[0] = new Pais("Brasil", 214.3);
        paises[1] = new Pais("Argentina", 45.8);
        
        System.out.println("Média das populações: " + getMedia(paises) + " milhões");
    }
}