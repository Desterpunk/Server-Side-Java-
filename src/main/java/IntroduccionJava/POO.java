package IntroduccionJava;

public class POO {
    public static void main(String[] args) {
        Pelota p = new Pelota(300,300);
        System.out.println("peso de la pelota:  = " + p.getPeso());

    }
}

class Pelota{
    private float radio;
    private float peso;
    public Pelota(){
        radio = 100;
        peso = 250;
    }
    public Pelota(float radio, float peso){
        this.radio = radio;
        this.peso = peso;
    }
    public float getRadio() {
        return radio;
    }
    public float getPeso() {
        return peso;
    }
    public void atraparPelota() {
        System.out.println("Haz atrapado la pelota");
    }
    public void patearPelota() {
        System.out.println("Haz pateado la pelota");
    }
}