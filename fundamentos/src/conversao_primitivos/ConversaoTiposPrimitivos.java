package conversao_primitivos;

public class ConversaoTiposPrimitivos {

    public static void main(String[] args) {

        // DOUBLE suporta mais casas decimais que o float
        double a = 1; // implicita
        System.out.println(a);

        float b = (float) 1.0; // explicita (CAST)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c; // explicita (CAST)
        System.out.println(d);

        double e = 1;
        int f = (int) e; // implicita
        System.out.println(f);
    }
}
