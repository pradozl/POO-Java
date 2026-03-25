package br.edu.main;
import br.edu.rh.Funcionario;

public class ex18{
    public static void main(String[] args){
        Funcionario f = new Funcionario();
        System.out.println(f.salario);
    }
}
//O erro ocorre porque o atributo salario tem visibilidade default (padrão/pacote).
//Isso significa que ele só pode ser acessado por outras classes que estejam dentro do mesmo pacote que ele (ou seja, só por classes dentro de br.edu.rh).
// Como a classe principal está tentando acessar o salário de fora, a partir do pacote br.edu.main, o Java bloqueia o acesso por segurança.