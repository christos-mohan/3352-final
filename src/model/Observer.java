package model;

import java.util.ArrayList;

// Abstract class that views will extend; used for updating subjects (ie. Pages)
public abstract class Observer {

    // Method to ensure that Observers can be updated when the Subject calls on its notify method
    public abstract void update();    
    
}
