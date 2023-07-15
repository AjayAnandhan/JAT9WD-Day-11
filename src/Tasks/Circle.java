package Tasks;

// Q3)


public class Circle {
    private double radius;


    public Circle() {
        radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle circle1 = new Circle();
        circle1.setRadius(5.0);
        double circumference1 = circle1.calculateCircumference();
        System.out.println("Circle 1 circumference : " + circumference1 + " cm");

        Circle circle2 = new Circle(3.5);
        double circumference2 = circle2.calculateCircumference();
        System.out.println("Circle 2 circumference : " + circumference2 + " cm");
    }

}
