package construtor;

public class Construtor {


    public class Produto {

        String nome;
        double preco;
        double desconto;

        // construtor padrão sem atributos obrigtorios
        Produto(){

        }

        // construtor com parametros
        Produto(String nomeInicial, double precoInicial, double descontoInicial) {
            nome = nomeInicial;
            preco = precoInicial;
            desconto = descontoInicial;
        }


        double precoComDesconto(){
            return preco * (1 - desconto);
        }

        double precoComDesconto(double descontoDoGerente){
            return preco * (1 - desconto + descontoDoGerente);
        }
    }

}
