public class ex8{
    public static void main(String[] args){
        Funcionario pia = new Funcionario();

        try{
            pia.setIdade(15);
        }catch(IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
class Funcionario{
    private int idade;
    
        public void setIdade (int idade){
            if(idade >= 16){
                this.idade = idade;
            }else{
                throw new IllegalArgumentException("A idade de contratação é de 16 anos para cima.");
            }
        }
        public int getIdade(){
            return idade;
        }
}

