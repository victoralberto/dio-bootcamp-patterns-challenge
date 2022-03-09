package dio.challenge.patterns.models;

import dio.challenge.patterns.strategy.Strategy;

public class Dogs {

    private Strategy strategy;

    public Dogs(Strategy strategy){
        this.strategy = strategy;
    }

    public void criarDog(){
        this.strategy.criar();
    }

    public void deletarDog(){
        this.strategy.deletar();
    }

    public void atualizarDog(){
        this.strategy.atualizar();
    }

    public void mostrarDog(){
        this.strategy.mostrar();
    }

}
