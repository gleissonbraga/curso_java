package notacao_ponto;

public class NotacaoPonto {

    public static void main(String[] args) {

        // utilizando o tipo String e uppercase
        String s = "Bom dia X";
        // replace realiza a troca do valor de um caractere na string
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");
        System.out.println(s);

        System.out.println("Leo".toUpperCase());

        String y = "Bom dia X"
                .replace("X", "Gui")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem o operador '.'
        int a = 3;
        // a.

    }
}
