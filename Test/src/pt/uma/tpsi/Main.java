package pt.uma.tpsi;

public class Main {

    public static void main(String[] args) {
        int perimeter = calculatePerimeter(2, 4);
        System.out.println("O perímetro do retângulo é: " + perimeter);

        int volume = calculateVolume(10, 5, 8);
        System.out.println("O volume do paralelepipedo é: " + volume);

        float f = 100;
        float c = (float) ((f - 32) * (5.0 / 9.0));
        System.out.println ("a temperatura é de: " + c);

        int seconds = calculateSeconds(10);
        System.out.println("10 minutos são " + seconds + " segundos ");
    }

    private static int calculatePerimeter(int base, int altura) {
        int perimeter = 2 * (base + altura);
        return perimeter;
    }

    private static int calculateVolume(int larguraBase, int comprimentoBase, int altura) {
        int volume = larguraBase * comprimentoBase * altura;
        return volume;
    }

    private static int calculateSeconds(int minutes) {
        int seconds = minutes * 60;
        return seconds;
    }
}

