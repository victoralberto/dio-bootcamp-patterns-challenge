package dio.challenge.patterns.strategies;

import dio.challenge.patterns.strategy.Strategy;

public class UsuarioStrategy implements Strategy {
    @Override
    public void criar() {
        System.out.println("Usuário criado!");
    }

    @Override
    public void deletar() {
        System.out.println("Usuário deletado");
    }

    @Override
    public void atualizar() {
        System.out.println("Usuário atualizado!");
    }

    @Override
    public void mostrar() {
        System.out.println("Usuários: ...");
    }
}
