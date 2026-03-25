import java.util.Scanner;

public class ex9{
    public static void main(String[] args){

        Carro car = new Carro();
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a velocidade do carro neste momento?: ");
        double velo = sc.nextDouble();
        car.setVelocidade(velo);

        sc.nextLine();

        System.out.println("Qual a marca deste carro?: ");
        String marca = sc.nextLine();
        car.setMarca(marca);
        System.out.println("Qual o modelo deste carro?: ");
        String mod = sc.nextLine();
        car.setModelo(mod);

        System.out.println("Quanto você quer acelerar?: ");
        int quanto = sc.nextInt();
        car.acelerar(quanto);

        car.exibirPainel();
        sc.close();
    }
}
class Carro{
    private String marca;
    private String modelo;
    private double velocidadeAtual;

    public Carro(){
    }
    public Carro(String marca, String modelo, double velocidadeAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
    }
    public double getVelocidadeAtual(){
        return velocidadeAtual;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setVelocidade(double velo){
        this.velocidadeAtual = velo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String mod){
        this.modelo = mod;
    }
    public void acelerar(int incremento){
        this.velocidadeAtual += incremento;
    }
    public void exibirPainel(){
    System.out.println("\n===== PAINEL DO VEÍCULO =====");
    System.out.println("Marca: " + this.marca);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Velocidade Atual: " + this.velocidadeAtual + " km/h");
    System.out.println("=============================");
    }
}