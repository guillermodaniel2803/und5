package TEMA5;
class Punto {
    private double x;
    private double y;

    // Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Métodos getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Método toString para representar el punto
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }
}

class Linea {
    private Punto p1;
    private Punto p2;

    // Constructor
    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Método toString para representar la línea
    @Override
    public String toString() {
        return "Línea formada por los puntos " + p1 + " y " + p2;
    }
}

