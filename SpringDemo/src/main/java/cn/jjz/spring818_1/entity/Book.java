package cn.jjz.spring818_1.entity;

/**
 * Created by lenovo on 2017/8/18.
 */
public class Book {
    private String bookname;
    private String bookauthour;
    private int price;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthour() {
        return bookauthour;
    }

    public void setBookauthour(String bookauthour) {
        this.bookauthour = bookauthour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
