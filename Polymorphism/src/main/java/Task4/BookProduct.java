package Task4;

import Task3.Book;

public class BookProduct extends Product{
    private String author;

    public BookProduct(String name, double price, String author){
        super(name, price);
        this.author = author
    }

    @Override
    public String  getInfo(){
        return "Author: " + author;
    }
}
