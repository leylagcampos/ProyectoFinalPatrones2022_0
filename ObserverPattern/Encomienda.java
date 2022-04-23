package ObserverPattern;

import java.util.ArrayList;

public class Encomienda implements Subject {
    
    private ArrayList<Observer> observadores;

    public Encomienda(){
        observadores=new ArrayList<Observer>();
    }
    public void addObserver(Observer o){
        observadores.add(o);
    }

    public void removeObserver(Observer o){
        observadores.remove(o);
    }  

    public void notifyObservers(){
        for(int i=0; i<observadores.size();i++){
            observadores.get(i).update();
        }
    }
    
}
