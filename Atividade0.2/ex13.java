import java.util.Random;

public class ex13{
    public static void main(String[] args){
        Carnivore trex = new Carnivore();
        Herbivore triceratops = new Herbivore();

        try{
            System.out.println("Teste de exame no T-Rex");
            trex.realizarExame();
            System.out.println("Liberado.\n");
        }catch(DinosaurIllException e){
            System.out.println("Log de Emergencia: " + e.getMessage() + "\n");
        }

        try{
            System.out.println("Teste de exame no Triceratops");
            triceratops.realizarExame();
            System.out.println("Liberado.\n");
        }catch(DinosaurIllException e){
            System.out.println("Log de emergencia: " + e.getMessage() + "\n");
        }
    }
}
interface Tratavel{
    abstract void realizarExame() throws DinosaurIllException;
}
class DinosaurIllException extends Exception{
    public DinosaurIllException(String mensagem){
        super(mensagem);
    }
}
abstract class Dinosaur implements Tratavel{

    int saude;

    public Dinosaur(){
        Random gerador = new Random();
        this.saude = gerador.nextInt(101);
    }
}
class Carnivore extends Dinosaur{

    int baixa = 50;

    @Override
    public void realizarExame() throws DinosaurIllException{
        System.out.println("Nivel de saude: " + this.saude);
        if(saude <= baixa){
            throw new DinosaurIllException("O Carnivoro está doente, isolem a área.");
        }
    }
}
class Herbivore extends Dinosaur{

    int baixa = 50;

    @Override
    public void realizarExame() throws DinosaurIllException{
        System.out.println("Nivel de saude: " + this.saude);
        if(saude <= baixa){
            throw new DinosaurIllException("O Herbivoro está passando mal, chamem a equipe médica.");
        }
    }
}