package StrategyPattern;

public class AttackStrategy implements Strategy {

  @Override
  public void play(int numberOfPlayers) {
    System.out.printf("Atacar con %d jugadores\n",numberOfPlayers);
  }
}
