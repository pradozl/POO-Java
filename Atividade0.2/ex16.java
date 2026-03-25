public class ex16{
    public static void main(String[] args){
        Produto prod = new Produto();

        try{
            System.out.println("Teste de Compra");
            prod.reduzirEstoque(11);
        }catch(EstoqueInsuficienteException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
class EstoqueInsuficienteException extends Exception{
    public EstoqueInsuficienteException(String mensagem){
        super(mensagem);
    }
}

class Produto{
    private int estoque = 10;

    public void reduzirEstoque(int quantidade) throws EstoqueInsuficienteException{
        if(quantidade <= estoque){
            estoque -= quantidade;
            System.out.println("Compra realizada com sucesso.");
        }else{
            throw new EstoqueInsuficienteException("Não há estoque suficiente para esta compra.");
        }
    }
}