package cn.jjz.entity;

import java.util.List;

/**
 * Created by lenovo on 2017/7/3.
 */
public class BookCategory {
    private int cateid;

    private String catename;
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getCateid() {
        return cateid;
    }

    public void setCateid(int cateid) {
        this.cateid = cateid;
    }

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename;
    }

}
