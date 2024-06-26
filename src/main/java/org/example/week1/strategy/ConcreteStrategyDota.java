package org.example.week1.strategy;

class ConcreteStrategyDota implements Strategy {

    private void ChoiceHerios() {
        System.out.println("Выбор героя");
    }

    @Override
    public void getGame(String Game) {
        System.out.println("Играть игру" + Game);
        ChoiceHerios();
    }

}
