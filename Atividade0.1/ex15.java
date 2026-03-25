import java.util.ArrayList;

public class ex15{
    public static void main(String[] args){
        Professor prof = new Professor("Claúdio Pontes", "Artes 2");
        Professor prof1 = new Professor("Maria Clara", "Matematica 4");
        Escola escola = new Escola("Londrina dos Campos Pinheiro");
        escola.adicionarSala(001);
        escola.adicionarSala(203);
        escola.adicionarProfessor(prof);
        escola.adicionarProfessor(prof1);
        escola.exibirSalas();
        escola.exibirProfessores();
    }
}
class Escola{
    private ArrayList<Sala> listaSalas;
    private ArrayList<Professor> listaProfessores;
    private String nomeEscola;

    public Escola(String nomeEscola){
        this.nomeEscola = nomeEscola;
        this.listaSalas = new ArrayList<>();
        this.listaProfessores = new ArrayList<>();
    }
    public void adicionarSala(int numero){
        Sala s = new Sala(numero);
        this.listaSalas.add(s);
    }
    public void adicionarProfessor(Professor prof){
        this.listaProfessores.add(prof);
    }
    public void exibirSalas(){
        System.out.println("A Escola: " + this.nomeEscola + " possui as seguintes salas: ");
        if(this.listaSalas.isEmpty()){
            System.out.println("Não há salas nesta escola.");
        }else{
            for(Sala s : listaSalas){
                System.out.println(" - " + s.getNumero());
            }
        }
        System.out.println("----------\n");
    }
    public void exibirProfessores(){
        System.out.println("A Escola: " + this.nomeEscola + " possui os seguintes professores: ");
        if(this.listaProfessores.isEmpty()){
            System.out.println("Não há nenhum professor cadastrado nesta escola.");
        }else{
            for(Professor prof : listaProfessores){
                System.out.println("  - " + prof.getNome() + " que da aula de: " + prof.getMateria());
            }
        }
        System.out.println("-----------\n");
    }
}
class Sala{
    private int numero;

    public Sala(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
}
class Professor{
    private String nome;
    private String materia;

    public Professor(String nome, String materia){
        this.nome = nome;
        this.materia = materia;
    }
    public String getNome(){
        return nome;
    }
    public String getMateria(){
        return materia;
    }
}