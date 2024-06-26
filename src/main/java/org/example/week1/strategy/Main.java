package org.example.week1.strategy;

class main {
    public static void main(String[] args) {
        GameContext context = new GameContext();
        context.setStrategy(new ConcreteStrategyCs());
        context.playGame("кс");
        context.setStrategy(new ConcreteStrategyDota());
        context.playGame("Dota");
        context.setStrategy(new ConcreteStrategyPubg());
        context.playGame("Pubg");
    }
}
