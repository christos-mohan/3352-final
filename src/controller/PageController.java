package controller;

public class PageController {

    model.Page model;
    view.OnePageView view;

    public PageController(model.Page model, view.OnePageView view) {
        
        this.view = view;
        this.model = model;
        this.view.setController(this);

        view.show();


    }

    public void updateModel(String pageNameNumber) {

        // split the name from the number
        // String courseName = "";
        // String courseNumber = "";
        
        // model.setCourseName(courseName);
        // model.setCourseNumber(courseNumber);

        view.show();

    }

    

}
