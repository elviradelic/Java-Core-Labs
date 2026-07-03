package Task3;

public class Rectange extends Shape{
    private double width;
    private double height;

    public Rectange(String color, double height, double width){
        super(color);
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return width*height;
    }
}
