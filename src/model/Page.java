package model;
import java.util.ArrayList;

public class Page extends Subject {

    private String pageName;
    private String pageNumber;
    // private String [] comments; 
    private ArrayList<String> comments = new ArrayList() ; 
   
    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageeName) {
        this.pageName = pageName;
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    // Creating function that gets comments
    // public String getComments() {
    //     return comments;
    // }

    // Creating function that adds the comment
    public void getComments (String c) {
        this.comments.add(c);
    }

    // Creating function that adds the comment
    // public void addComments (String comments) {
    //     this.comments.push(comments);
    // } 
    
}
