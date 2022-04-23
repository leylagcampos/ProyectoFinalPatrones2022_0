package StrategyPattern;

public class WaitStrategy implements Strategy {

    @Override
    public void play(int numberOfPlayers) {
        System.out.printf("Esperar  con %d jugadores al atacante\n", numberOfPlayers);
    }
}