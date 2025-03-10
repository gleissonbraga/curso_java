package console;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        // print: segue inserindo na mesma linha os próximos prints
        System.out.print("Bom");
        System.out.print(" dia!");

        // println: a cada println ele insere o conteudo em uma nova linha
        System.out.println("Bom");
        System.out.println(" dia!");

        // printf: cria a interpolação
        System.out.printf("Megasena %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salário %.1f%n", 1234.5678); // %n quebra a linha
        System.out.printf("Nome: %s%n", "João");

        // é utilizado para receber dados de entrada no terminal
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("\nNome: " + nome + " " + sobrenome);

        // recomendo sempre fechar o scanner por ele ficar ocupando recurso da maquina
        entrada.close();
    }
}
