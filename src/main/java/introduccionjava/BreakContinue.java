package introduccionjava;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            if (i == 4) {
                break;
            }
        }
        System.out.println("haz dejado el ciclo");
    }
}
