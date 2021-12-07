package view;

public class OnePageView extends model.Observer {

    private model.Page model;
    private controller.PageController controller;

    // Constructor 1
    public OnePageView(model.Page model, controller.PageController controller) {

        this.setModel(model);
        
        this.setController(controller);

    }

    // Constructor 2
    public OnePageView() {

    }

    // Update contents of the page
    public void update() {

        this.show();

    }
    
    ///TODO:
    public void onPageUpdate() {
        // Collects update from user
        String newPageInfo = "SE3352 - Somethign";

        this.controller.updateModel(newPageInfo);

    }

    // Display the page
    public void show() {

    }

    // Retrieve the model
    public model.Page getModel() {
        return model;
    }

    // Set the model
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
