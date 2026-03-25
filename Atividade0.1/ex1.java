import java.util.ArrayList;

public class ex1{
    public static void main(String[] args){
        Departamento depart = new Departamento();

        Funcionario f1 = new Funcionario("João", "Professor", 21);
        Funcionario f2 = new Funcionario("Ronaldo","Secretario", 29);
        Funcionario f3 = new Funcionario("Cleide", "Diretora", 31);

        depart.admitir(f1);
        depart.admitir(f2);
        depart.admitir(f3);

        depart.listarFuncionarios();
    }
    
}
class Departamento{
    private ArrayList<Funcionario> ListaFuncionarios = new ArrayList<>();

    public void admitir(Funcionario f){
        ListaFuncionarios.add(f);
    }
    public void listarFuncionarios(){
        System.out.println("\n ----- Funcionarios do Departamento -----\n");
        for(Funcionario f : ListaFuncionarios){
            System.out.println("ID: " + f.getId() + " Nome: " + f.getNome() + " Cargo: " + f.getCargo());
        }
    }
}
class Funcionario{
    private String nome;
    private String cargo;
    private int id;

    public Funcionario(String nome, String cargo, int id){
        this.nome = nome;
        this.cargo = cargo;
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public String getCargo(){
        return cargo;
    }
    public int getId(){
        return id;
    }
}