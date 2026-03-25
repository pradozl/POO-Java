public class ex2{
    public static void main(String[] args){
        Carteira cart = new Carteira("AB", 6767);
        Motorista motora = new Motorista();

        motora.nome = "Jefferson";
        motora.habilitacao = cart;
        motora.exibirCarteira();
    }

}
    class Motorista{
        String nome;
        Carteira habilitacao;

        public void exibirCarteira(){
        System.out.println("==== DADOS DO MOTORISTA ====");
        System.out.println("Nome: " + this.nome);

        if(this.habilitacao != null){
            System.out.println("Numero da Carteira: " + this.habilitacao.getNumero());
        }else{
            System.out.println("Este motorista não possui uma habilitação!");
        }
    }
}
    class Carteira{
        private String nome;
        private int numero;

        public Carteira(String nome, int numero){
            this.nome = nome;
            this.numero = numero;
        }
        public String getNome(){
            return nome;
        }
        public int getNumero(){
            return numero;
        }
        public void setNome(String motorista){
            this.nome = motorista;
        }
        public void setNumero(int num){
            this.numero = num;
        }
 }