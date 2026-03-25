public class ex19{
    public static void main(String[] args){
        Animal pet = new Animal();
        Cachorro doguinho = new Cachorro("Bidu");
        Gato gatinho = new Gato("Garfield");
        System.out.println("Um animal qualquer faz:");
        pet.emitirSom();
        System.out.println("0 " + doguinho.getNome() + " (cachorro) faz o seguinte som:");
        doguinho.emitirSom();
        System.out.println("O " + gatinho.getNome() + " (gato) faz o seguinte som:");
        gatinho.emitirSom();
    }
}
class Animal{
    protected String nome;
    public String getNome(){
        return nome;
    }
    public void emitirSom(){
        System.out.println("Som de animal");
    }
}
class Cachorro extends Animal{
    public Cachorro(String nome){
        this.nome = nome;
    }
    @Override
    public void emitirSom(){
        System.out.println("AUAUAUAUAAUUAUUAUAUAAUAUAUAUAAU");
    }
}
class Gato extends Animal{
    public Gato(String nome){
        this.nome = nome;
    }
    @Override
    public void emitirSom(){
        System.out.println("MIAAAAAAAAAAAAAAAAAAUUUUUUUUUUUUUUU");
    }
}