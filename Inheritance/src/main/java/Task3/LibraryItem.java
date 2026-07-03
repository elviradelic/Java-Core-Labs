package Task3;

public class LibraryItem {
    private String id;
    private String title;
    private int year;

    public LibraryItem(String id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public int getYear() { return year; }
    public void setId(String id){this.id = id;}
    public void setTitle(String title){this.title=title;}
    public void setYear(int year){this.year=year;}

    public String getSummary(){
        return "[" + id + "]" + title + "(" + year + ")";
    }
}
