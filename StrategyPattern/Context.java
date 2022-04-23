package StrategyPattern;

public class Context {

  private Strategy strategy;

  public Context() {
    this.strategy = new WaitStrategy();
  }

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public void play(int numberOfPlayers) {
    this.strategy.play(numberOfPlayers);
  }
}
