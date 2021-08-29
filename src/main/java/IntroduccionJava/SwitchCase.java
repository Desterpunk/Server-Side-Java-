package IntroduccionJava;

public class SwitchCase {
    public static void main(String[] args) {
        int x = 3;
        switch (x) {
            case 0:{
                System.out.println("x = " + x);
                break;
            } case 1: {
                System.out.println("x = " + x);
                break;
            } default: {
                System.out.println(" Opcion por defecto ");
            }
        }
    }
}
