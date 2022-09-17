package day47_Polymorphism;

public class EncapsulationReview {

    private String bookTitle;
    private final String publishedDate;

    public EncapsulationReview(String bookTitle, String publishedDate) {
        //this.bookTitle = bookTitle;

        setBookTitle(bookTitle);
        this.publishedDate = publishedDate;
    }

    public String getBookTitle() {
        if(bookTitle==null){
            return "No book title is provided"; // to display an error message informing the value is null
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

}
