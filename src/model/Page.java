package model;

public class Page extends Subject {

    private String pageName;
    private String pageNumber;
   
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
    
}
