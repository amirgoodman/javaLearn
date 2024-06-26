package org.example.week1.strategy;

public interface Strategy {
    default void connectionSteam(){
     System.out.println("Авторизация в steam");
    }
    void getGame(String Game);

}

