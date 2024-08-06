public class Rectangle implements calculate {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public void calcualteArea() {
        double area = length * width;
        System.out.println("Area of Rectangle is: " + area);
    }
    public void getsides(int sides1) {
        System.out.println("NUmber of sides of rectangle is: "+sides1);
    }
}
