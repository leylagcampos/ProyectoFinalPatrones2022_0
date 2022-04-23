package StrategyPattern;

public class DefenseStrategy implements Strategy {

  @Override
  public void play(int numberOfPlayers) {
    System.out.printf("Defender con %d jugadores\n", numberOfPlayers);
  }
}
