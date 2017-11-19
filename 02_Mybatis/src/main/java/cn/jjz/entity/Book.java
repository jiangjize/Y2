package cn.jjz.entity;

/**
 * Created by lenovo on 2017/7/1.
 */
public class Book {
    private int bookid;
    private String bookname;
    private int bookcategory;
    private String catename;
    private int bookprice;
    private String bookauthor;
    private String bookabout;
    private String bookdatetime;
    private String bookpicture;
    private BookCategory bookCategory;

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename;
    }

    public int getBookid() {


        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getBookcategory() {
        return bookcategory;
    }

    public void setBookcategory(int bookcategory) {
        this.bookcategory = bookcategory;
    }

    public int getBookprice() {
        return bookprice;
    }

    public void setBookprice(int bookprice) {
        this.bookprice = bookprice;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public String getBookabout() {
        return bookabout;
    }

    public void setBookabout(String bookabout) {
        this.bookabout = bookabout;
    }

    public String getBookdatetime() {
        return bookdatetime;
    }

    public void setBookdatetime(String bookdatetime) {
        this.bookdatetime = bookdatetime;
    }

    public String getBookpicture() {
        return bookpicture;
    }

    public void setBookpicture(String bookpicture) {
        this.bookpicture = bookpicture;
    }
}
