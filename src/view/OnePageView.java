package view;

// Concrete Observer
public class OnePageView extends model.Observer {

    private model.Page model;
    private controller.PageController controller;

    // Constructor 1 with two member variables to access them from any method
    public OnePageView(model.Page model, controller.PageController controller) {
        this.setModel(model);
        this.setController(controller);
    }

    // Constructor 2 allows the user to create a blank page and assign a model and controller at a later time
    public OnePageView() {

    }

    // Update contents of the page
    public void update() {
        this.show();
    }
    
    // Takes user input to update the model
    public void onPageUpdate() {
        // Collects update from user 
        String newLessonLabel = "Week 10";
        String newPageName = "Architecture Design Patterns";

        // Sends the new page info to be updated from the model 
        this.controller.updateModel(newLessonLabel, newPageName);
    }

    // Display the page
    public void show() {

    }

    // Retrieve the model
    public model.Page getModel() {
        return model;
    }

    // Set the model (ie. attach the view to a model)
    public void setModel(model.Page model) {
        // If there is an existing model, remove it
        if (this.model != null) {
            this.model.detach(this);
        }

        // Make the input model the active model
        this.model = model; 
        this.model.attach(this);
    }

    // Retrieve the controller
    public controller.PageController getController() {
        return controller;
    }

    // Set the controller
    public void setController(controller.PageController controller) {
        this.controller = controller;
    }
    
}
