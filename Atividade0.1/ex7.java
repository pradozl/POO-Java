public class ex7{
    public static void main(String[] args){
        Processador meuProc = new Processador("Ryzen 7", "AMD");
        MemoriaRAM minhaRAM = new MemoriaRAM(16, "Corsair");
        Computador meuPC = new Computador("Computador Gamer Pro", "Kabuum", meuProc, minhaRAM);
        System.out.println("PC: " + meuPC.getNomeComputador());
        System.out.println("Processador: " + meuPC.getProcessador().getModelo());
        System.out.println("Memória RAM: " + meuPC.getMemoria().getGigas() + "GB");
    }
}
class Computador{
    private String nomeComputador;
    private String marca;
    private Processador processador;
    private MemoriaRAM memoria;

    public Computador(String nomeComputador, String marca, Processador processador, MemoriaRAM memoria){
        this.nomeComputador = nomeComputador;
        this.marca = marca;
        this.processador = processador;
        this.memoria = memoria;
    }
    public String getNomeComputador(){
        return nomeComputador;
    }
    public String getMarca(){
        return marca;
    }
    public Processador getProcessador(){
        return processador;
    }
    public MemoriaRAM getMemoria(){
        return memoria;
    }
}
class Processador{
    private String modelo;
    private String marca;
    
    public Processador(String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getMarca(){
        return marca;
    }
}
class MemoriaRAM{
    private int gigas;
    private String marca;

    public MemoriaRAM(int gigas, String marca){
        this.gigas = gigas;
        this.marca = marca;
    }
    public int getGigas(){
        return gigas;
    }
    public String getMarca(){
        return marca;
    }
}