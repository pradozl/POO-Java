public class ex15{
    public static void main(String[] args){
        System.out.println("Total de visitantes no inicio: " + Visitante.totalVisitantes); //Verificar se o resultado inicial está correto, no caso 0

        new Visitante("Ronaldo", 12);
        new Visitante("Julio", 14);
        new Visitante("Jaqueline", 20);     //Uso apenas de new, sem declarar uma variável, visto que é apenas um teste, não iria utilizar esses dados futuramente
        new Visitante("Jennifer", 17);
        new Visitante("Daniel", 30);

        System.out.println("Total de visitantes no final: " + Visitante.totalVisitantes); //Verificar se o resultado final está correto, no caso 5
    }
}
class Visitante{
    private String nome;
    private int idade;
    public static int totalVisitantes = 0;

    public Visitante(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
        Visitante.totalVisitantes++;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
}