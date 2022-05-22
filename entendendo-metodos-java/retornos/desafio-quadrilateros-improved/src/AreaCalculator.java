public class AreaCalculator {

    public static double getQuadrilateralArea(double side) {
        return side * side;
    }

    public static double getQuadrilateralArea(double base, double height) {
        return base * height;
    }

    public static double getQuadrilateralArea(double base1, double base2, double height) {
        return (base1 + base2) * height / 2;
    }

}
