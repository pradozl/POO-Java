import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ex6{
    public static void main(String[] args){

        try(FileReader arquivo = new FileReader("POO/Atividade02/arquivo.txt");
                BufferedReader ler = new BufferedReader(arquivo)){
                String linha1 = ler.readLine();
                System.out.println(linha1);

            }catch(IOException e){

            System.out.println("Não foi possível ler o arquivo");
            System.out.println("Erro: " + e.getMessage());
        }
        
    }
}

//Caso a leitura ocorra corretamente, o sistema irá printrar na tela a seguinte mensagem "Teste da Atividade da Lista 0.2" -> é o que está escrito dentro do arquivo, apenas para teste