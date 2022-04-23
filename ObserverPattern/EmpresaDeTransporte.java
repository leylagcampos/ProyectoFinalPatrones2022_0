package ObserverPattern;

public class EmpresaDeTransporte { 
    public static void main(String[] args) {
        Encomienda encomienda =new Encomienda();
        encomienda.addObserver(new Remitente());
        encomienda.addObserver(new Destinatario());

        //La encomienda llega a su destino, se notifica a los interesados

        encomienda.notifyObservers();
    }
}
