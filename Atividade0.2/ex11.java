import java.util.ArrayList;

public class ex11{
    public static void main(String[] args){
        Enclosure localTrex = new Enclosure();
        localTrex.nivelSegurança = 5;

        Carnivore trex = new Carnivore();
        trex.nome = "rex";
        trex.saude = 51;
        
        localTrex.adicionarDinossauro(trex);

        try{
            System.out.println("Teste de segurança do local");
            localTrex.checarSegurança();
        }catch(EnclosureBreachedException e){
            System.out.println("Log de emergencia: " + e.getMessage() + "\n");
        }

        System.out.println("---------------------------\n");

        try{
            System.out.println("Teste de saude do dinossauro");
            trex.realizarExame();
        }catch(DinosaurIllException e){
            System.out.println("Log de emergencia: " + e.getMessage());
        }

        trex.alimentar();
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
class EnclosureBreachedException extends Exception{
    public EnclosureBreachedException(String mensagem){
        super(mensagem);
    }
}
class Enclosure{
    public int nivelSegurança;
    ArrayList<Dinosaur> listaDinossauros = new ArrayList<>();
    
    public void adicionarDinossauro(Dinosaur dino){
        listaDinossauros.add(dino);
    }
    public void checarSegurança() throws EnclosureBreachedException{
        if(nivelSegurança < 5){
            throw new EnclosureBreachedException("Cerca Eletrica esta com defeito.");
        }
        System.out.println("O local esta seguro\n");
    }
}
abstract class Dinosaur implements Tratavel{
    protected String nome;
    protected int saude;

    public abstract void alimentar();
}
class Carnivore extends Dinosaur{

    @Override
    public void alimentar(){
        System.out.println("Alimentado com 150kg de Carne.");
    }
    @Override
    public void realizarExame() throws DinosaurIllException{
        if(this.saude <= 50){
            throw new DinosaurIllException("Carnivoro doente. Baixa ingestão de nutrientes.");
        }
        System.out.println("Carnivoro se encontra saudavel.\n");
    }
}
class Herbivore extends Dinosaur{

    @Override
    public void alimentar(){
        System.out.println("Alimentado com 350kg de Folhagem.");
    }
    @Override
    public void realizarExame() throws DinosaurIllException{
        if(this.saude <= 50){
            throw new DinosaurIllException("Herbivoro doente. Baixa ingestão de nutrientes.");
        }
        System.out.println("Herbivoro se encontra saudavel.\n");
    }
}