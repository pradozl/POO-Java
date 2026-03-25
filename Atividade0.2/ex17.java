import java.util.ArrayList;

public class ex17{
    public static void main(String[] args){
        Professor prof = new Professor("Olegario");
        Aluno alu = new Aluno("Arthur");
        Aluno alu1 = new Aluno("Marco");

        Disciplina poo = new Disciplina(prof);

        poo.adicionarAluno(alu);
        poo.adicionarAluno(alu1);

        System.out.println("Quem da a aula:\n" + poo.titular);
        System.out.println("Aluno matriculados: ");
        for(Aluno a : poo.matriculados){
            System.out.println(" - " + a);
        }
    }
}
abstract class Pessoa{
    public String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }
    public void exibirDados(){
    }
}
class Professor extends Pessoa{

    public Professor(String nome){
        super(nome);
    }
    @Override
    public String toString(){
        return "Professor: " + this.nome;
    }
}
class Aluno extends Pessoa{

    public Aluno(String nome){
        super(nome);
    }
    @Override
    public String toString(){
        return "Aluno: " + this.nome;
    }
}
class Disciplina{
    ArrayList<Aluno> matriculados;
    Professor titular;

    public Disciplina(Professor titular){
        this.titular = titular;
        this.matriculados = new ArrayList<>();
    }
    public void adicionarAluno(Aluno aluno){
        matriculados.add(aluno);
    }
}