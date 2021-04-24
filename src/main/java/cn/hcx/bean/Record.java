package cn.hcx.bean;

import java.util.Date;

public class Record {
    private String book_id;
    private String bor_id;
    private Date borrow_date;
    private Date return_date;

    public Record() {
    }

    public Record(String book_id, String bor_id, Date borrow_date, Date return_date) {
        this.book_id = book_id;
        this.bor_id = bor_id;
        this.borrow_date = borrow_date;
        this.return_date = return_date;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getBor_id() {
        return bor_id;
    }

    public void setBor_id(String bor_id) {
        this.bor_id = bor_id;
    }

    public Date getBorrow_date() {
        return borrow_date;
    }

    public void setBorrow_date(Date borrow_date) {
        this.borrow_date = borrow_date;
    }

    public Date getReturn_date() {
        return return_date;
    }

    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }

    @Override
    public String toString() {
        return "Record{" +
                "book_id='" + book_id + '\'' +
                ", bor_id='" + bor_id + '\'' +
                ", borrow_date=" + borrow_date +
                ", return_date=" + return_date +
                '}';
    }
}
