package tipos_primitivos;

public class tipos_primitivos {

    public static void main(String[] args) {

        // informações do funcionário

        // Tipos numéricos inteiros

        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;

        // utiliza-se o 'L' no final dos inteiros acima de 2 bilhoes para
        // poder informar que passou da quantia padrão dos inteiros e virar long
        long pontosAcumulados = 3_234_845_223L;

        // Tipos numéricos reais

        // pelo fato do DOUBLE ser o padrão para valores 0.00 devemos colocar o F no final
        // caso desejamos declarar o valor como float
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipos booleanos
        boolean estaDeFerias = false;

        // Tipo caractere
        char status = 'A';

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Numeros de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
