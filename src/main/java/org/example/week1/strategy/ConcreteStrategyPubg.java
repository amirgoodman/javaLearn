package org.example.week1.strategy;

class ConcreteStrategyPubg implements Strategy {
    @Override
    public void getGame(String Game) {
        System.out.println("В стиме нету такой игры" + Game);
    }

}
