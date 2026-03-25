public class ex12{
    public static void main(String[] args){
        Pessoa p = new Pessoa("Jorge");
        Apartamento ap = new Apartamento(102);
        p.setApart(ap);
        ap.exibirDadosdoAP();
    }
}
class Pessoa{
    private String nome;
    private Apartamento apart;

    public Pessoa(String nome){
        this.nome = nome;
    }
    public void setApart(Apartamento apartNovo){
        if(this.apart != apartNovo){
            this.apart = apartNovo;
            if(apartNovo != null){
            apartNovo.setProprietario(this);
            }
        }
    }
    public String getNome(){
        return nome;
    }
}

class Apartamento{
    private int numero;
    private Pessoa proprietario;

    public Apartamento(int numero){
        this.numero = numero;
    }

    public void setProprietario(Pessoa dono){
        if(this.proprietario != dono){
            this.proprietario = dono;
            if(dono != null){
                dono.setApart(this);
            }
        } 
    }
    public void exibirDadosdoAP(){
        System.out.println("Apartamento n°: " + this.numero);
        if(this.proprietario != null){
            System.out.println("O proprietário é o: " + this.proprietario.getNome());
        }else{
            System.out.println("Este apartamento não possui um dono.");
        }
    }
}