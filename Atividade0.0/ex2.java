public class ex2{
    public static void main(String[] args){
        Carro corsa = new Carro(15.0);

        corsa.abastecerGas(20);
        corsa.dirigir(100);

        System.out.printf("Combustivel no tanque %.2f litros.%n", corsa.abastecido());
    }
}

 class Carro{
    private double tanque = 0;
    private double consumo;
    

    public Carro(double consumoInicial){
        this.consumo = consumoInicial;
        this.tanque = 0;
    }
   
    public void dirigir(double distancia){
        double combNecessario = distancia / consumo;

        if(tanque >= combNecessario){
            tanque -= combNecessario;
            System.out.println("O carro dirigiu " + distancia + "km");
        }else{
            System.out.println("Combustivel insuficiente para esta quilometragem");
        }
    }

    public void abastecerGas(double volume){
        this.tanque += volume;
        System.out.println("Foi abastecido: " + volume + "L");
    }
    
    public double abastecido(){
        return tanque;
    }
}