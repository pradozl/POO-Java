public class ex12{
    public static void main(String[] args){
        System.out.println("Iniciando a fabricação do carro\n");

        Carro meuCarro = new Carro();
        meuCarro.exibirPneus();
    }
}
class Pneu{
    private String marca;

    public Pneu(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
}
class Carro{
    private Pneu[] pneus = new Pneu[4];

    public Carro(){
        for(int i = 0; i < 4; i++){
            pneus[i] = new Pneu("Pirelli");
        }
        System.out.println("Carro construído e equipado com 4 Pneus");
    }

    public void exibirPneus(){
    System.out.println("Inspecionando os pneus do carro.");
    for(int i = 0; i < pneus.length; i++){
        System.out.println(" - Pneu " + (i + 1) + ": " + pneus[i].getMarca());

        }
    }
}