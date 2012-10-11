import org.junit.Test;

import static junit.framework.Assert.assertEquals;

// Ensures the rectangle can return its perimeter and area.
public class RectangleTests {

    @Test
    public void rectangleWithWidth1Height2HasArea2()  {
        Rectangle rectangle =  new Rectangle(1, 2);
        assertEquals(2, rectangle.area());
    }

    @Test
    public void shouldReturnPerimeterOfOneByTwo() {
        Rectangle rectangle = new Rectangle(1,2);
        assertEquals(6,rectangle.perimeter());
    }
    @Test
    public void shouldReturnPerimeterOf2x2() {
        Rectangle rectangle = new Rectangle(2,2);
        assertEquals(8,rectangle.perimeter());
    }
}
