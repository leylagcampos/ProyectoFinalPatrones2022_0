package ObserverPattern;

public class Remitente implements Observer {
    public void update(){
        System.out.println("Mensaje para el Remitente...");
        System.out.println("La encomienda que usted envió llegó a su destino con éxito");
    }
}
