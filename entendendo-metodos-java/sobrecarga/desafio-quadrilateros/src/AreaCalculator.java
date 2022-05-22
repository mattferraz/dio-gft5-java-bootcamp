public class AreaCalculator {

    // Calculates the Square area:
    public static void getQuadrilateralArea(double side) {
        double area = side * side;
        System.out.printf("A área do quadrado de lado %.2f é igual %.2f.\n", side, area);
    }

    // Calculates the Rectangle area:
    public static void getQuadrilateralArea(double base, double height) {
        double area = base * height;
        System.out.printf("A área do retângulo de base %.2f e altura %.2f é igual %.2f.\n", base, height, area);
    }

    // Calculates the Trapezoid area:
    public static void getQuadrilateralArea(double base1, double base2, double height) {
        double area = (base1 + base2) * height / 2;
        System.out.printf("A área do trapézio de bases %.2f e %.2f e altura %.2f é igual %.2f.\n", base1, base2, height, area);
    }
}
