public class ex14{
    public static void main(String[] args){
        Animal pet = new Animal();
        Veterinario vet = new Veterinario();
        Cachorro doguinho = new Cachorro();
        Gato gatinho = new Gato();

        System.out.println("Veterinario examinando um animal qualquer: ");
        vet.examinarAnimal(pet);
        System.out.println("Veterinario examinando um cachorro: ");
        vet.examinarAnimal(doguinho);
        System.out.println("Veterinario examinando um gato: ");
        vet.examinarAnimal(gatinho);
    }
}
class Veterinario{
    public void examinarAnimal(Animal animal){
        animal.emitirSom();;
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