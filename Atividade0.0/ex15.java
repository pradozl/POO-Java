class ex15{
    public static void main(String[] args){

    Funcionario[] funcio = new Funcionario[50];

    funcio[0] = new FuncionarioHorista("Jorge",40 );
    funcio[1] = new Gestor("Cleber");
    for(Funcionario n : funcio){
        if(n != null){
            System.out.println("O funcionário: " + n.getNome() + " ganhou: R$ " + n.pagamentoSemanal());
            }
        }
    }
}

class Funcionario{
    private String nome;

    public Funcionario(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public double pagamentoSemanal(){
        return 00;
        }
}

class Gestor extends Funcionario{
    private double valorFixo = 5000.00;

    public Gestor(String nome){
        super(nome);
    }

    @Override
    public double pagamentoSemanal(){
        return valorFixo;
    }
}

class FuncionarioHorista extends Funcionario{
    private int hourasTrabalhadas;
    private double valorHora = 50.00;

    public FuncionarioHorista(String nome, int horas){
        super(nome);
        this.hourasTrabalhadas = horas;
    }

    @Override
    public  double pagamentoSemanal(){
        return hourasTrabalhadas * valorHora;
    }
}