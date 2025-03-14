package controle_if;

import java.util.Scanner;

public class controle_if {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a média: ");
        double nota = entrada.nextDouble();

        if(nota >= 7.0) {
            System.out.println("Aprovado");
            System.out.println("Parabéns");
        }

        if (nota < 7 && nota >= 4.5){
            System.out.println("recuperação");
        }

        if (nota < 4.5 && nota >= 0){
            System.out.println("reprovado");
        }

        entrada.close();
    }
}
