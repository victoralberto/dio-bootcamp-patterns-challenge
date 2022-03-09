package dio.challenge.patterns.strategies;

import dio.challenge.patterns.strategy.Strategy;

public class PessoaStrategy implements Strategy {
    @Override
    public void criar() {
        System.out.println("Pessoa criada!");
    }

    @Override
    public void deletar() {
        System.out.println("Pessoa Deletada!");
    }

    @Override
    public void atualizar() {
        System.out.println("Pessoa atualizada");
    }

    @Override
    public void mostrar() {
        System.out.println("Pessoas: ...");
    }
}
