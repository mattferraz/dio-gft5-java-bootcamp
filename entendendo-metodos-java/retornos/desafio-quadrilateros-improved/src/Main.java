public class Main {

    public static void main(String[] args) {

        // Square:
        double squareSide = 10;

        double squareArea = AreaCalculator.getQuadrilateralArea(squareSide);

        System.out.printf("A área do quadrado de lado %.2f é igual %.2f.\n", squareSide, squareArea);

        // Rectangle:
        double rectangleBase = 10;
        double rectangleHeight = 5;

        double rectangleArea = AreaCalculator.getQuadrilateralArea(rectangleBase, rectangleHeight);

        System.out.printf("A área do retângulo de base %.2f e altura %.2f é igual %.2f.\n",
                rectangleBase, rectangleHeight, rectangleArea);

        // Trapezoid:
        double trapezoidBase1 = 10;
        double trapezoidBase2 = 20;
        double trapezoidHeight = 10;

        double trapezoidArea = AreaCalculator.getQuadrilateralArea(trapezoidBase1, trapezoidBase2, trapezoidHeight);

        System.out.printf("A área do trapézio de bases %.2f e %.2f e altura %.2f é igual %.2f.\n",
                trapezoidBase1, trapezoidBase2, trapezoidHeight, trapezoidArea);

    }

}
