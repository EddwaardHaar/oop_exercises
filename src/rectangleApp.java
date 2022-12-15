public class rectangleApp {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Area of Rectangle is " + rectangle1.getArea());
        System.out.println("Perimeter of Rectangle is " + rectangle1.getPerimeter());
        Rectangle rectangle2 = new Rectangle(5,2);
        System.out.println("Area of Rectangle is " + rectangle2.getArea());
        System.out.println("Perimeter of Rectangle is " + rectangle2.getPerimeter());
    }
}

class Rectangle
{

    public double length;
    public double width;

    public Rectangle(){
        length = 0.0;
        width = 0.0;
    }

    public Rectangle(double len, double wid){
        length = len;
        width = wid;
    }
    public double getArea()
    {
        return length * width;
    }
    public double getPerimeter()
    {
        return length + length + width + width;
    }

}

