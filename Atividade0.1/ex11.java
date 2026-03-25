public class ex11{
    public static void main(String[] args){
        Lamparina opc = new Lamparina(false);
        opc.ligar();
        opc.observar();
    }
}
class Lamparina{
    private boolean ligada;

    public Lamparina(boolean ligada){
        this.ligada = ligada;
    }
    public void ligar(){
        this.ligada = true;
    }
    public void desligar(){
        this.ligada = false;
    }
    public boolean estaLigada(){
        return this.ligada;
    }
    public void observar(){
        if(this.ligada){
            System.out.println("A lâmpada esta ligada jefersons!");
        }else{
            System.out.println("A lâmpada esta desligada flinstons!");
        }
    }
}