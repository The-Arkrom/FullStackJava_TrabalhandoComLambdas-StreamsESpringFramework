public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world.");
    }
}

/*

               JsonAlias e JsonPromperty

São anotações em Jackson, uma biblioteca para processar JSON,
que ajudam a mapear propriedades de classe para campos JSON,
mas possuem diferentes funções:

                    @JsonPromperty

Essa anotação é usada para definir o nome da propriedade JSON
que está associada ao campo JAVA.
Quando JSON é serializado (convertido de objetos Java para JSON),
o nome especificado em @jsonPromperty será usado como a chave
para o campo no JSON de saída. Da mesma forma, quando o JSON
é desserializado (convertido de JSON para objetos JAVA), a
biblioteca procura pelo nome especificado em @jsonPromperty
para mapear o valor JSON para o campo Java.
Pode-se usar o @jsonPromperty("nomeNoJson") para um nome
diferente no Json. É útil quando precisa trabalhar com um JSON
que segue uma convenção de nomenclatura diferente da sua classe
Java.
Por exemplo, se tiver uma classe Java com a propriedade
"nomeCompleto" e quiser que ela seja mapeada para o Json como
"nome", pode-se usar o @JsonPromperty("nome") para especificar
o nome correto no JSON:

public class Pessoa {
    @JsonProperty("nome")
    private String nomeCompleto;
}

                    @JsonAlias

É usado para definir um ou mais apelidos para o nome da propriedade
JSON associada no campo Java.
Ao desserializar, o @JsonAlias permite que a biblioteca encontre o
valor JSON correspondente, mesmo que o nome da propriedade no JSON
não corresponda exatamente ao nome do campo Java.
Isso é útil quando está trabalhando com diferentes versões de um
JSON ou quando deseja permitir que uma propriedade seja referenciada
por nomes diferentes.
Por exemplo, se tiver uma classe Java com a propriedade
"nomeCompleto" e o JSON usa "nome", pode-se usar o @Jsonlias("nome")
para mapear corretamente a propriedade. Dessa forma, tanto
"nomeCompleto" quanto "nome" serão aceitos ao fazer o mapeamento:

public class Pessoa {
    @JsonAlias({"nomeCompleto", "nome"})
    private String nomeCompleto;
}

*/