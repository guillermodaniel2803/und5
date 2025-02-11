package TEMA5;

public class mincommultp {
    public static void main(String[] args) {
        int numero1 = 15;
        int numero2 = 12;

        MCDCalculator calculadora = new MCDCalculator(numero1, numero2);

        int resultado = calculadora.calcularMCD();

        System.out.println("El MCD de " + numero1 + " y " + numero2 + " es: " + resultado);
    }
}

class MCDCalculator {
    private int numero1;
    private int numero2;

    public MCDCalculator(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int calcularMCD() {
        int a = numero1;
        int b = numero2;

        while (b != 0) {
            int residuo = a % b;
            a = b;
            b = residuo;
        }

        return a;
    }
}