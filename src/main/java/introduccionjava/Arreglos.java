package introduccionjava;

public class Arreglos {
    public static void main(String[] args) {
        int x[] = new int[10];
        int y[] = {1,3,4};
        for (int i = 0; i < x.length; i++) {
            x[i] = i;
            System.out.println("x = " + x[i]);
        }
    }
}
