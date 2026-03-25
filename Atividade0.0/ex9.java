import java.util.ArrayList;
import java.util.Scanner;

public class ex9{
    public static void main(String[] args) {
        MultiplaEscolha questao1 = new MultiplaEscolha("Qual é a capital de Goiás?", "2");

        questao1.adicionarEscolha("Brasília");
        questao1.adicionarEscolha("Goiânia");
        questao1.adicionarEscolha("Anápolis");
        questao1.adicionarEscolha("Caldas Novas");

        System.out.println("=== QUESTÃO 1 ===");
        questao1.exibir();

        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nDigite o número da sua resposta: ");
        String respostaUsuario = sc.nextLine(); 

        if (questao1.checarResposta(respostaUsuario)) {
            System.out.println(" Parabéns! Você acertou na mosca.");
        } else {
            System.out.println(" Errrrrou! A resposta certa não era essa.");
        }
        sc.close();
    }
}

class Pergunta {
    private String texto;
    private String resposta;

    public Pergunta(String texto, String resposta) {
        this.texto = texto;
        this.resposta = resposta;
    }

    public void exibir() {
        System.out.println(texto);
    }

    public boolean checarResposta(String tentativa) {
        return this.resposta.equalsIgnoreCase(tentativa);
    }
}

class MultiplaEscolha extends Pergunta {
    private ArrayList<String> escolhas;

    public MultiplaEscolha(String texto, String resposta) {
        super(texto, resposta); 
        this.escolhas = new ArrayList<>();
    }

    public void adicionarEscolha(String escolha) {
        this.escolhas.add(escolha);
    }

    @Override
    public void exibir() {
        super.exibir();
    
        for (int i = 0; i < escolhas.size(); i++) {
            System.out.println((i + 1) + ") " + escolhas.get(i));
        }
    }
}