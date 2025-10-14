public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world.");
    }
}

/*

               Interface CommandLineRunner

É um recurso poderoso dentro do universo do Spring Framework,
muito usado no desenvolvimento de aplicações Java. Com ela,
é permitido que executemos alguma ação após a inicialização
de nossa aplicação. É útil para carregar alguns dados em nosso
banco de dados na inicialização de nossa aplicação.

                      Como funciona?

Quando uma aplicação Spring Boot é lançada, pode ocorrer várias
operações automáticas, como a criação de beans, configuração de
banco de dados, etc. A abertura para customização destas
operações é limitada, sendo usado a interface CommandLineRunner,
que representa uma tarefa a ser executada após a inicialização
do Spring Boot, permitindo definir código para ser executado
automaticamente quando o aplicativo é iniciado.

                        Como usar?

Pode incluir para que se implemente a interface CommandLineRunner
na classe principal da aplicação, como nesse exemplo:

@SpringBootApplication
public class MyCommandLineRunner implements CommandLineRunner {

   @Override
    public void run(String... args) throws Exception {
        System.out.println("Olá, Mundo!");
    }
}

Foi criado no exemplo acima uma classe chamada MyCommandLineRunner
que implementa a interface CommandLineRunner. No método "run",
inserimos a ação que desejamos que seja executada logo depois
que a aplicação for iniciada, nesse caso, apenas foi printado
"Olá, Mundo!".

                       Quando usar?

A interface CommandLineRunner é bem versátil e pode ser usada em
várias situações. Ela pode ser usada para carregar dados para um banco
de dados. Também pode ser usada para iniciar recursos, como conexões
de rede, e para checar a integridade de componentes ou serviços que
a aplicação irá interagir.
CommandLineRunner é executada só na inicialização da aplicação,
então não deve ser usada para tarefas que precisam ocorrer
periodicamente durante o funcionamento da aplicação, para isso,
Spring tem outras ferramentas mais adequadas.

                        Motivação

Sem a interface CommandLineRunner, teríamos que carregar
uma grande quantidade de dados em nosso banco de dados quando
a nossa aplicação Spring iniciasse, o que demoraria bastante.
Com o CommandLineRunner, essa tarefa se torna muito mais simples.


*/