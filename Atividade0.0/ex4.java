public class ex4{
    public static void main(String[] args) {
        Item item1 = new Item("Poção de Vida", 50.0);
        Item item2 = new Item("Poção de Vida", 50.0);
        
        Item item3 = new Item("Espada Longa", 150.0);

       
        System.out.println(" --- TESTE DE TOSTRING ---");
        System.out.println(item1); 
        System.out.println(item3);

        System.out.println("\n --- TESTE DO EQUALS ---");
        System.out.println("Item 1 é igual ao Item 2? " + item1.equals(item2)); 
        System.out.println("Item 1 é igual ao Item 3? " + item1.equals(item3)); 
    
    }
}
class Item {
    private String nome;
    private double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Item [nome=" + nome + ", preco=" + preco + "]";
    }

    @Override
    public boolean equals(Object outroObj) {
        if (this == outroObj){
            return true;
        }
        if (outroObj == null || this.getClass() != outroObj.getClass()) {
            return false;
        }
        
        Item outroItem = (Item) outroObj;
        
        return Double.compare(this.preco, outroItem.preco) == 0 && this.nome.equals(outroItem.nome);
    }
}