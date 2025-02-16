public class perimeterOfRectangle {
    public static void main(String[] args) {
        double length = inputNumber.input();
        double bredth = inputNumber.input();
        System.out.print("Area of a Rectangle is : " + 2*(length + bredth) );
        double base = inputNumber.input();
        double height = inputNumber.input();
        AreaOfTrangle(base,height);
    }
    public static void AreaOfTrangle(double base , double height ){
        double Area = 0.5*base*height;
        System.out.println("Area of triangle is : " + Area);
    }
}
