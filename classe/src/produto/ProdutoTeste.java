package produto;


public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 12.50;
        p2.desconto = 0.10;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto(0);
        double precoFinal2 = p2.precoComDesconto(0.1);
        System.out.println((precoFinal1 + precoFinal2) / 2);


    }
}
