package org.example.week1.strategy;

class GameContext {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void playGame(String game) {
        strategy.connectionSteam();
        strategy.getGame(game);
    }


}
