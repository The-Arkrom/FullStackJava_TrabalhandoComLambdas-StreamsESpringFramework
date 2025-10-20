public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world...");
    }
}

/*

                      Generics

Em Java, generics permitem criar classes, interfaces e
métodos que trabalham com tipos desconhecidos ou
parâmetros genéricos, além de fornecer uma forma de escrever
código que seja flexível e reutilizável, tornando-o
independente de tipos específicos e permitindo que funcione
com diferente tipos de dados.
Para criar um método ou classe genérico, é necessário usar
parâmetros de tipo (tipos genéricos) que são representados
entre colchetes angulares <>. Geralmente, usamos letras
maiúsculas únicas para representar os tipos genéricos, mas
é possível usar qualquer idetificador válido em Java. Segue
abaixo um exemplo de classe genérica chamada "Caixa", que
armazena um valor de um tipo desconhecido:

public class Caixa<T> {
    private T conteudo;

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
}

No exemplo acima, podemos criar um objeto do tipo "Caixa" e
armazenar qualquer tipo de valor no mesmo, veja um exemplo:

public class TestaCaixa {
    public static void main(String[] args) {
        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.setConteudo("Guardando texto na minha caixa!");

        Caixa<Integer> caixaDeIdade = new Caixa<>();
        caixaDeIdade.setConteudo(30);

        Caixa<Double> caixaDeValor = new Caixa<>();
        caixaDeValor.setConteudo(150.50);
    }
}

O método acima realiza a soma entre o conteúdo atual da
caixa (this.conteudo) e o valor passado como parâmetro
(valor). O método é genérico e pode ser usado para
diferentes tipos de conteúdo que podem ser somados, como
Integer, Double e String.
Vamos descrever o que acontece passo a passo:

public <T> T somaConteudoNaCaixa(T valor) {

O método é genérico e recebe um parâmetro valor do tipo
genérico "T", que é o mesmo tipo que será retornado como
resultado da soma.
Logo em seguida, o método começa com uma série de
condicionais "if" que verificam o tipo do conteúdo atual
da caixa (this.conteúdo) e o tipo do valor passado como
parâmetro (valor).

if (this.conteudo instanceof Integer c && valor instanceof Integer i) {
    // Realiza a soma entre os valores e armazena o resultado em uma variável
    Integer resultado = c + i;
    // Retorna o resultado como tipo genérico T (Integer no caso)
    return (T) resultado;
}

A verificação é realizada usando os operadores "instanceof"
e os operadores de pattern matching (instanceof com pattern variables)
disponíveis a partir do Java 16.
Se o conteúdo atual (this.conteudo) e o valor (valor) forem
ambos do mesmo tipo, é feita a soma ou a concatenação, como
no caso da "String". Caso o tipo da variável valor seja diferente
do tipo do conteúdo, devolvemos o valor anterior do conteúdo.
Vejamos como ficaria em nossa classe "TestaCaixa":

public static void main(String[] args) {
        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.setConteudo("Guardando texto na minha caixa!");
        System.out.println(caixaDeTexto.somaConteudoNaCaixa("Mais uma linha"));

        Caixa<Integer> caixaDeIdade = new Caixa<>();
        caixaDeIdade.setConteudo(30);
        System.out.println(caixaDeIdade.somaConteudoNaCaixa(26));

        Caixa<Double> caixaDeValor = new Caixa<>();
        caixaDeValor.setConteudo(150.50);
        System.out.println(caixaDeValor.somaConteudoNaCaixa(350.50));
        System.out.println(caixaDeValor.somaConteudoNaCaixa("texto"));
    }

Ao executar o código acima, teremos como saída em nosso
terminal, os seguintes valores:

Guardando texto na minha caixa!
Mais uma linha
56
501.0
null

Na última linha do código, ao tentar incluir uma String
“texto” em nossa caixaDeValor, ao executar esse código
tivemos um retorno null, pois só realizamos a soma caso
ambos os tipos fossem iguais.

*/