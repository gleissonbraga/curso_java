package inferencia;

public class Inferencia {

    // ele ira automaticamente descobrir qual o tipo desta variavel e irá inserir um valor
    public static void main(String[] args) {

        var b = 4.5;
        System.out.println(b);

        var c = "texto";
        System.out.println(c);
        c = "Outro texto";
        System.out.println(c);

        // java não permite trocar o tipo da variavel
        // c = 4.5;

        double d;
        d = 123.65;
        System.out.println(d);
        
    }
}
