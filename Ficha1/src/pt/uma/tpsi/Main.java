package pt.uma.tpsi;

// Your First Program

public class Main {

    public static void main(String[] args) {
        int perimeter = calculatePerimeter ();
        System.out.println("O perímetro do retângulo é: " + perimeter);
    }

    private static int calculatePerimeter() {
        return 2 * (2 + 4);
    }
}