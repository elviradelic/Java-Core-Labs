package Task1;

import java.util.HashMap;
import java.util.Optional;

import static jdk.vm.ci.hotspot.Cleaner.clean;

record Book(String title, String author, int year){}

class Library{
    private HashMap<String, Book> books = new HashMap<>();
    public void addBook(Book book){
        String key = clean(book.title());
        books.put(key, book);
    }
    public void removeBook(String title){
        String key = clean(title);
        books.remove(key);
    }
    public Optional<Book> findByExactTitle(String title){
        String key = clean(title);
        if(books.containsKey(key)){
            return Optional.of(books.get(key));
        }
        return Optional.empty();
    }
    private String clean(String input){
        return input.toLowerCase().trim();
    }











}