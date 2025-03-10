package tipoString;

public class TipoString {

    public static void main(String[] args) {

        // o metodo 'charAt' busca uma letra especifica na string através do indice.
        System.out.println("Olá, pessoal".charAt(2));

        String s = "Boa tarde";
        // Concat: concatena
        System.out.println(s.concat("!!!"));

        // + realiza a concatenação
        System.out.println(s + "!!!");

        // startsWith: se a frase ou string começa com 'Boa'. Retorna um booleano.
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("b"));
        System.out.println(s.toLowerCase().startsWith("boa"));

        // endsWith: se a frase ou string termina com 'tarde'. Retorna um booleano.
        System.out.println(s.endsWith("tarde"));

        // length: retorna a quantidade de caracteres
        System.out.println(s.length());

        // equals: compara a igualdade com a string
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + " Idade: " + idade + " Salário " + salario + "\n\n");

        // printf: realiza a função de interpolação. %s = string, %d = double, %f = float.
        // (%.2(variavel: ' o .2 é inserido para declarar quantas casas decimais queremos)
        System.out.printf("Nome: %s %s tem %d anos de idade e ganha R$ %.2f", nome, sobrenome, idade, salario);
        String frase = String.format("\nNome: %s %s tem %d anos de idade e ganha R$ %.2f", nome, sobrenome, idade, salario);
        System.out.println(frase);

        // contains: verifica se a palavra informada esta na frase. retorna boolean
        System.out.println("Frase qualquer".contains("qual"));

        // indexOf: descobre o indice da palavra qual.
        System.out.println("Frase qualquer".indexOf("qual"));

        // substring: utilizado para dizer de qual indice quero que comece
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6, 8));

    }
}
