package ObserverPattern;

public class Destinatario implements Observer {
    public void update(){
        System.out.println("Mensaje para el Destinatario...");
        System.out.println("La encomienda esta lista para ser recogida en la agencia, vaya con su dni e indique la clave secreta");

    }
}
