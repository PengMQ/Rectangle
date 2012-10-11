
// Understands that rectangles have a height and width which can be used to
// work out its perimeter and area.
public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    public int perimeter() {
        return (width + height) * 2;
    }
}
