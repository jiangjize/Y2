package cn.jjz.entity;

/**
 * Created by lenovo on 2017/6/30.
 */
public class User {
    private  int bookid;
    private  String bookname;
    private  String bookauthor;

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

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }
}
