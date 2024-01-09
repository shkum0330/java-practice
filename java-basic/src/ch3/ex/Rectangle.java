package ch3.ex;

public class Rectangle {
    int width,height,area;

    public int calculateArea(){
        return width*height;
    }

    public int calculatePerimeter(){
        return width*2+height*2;
    }

    public boolean isSquare(){
        return width==height;
    }
}
