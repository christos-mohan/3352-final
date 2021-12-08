// Begins the code
public class EditorEntryPoint {
    public static void main(String[] args) throws Exception {
        
        model.Page m = new model.Page();
        view.OnePageView v = new view.OnePageView();
        controller.PageController c = new controller.PageController(m, v);

    }
}
