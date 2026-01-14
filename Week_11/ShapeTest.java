package Week_11;

public class ShapeTest {
    public static void main(String[] args) {

        Shape[] s1 = new Shape[2];
        s1[0] = new Rectangle(10, 5);
        s1[1] = new Circle(7);

        for (Shape s : s1) {
            s.displayShapeInfo();

            if (s instanceof Drawable) {
                ((Drawable) s).draw();
            }

            System.out.println();
        }
    }
}
