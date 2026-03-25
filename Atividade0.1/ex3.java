import java.util.ArrayList;
import java.time.LocalDate;

public class ex3{
    public static void main(String[] args){
        Aluno aluno = new Aluno("Jeffers");
        Disciplina disc = new Disciplina("Karatê 2", 102);
        Matricula m = disc.matriculaAluno(aluno);
        System.out.println("Matricula de " + aluno.getNome() + " realizada em " + disc.getNomeDisci());
        m.setNotaFinal(10);
        disc.listarMatriculas();
       
    }
}

class Aluno{
    private String nome;

    public Aluno(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
class Disciplina{
    private String nomeDisc;
    private int idDisci;
    private ArrayList<Matricula> listaMatricula;

    public Disciplina(String nome, int id){
        this.nomeDisc = nome;
        this.idDisci = id;
        this.listaMatricula = new ArrayList<>();
    }
    public Matricula matriculaAluno(Aluno a){
        Matricula novaMatricula = new Matricula(a, this);
        this.listaMatricula.add(novaMatricula);
        return novaMatricula;
    }
    public String getNomeDisci(){
        return nomeDisc;
    }
    public int getIdDisci(){
        return idDisci;
    }
    public void listarMatriculas(){
        System.out.println("\n ---- Lista de Matriculas em : " + this.nomeDisc + " ----\n");
        for(Matricula m : listaMatricula){
            m.exibirMatriculas();
        }
    }
}

class Matricula{
    private Aluno aluno;
    private Disciplina disciplina;
    private LocalDate dataMatricula;
    private double notaFinal;

    public Matricula(Aluno aluno, Disciplina disciplina){
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.dataMatricula = LocalDate.now();
        this.notaFinal = 0.0;
    }
    public void setNotaFinal(double nota){
        this.notaFinal = nota;
    }
    public Disciplina getDisciplina(){
        return disciplina;
    }
    public void exibirMatriculas(){
        System.out.println("Aluno: " + this.aluno.getNome() + " Data: " + this.dataMatricula + " Nota: " + this.notaFinal);
    }
}