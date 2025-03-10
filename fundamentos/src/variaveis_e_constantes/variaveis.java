package variaveis_e_constantes;

public class variaveis {

    public static void main(String[] args) {
        // fica declarado como um número inteiro
        int varInt = 3;

        // fica declarado como float ou numero com casa decimal
        double raio = 3.4;

        // declarando uma constante com FINAL no inicio da variavel
        final double PI = 3.14159;

        double area = PI * raio * raio;
        System.out.println(area);

        // reescrevendo valor da variavel
        raio = 10;
        area = PI * raio * raio;
        System.out.println("Área = " + area);
    }
}
