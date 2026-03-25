public class ex5{
    public static void main(String[] args){
        CarrinhoDeCompras sacola = new CarrinhoDeCompras();
        FormaPagamento pix = new PagamentoPix();
        FormaPagamento cartao = new PagamentoCartao();
        System.out.println("Teste de compra de 50 reais (cartao)");
        sacola.finalizarCompra(50, cartao);
        
        System.out.println("---------------------------");

        System.out.println("\nTeste de compra de 50 reais (pix)");
        sacola.finalizarCompra(50, pix);
    }
}
interface FormaPagamento{
    abstract void processarPagamento(double valor);
}
class CarrinhoDeCompras{
    public void finalizarCompra(double valorTotal, FormaPagamento forma){
        forma.processarPagamento(valorTotal);
        System.out.println("Compra realizada com sucesso");
    }
}
class PagamentoCartao implements FormaPagamento{
    @Override
    public void processarPagamento(double valor){
        System.out.println("Processando o pagamento de: R$ " + valor + ", retire o cartão.");
    }

}
class PagamentoPix implements FormaPagamento{
   @Override
   public void processarPagamento(double valor){
        System.out.println("Lendo o QRCode e processando o pagamento de: R$ " + valor);
   }
}