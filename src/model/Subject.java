package model;

import java.util.ArrayList;

// Abstract class of 
public abstract class Subject {

    ArrayList<Observer> observers = new ArrayList();

    public void attach(Observer o) {
        this.observers.add(o);
    }

    public void detach(Observer o) {
        this.observers.remove(o);
    }

    public void Notify(){
        for (Observer o : observers) {
            o.update();
        }
    }
    
}
