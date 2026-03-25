public class ex2{
    public static void main(String[] args){
        Carro corsa = new Carro();
        Motorista motora = new Motorista();
        motora.dirigir(corsa);
    }
}
class Motorista{
    
    public void dirigir(Carro carro){
        System.out.println("Dando partida...");
        carro.ligar();
    }
}
class Carro{
    public void ligar(){
        System.out.println("Vruummnnn (ligou o carro)");
    }
}