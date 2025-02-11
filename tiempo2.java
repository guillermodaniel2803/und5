package TEMA5;

public class tiempo2 {
    int horas;
    int minutos;
    int segundos;
    tiempo2(int h, int m, int s){
        this.horas =h;
        this.minutos =m;
        this.segundos =s;

    }

    tiempo2(int h){
        this.horas = h;
        this.minutos = 0;
        this.segundos = 0;

    }

    tiempo2(int h, int m){
        this.horas = h;
        this.minutos = m;
        this.segundos = 0;

    }



    @Override
     public String toString(){
        return (this.horas + "h " + this.minutos + "m " + this.segundos + "s ");

    }
}
