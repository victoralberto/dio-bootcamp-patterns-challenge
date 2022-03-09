package dio.challenge.patterns.models;

import dio.challenge.patterns.strategy.Strategy;

public class Usuarios {

    private Strategy strategy;

    public Usuarios(Strategy strategy){
        this.strategy = strategy;
    }

    public void criarUsuario(){
        this.strategy.criar();
    }

    public void deletarUsuario(){
        this.strategy.deletar();
    }

    public void atualizarUsuario(){
        this.strategy.atualizar();
    }

    public void mostrarUsuario(){
        this.strategy.mostrar();
    }

}
