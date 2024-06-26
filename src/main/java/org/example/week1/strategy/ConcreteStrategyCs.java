package org.example.week1.strategy;

class ConcreteStrategyCs implements Strategy {

    private void ChoiceSide() {
        System.out.println("Выбор стороны!");
    }

    @Override
    public void getGame(String Game) {
        System.out.println("Играть игру" + Game);
        ChoiceSide();
    }
}
