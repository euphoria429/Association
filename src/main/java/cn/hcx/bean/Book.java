package cn.hcx.bean;

public class Book {
    private String book_id;
    private String book_name;
    private int number;
    private String location;

    public Book() {
    }

    public Book(String book_id, String book_name, int number, String location) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.number = number;
        this.location = location;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id='" + book_id + '\'' +
                ", book_name='" + book_name + '\'' +
                ", number=" + number +
                ", location='" + location + '\'' +
                '}';
    }
}
