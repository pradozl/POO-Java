public class ex20{
    public static void main(String[] args){
        Animal pet = new Cachorro();
        Cachorro doguinho = new Cachorro();
        Gato gatinho = new Gato();
        
        if(pet instanceof Cachorro){
            Cachorro dog = (Cachorro) pet;
            dog.buscarBolinha();
        }else{
            System.out.println("Esse pet não sabe buscar bolinha");
        }
        

    }
}
class Animal{
    public void emitirSom(){
        System.out.println("Som de animal");
    }
}
class Cachorro extends Animal{
    public void buscarBolinha(){
        System.out.println("A bolinha foi devolvida");
    }
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