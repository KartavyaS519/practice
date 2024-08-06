public class Square implements calculate {
    double length;

    public Square(double length) {
        this.length = length;
    }
    @Override
    public void calcualteArea() {
        double area = length * length;
        System.out.println("Area of Square is: " + area);
    }

    public void getsides(int sides) {
        System.out.println("Number of sides of square is: "+sides);
    }
}
