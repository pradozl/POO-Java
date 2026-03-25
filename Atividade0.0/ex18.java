class Funcionario{
    private String nome;
    private double salario;
    private double porcentagem;

    public Funcionario(String nomeInicial, double salarioInicial, double porcentagemInicial){
        this.nome = nomeInicial;
        this.salario =  salarioInicial;
        this.porcentagem = porcentagemInicial;
    }
    public String getNome(){
        return this.nome;
    }
    public double getSalario(){
        return this.salario;
    }
    public double getPorcentagem(){
        return this.porcentagem;
    }
    public void aumentoSalario(double porcentagem){
        double valorAumento = this.salario * (this.porcentagem / 100);
        this.salario = this.salario + valorAumento;
    }
}
public class ex18{
    public static void main(String[] args){
        Funcionario func1 = new Funcionario("Jorge", 2000.0, 15.0);
        System.out.println(func1.getNome() + " ganha " + func1.getSalario());
    }
}  
