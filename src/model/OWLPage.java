package model;

import java.util.ArrayList;

// Abstract class of OWLPage (acts as a subject) that model classes will extend
public abstract class OWLPage {

    // Maintaining a list of observers
    ArrayList<Observer> observers = new ArrayList();

    // Allows an observer to subscribe to the list
    public void attach(Observer o) {
        this.observers.add(o);
    }

    // Allows an observer to unsubscribe to the list
    public void detach(Observer o) {
        this.observers.remove(o);
    }

    // Notifies all observers when a change has been made
    public void Notify() {
        for (Observer o : observers) {
            o.update();
        }
    }
    
}
