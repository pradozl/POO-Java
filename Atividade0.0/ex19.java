class Pessoa{
    private String nome;
    private String amigos;

    public Pessoa(String nomeInicial){
        this.nome = nomeInicial;
        this.amigos = "";
    }
    public String getNome(){
        return this.nome;
    }
    public void fazerAmizade(Pessoa p){
        this.amigos = this.amigos + p.getNome() + " ";
    }
    public String getNomesAmigos(){
        return this.amigos;
    }
public class ex19{
    public static void main(String[] args){
        Pessoa jorge = new Pessoa("Jorge");
        Pessoa maria = new Pessoa("Maria");
        Pessoa cleber = new Pessoa("Cleber");

        jorge.fazerAmizade(maria);
        jorge.fazerAmizade(cleber);

        System.out.println("Amigos do Jorge: " + jorge.getNomesAmigos());
        System.out.println("Amigos da Maria: " + maria.getNomesAmigos());
    }
}
    
}