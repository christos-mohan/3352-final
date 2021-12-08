package controller;

// Controller associated with Page model
public class PageController {

    // A reference to the model is required as access is required
    model.Page model;

    // Creating a reference to the view 
    view.OnePageView view;

    // Constructor that receives the object of both the model and the view
    public PageController(model.Page model, view.OnePageView view) {
        
        // Referencing the objects sent in the controller
        this.view = view;
        this.model = model;

        // Allows the controller to set itself as the controller of the view
        this.view.setController(this);

        // View allows the controller to give it a command to display itself
        view.show();


    }

    // Update the model
    public void updateModel(String pageNameNumber) {

        // split the name from the number
        // String courseName = "";
        // String courseNumber = "";
        
        // model.setCourseName(courseName);
        // model.setCourseNumber(courseNumber);

        // Using the same method as before to update the controller 
        view.show();

    }

}
