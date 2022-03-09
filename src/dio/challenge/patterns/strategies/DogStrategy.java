package dio.challenge.patterns.strategies;

import dio.challenge.patterns.strategy.Strategy;

public class DogStrategy implements Strategy {
    @Override
    public void criar() {
        System.out.println("Dog criado!");
    }

    @Override
    public void deletar() {
        System.out.println("Dog deletado!");
    }

    @Override
    public void atualizar() {
        System.out.println("Dog atualizado!");
    }

    @Override
    public void mostrar() {
        System.out.println("Dogs: ...");
    }
}
