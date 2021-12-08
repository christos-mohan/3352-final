package model;

import java.util.ArrayList;

<<<<<<< HEAD:src/model/Subject.java
// Abstract class of Subject that model classes will extend
public abstract class Subject {
=======
// Abstract class of OWLPage
public abstract class OWLPage {
>>>>>>> 3ad2ba25417523b44b81c2f0ad4019e72b6c5b79:src/model/OWLPage.java

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
    public void notify() {
        for (Observer o : observers) {
            o.update();
        }
    }
    
}
