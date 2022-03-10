package dio.challenge.patterns.models;

import dio.challenge.patterns.strategy.Strategy;

public class Pessoas {

    //Padrão de projeto Stategy

    private Strategy strategy;

    public Pessoas(Strategy strategy){
        this.strategy = strategy;
    }

    public void criarPessoa(){
        this.strategy.criar();
    }

    public void deletarPessoa(){
        this.strategy.deletar();
    }

    public void atualizarPessoa(){
        this.strategy.atualizar();
    }

    public void mostrarPessoa(){
        this.strategy.mostrar();
    }

}
