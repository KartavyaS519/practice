public class Triangle implements calculate {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public void calcualteArea() {
        double area= 0.5*base*height;
        System.out.println("The area of the triangle is " +area);
    }
    public void getsides(int sides){
       System.out.println("Number of sides of a triangle: "+ sides );
    }
}
