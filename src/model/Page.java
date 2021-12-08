package model;
import java.util.ArrayList;

<<<<<<< HEAD
// Concrete Subject called Page
public class Page extends Subject {
=======
public class Page extends OWLPage {
>>>>>>> 3ad2ba25417523b44b81c2f0ad4019e72b6c5b79

    private String pageName;
    private String pageNumber;
    // private String [] comments; 
    private ArrayList<String> comments = new ArrayList() ; 
    private ArrayList<String> lessons = new ArrayList();
   
    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    // Creating function that adds the comment
    public void getComments (String c) {
        for (int i = 0; i < this.comments.size(); i++) {
            System.out.println(this.comments.get(i));
        }
    }

    //Creating function that adds the comment
    public void addComment (String comment) {
        this.comments.add(comment);
    } 


    public void addLesson (String lesson) {
        this.lessons.add(lesson);
    } 

    public void getLessons() {
        for (int i = 0; i < this.lessons.size(); i++) {
            System.out.println(this.lessons.get(i));
        }
    }

    public void reorderLessons() {
        // Takes in user inputs on screen to reorder lessons
    }
    
}
