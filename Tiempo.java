package TEMA5;

public class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        normalizarTiempo();
    }

    private void normalizarTiempo() {
        if (segundos >= 60) {
            minutos += segundos / 60;
            segundos %= 60;
        }
        if (minutos >= 60) {
            horas += minutos / 60;
            minutos %= 60;
        }
    }

    public Tiempo suma(Tiempo otro) {
        return new Tiempo(this.horas + otro.horas, this.minutos + otro.minutos, this.segundos + otro.segundos);
    }

    public Tiempo resta(Tiempo otro) {
        int totalSegundos1 = this.horas * 3600 + this.minutos * 60 + this.segundos;
        int totalSegundos2 = otro.horas * 3600 + otro.minutos * 60 + otro.segundos;
        int diferenciaSegundos = Math.max(totalSegundos1 - totalSegundos2, 0);

        int horas = diferenciaSegundos / 3600;
        int minutos = (diferenciaSegundos % 3600) / 60;
        int segundos = diferenciaSegundos % 60;

        return new Tiempo(horas, minutos, segundos);
    }

    @Override
    public String toString() {
        return horas + "h " + minutos + "m " + segundos + "s";
    }

    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(1, 20, 30);
        Tiempo t2 = new Tiempo(0, 45, 50);

        Tiempo suma = t1.suma(t2);
        Tiempo resta = t1.resta(t2);

        System.out.println("Tiempo 1: " + t1);
        System.out.println("Tiempo 2: " + t2);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
    }
}