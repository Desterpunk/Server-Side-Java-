package IntroduccionJava;

public class POO {
    public static void main(String[] args) {
//        Pelota p = new Pelota(300,300);
//        System.out.println("peso de la pelota:  = " + p.getPeso());
//        Carro carro = new Carro();
//        carro.encender();
//        carro.estado();
//        CarroBMW carroBMW = new CarroBMW();
//        carroBMW.turbo();
//        carroBMW.estado();
//        CarroToyota carroToyota = new CarroToyota();
//        System.out.println("Modelo carroToyota = " + carroToyota.obtenerModelo());
        Carro carro = new CarroToyota();
        carro.informacion();
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

class Carro {
    private double peso;
    private double altura;
    private double ancho;
    private double largo;
    private int numeroPuertas;
    private String modelo;
    private boolean encendido = false;

    public Carro(){
        this.peso = 1000;
        this.altura = 10;
        this.ancho = 20;
    }

    public double obtenerPeso() {
        return peso;
    }
    public void encender() {
        encendido = true;
    }
    public void apagar() {
        encendido = false;
    }
    public void  estado() {
        if (this.encendido) {
            System.out.println("El carro esta encendido");
        } else {
            System.out.println("El carro esta apagado");
        }
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String obtenerModelo() {
        return modelo;
    }
    public void informacion() {
        System.out.println("Este es un carro comun y corriente");
    }
}

class CarroBMW extends Carro {
    public CarroBMW() {
        this.setModelo("BMW");
    }
    public void turbo(){
        System.out.println("Turbo activado!");
    }

    @Override
    public void informacion() {
        System.out.println("Este es un BMW del año 2011");
    }
}

class CarroToyota extends Carro {
    public CarroToyota() {
        this.setModelo("Toyota");
    }

    @Override
    public void informacion() {
        System.out.println("Este es un Toyota del año 2010");
    }
}