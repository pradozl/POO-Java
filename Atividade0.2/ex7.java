public class ex7{
    public static void main(String[] args){
        Animal pet = new Animal();
        Cachorro doguinho = new Cachorro();
        Gato gatinho = new Gato();
        System.out.println("Um animal qualquer faz:");
        pet.emitirSom();
        System.out.println("Um cachorro faz o seguinte som:");
        doguinho.emitirSom();
        System.out.println("Um gato faz o seguinte som:");
        gatinho.emitirSom();
    }
}
class Animal{
    public void emitirSom(){
        System.out.println("Som de animal");
    }
}
class Cachorro extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("AUAUAUAUAAUUAUUAUAUAAUAUAUAUAAU");
    }
}
class Gato extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("MIAAAAAAAAAAAAAAAAAAUUUUUUUUUUUUUUU");
    }
}