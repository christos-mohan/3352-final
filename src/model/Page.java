package model;
import java.util.ArrayList;

// Concrete OWLPage called Page
public class Page extends OWLPage {

    private String pageName; // Each page has a title
    private String lessonName; // Each page belongs to a collection of pages, which fall under a label called "Lesson" for organizational purposes
    private ArrayList<String> comments = new ArrayList(); // Every page contains a comment section to allow for student communication 
    private ArrayList<String> commentReactions = new ArrayList(); // Every comment can be reacted to with emoticons
    private ArrayList<String> contents = new ArrayList(); // Every page contains contents; for the sake of simplicity, this code will only concern itself with text contents (ie. Strings)
   
    // Retrieves the name of the page
    public String getPageName() {
        return pageName;
    }

    // Updates the name of the page
    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    // Retrieves the name of the page
    public String getLessonName() {
        return lessonName;
    }

    // Updates the label of the lesson that the page belongs to
    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    // Retrieves the comments for the page
    public void getComments(String c) {
        for (int i = 0; i < this.comments.size(); i++) {
            System.out.println(this.comments.get(i));
        }
    }

    // Creates a comment on the page
    public void addComment(String comment) {
        this.comments.add(comment);
    } 

    // Retrieves the reactions on the comments for the page
    public void getCommentReactions(String c) {
        for (int i = 0; i < this.commentReactions.size(); i++) {
            System.out.println(this.commentReactions.get(i));
        }
    }

    // Creates a reaction to a comment on the page
    public void addCommentReaction(int commentIndex, String commentReaction) {
        // Combines the reference to the comment which is being reacted to with the name of the emoticon that is being used
        String commentIndexReact = Integer.toString(commentIndex) + commentReaction;

        // Stores the combo, which can be parsed later
        this.commentReactions.add(commentIndexReact);
    } 

    // Retrieves the contents for the page
    public void getcontents() {
        for (int i = 0; i < this.contents.size(); i++) {
            System.out.println(this.contents.get(i));
        }
    }

    // Creates text content for the page
    public void addContent(String content) {
        this.contents.add(content);
    } 

    // Removes content from the page
    public void removeContent(int contentIndex) {
        contents.remove(contentIndex);
    }
    
    // Allows the user to reorder the contents of the page
    public void reordercontents(int[] targetIndex) {
        // targetIndex is a list of the current contents indexes but rearanged to show their desired placements

        ArrayList<String> temp = new ArrayList();

        // Copy the contents into a temporary array list in the desired order
        for(int i = 0; i < targetIndex.length; i++) {
            temp.add(contents.get(targetIndex[i]));
        }

        // Copy the adjusted contents from the temp array into the final contents array
        for(int i = 0; i < targetIndex.length; i++) {
            contents.set(i, temp.get(i));
        }
    }
    
}
