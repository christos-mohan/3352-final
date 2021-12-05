package view;

public class OnePageView extends model.Observer {

    private model.Page model;
    private controller.PageController controller;

    public void update() {

        this.show();


    }
    
    public OnePageView(model.Page model, controller.PageController controller) {

        this.setModel(model);
        
        this.setController(controller);

    }

    public void onPageeUpdate() {
        // collects update from user
        String newPageInfo = "SE3352 - Somethign";

        this.controller.updateModel(newPageInfo);

    }

    public OnePageView() {

    }

    public void show() {

    }

    public model.Page getModel() {
        return model;
    }

    public void setModel(model.Page model) {
        if (this.model != null) {
            this.model.detach(this);
        }
        this.model = model;
        this.model.attach(this);
    }

    public controller.PageController getController() {
        return controller;
    }

    public void setController(controller.PageController controller) {
        this.controller = controller;
    }
    
}
