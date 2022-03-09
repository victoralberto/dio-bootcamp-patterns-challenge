package dio.challenge.patterns;

import dio.challenge.patterns.models.*;
import dio.challenge.patterns.strategies.*;
import dio.challenge.patterns.strategy.Strategy;

public class Main {

    public static void main(String[] args) {

        Strategy pessoaStrategy = new PessoaStrategy();
        Strategy dogStrategy = new DogStrategy();
        Strategy usuarioStrategy = new UsuarioStrategy();

        Pessoas pessoa = new Pessoas(pessoaStrategy);
        Dogs dogs = new Dogs(dogStrategy);
        Usuarios usuario = new Usuarios(usuarioStrategy);

        pessoa.criarPessoa();
        dogs.criarDog();
        usuario.criarUsuario();

    }

}
