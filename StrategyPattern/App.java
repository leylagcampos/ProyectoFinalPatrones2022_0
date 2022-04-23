package StrategyPattern;

public class App {

  public static void main(String[] args) {

    Context context = new Context();
    context.play(10);

    // Tenemos el balon ,indico que se usará  estrategia de ataque
    context.setStrategy(new AttackStrategy());
    context.play(5);

    // Sin balon , indico que se usará estrategia de defensa
    context.setStrategy(new DefenseStrategy());
    context.play(4);

  }
}
