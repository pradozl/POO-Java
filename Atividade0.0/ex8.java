public class ex8{
    public static void main(String[] args){
        int[][] contas = { 
            {5, 3, 5}, 
            {2, 5, 4},
            {10, 5, 3}
        };

        String[] paises = {"Brasil", "Peru", "Suecia"};

        System.out.println("País\tOuro\tPrata\tBronze\tTOTAL");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < contas.length; i++) {
            
            System.out.print(paises[i] + "\t");
            int totalMedalhas = 0;

            for (int j = 0; j < contas[i].length; j++) {
                System.out.print(contas[i][j] + "\t");
                totalMedalhas = totalMedalhas + contas[i][j]; 
            }
    
            System.out.println(totalMedalhas); 
        }
    }
}