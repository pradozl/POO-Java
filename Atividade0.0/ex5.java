public class ex5{
    public static void main(String[] args){
        Estudante aluno = new Estudante("Ronaldo Lemes");
        Curso disciplina = new Curso("Sistema da Informação");
        
        Matricula matri = new Matricula(aluno, disciplina);
        matri.trancar();
    }
}
class Estudante{
    private String nome;

    public Estudante(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}

class Curso{
    private String titulo;

    public Curso(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }

}

class Matricula{
    private Estudante estudante;
    private Curso curso;
    private String status;

    public Matricula(Estudante estudante, Curso curso){
        this.estudante = estudante;
        this.curso = curso;
        this.status = "Ativa";
    }
    public String getStatus(){
        return status;
    }
    public void trancar(){
        this.status = "Trancada";
        System.out.println("A matrícula de " + estudante.getNome() + " no curso " + curso.getTitulo() + " foi TRANCADA.");
    }

    public void cancelar(){
        this.status = "Cancelada";
        System.out.println("A matrícula de " + estudante.getNome() + " no curso " + curso.getTitulo() + " foi CANCELADA.");
    }
}