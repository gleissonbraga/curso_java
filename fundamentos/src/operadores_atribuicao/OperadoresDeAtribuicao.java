package operadores_atribuicao;

public class OperadoresDeAtribuicao {

    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int c = a + b;

        c = c + b;
        c += b;
        c -= a;
        c *= b;
        c /= a;
        c %= 2;
    }
}
