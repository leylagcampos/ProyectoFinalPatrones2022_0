package PrototypePattern;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> funcionalidades = new ArrayList<>();
        
        funcionalidades.add("Graba y reproduce recordatorios");
        funcionalidades.add("Manipula objetos");
        funcionalidades.add("Trasladarse");

        Robot robot = new Robot(1, funcionalidades, "AIKA707","Robot asistente personal");
        Robot robotclon = robot.clonar();
       

        System.out.println(robot.getID());
        System.out.println(robot.getDescription());
        System.out.println(robot.getModel());
        System.out.println(robot.getFunctionalities());

        System.out.println(robotclon.getID());
        System.out.println(robotclon.getDescription());
        System.out.println(robotclon.getModel());
        System.out.println(robotclon.getFunctionalities());

    }
}
