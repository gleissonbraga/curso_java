package variaveis_e_constantes;

public class desafio_temperatura {

    public static void main(String[] args) {
        final double FATOR = 5.0 / 9.0;
        final int AJUSTE = 32;

        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;

        System.out.println("The result is " + celsius + "°C.");
    }
}
