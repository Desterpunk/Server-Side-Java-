package introduccionjava;

public class Matrices {
    public static void main(String[] args) {
        int x[][] = new int[3][3];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                x[i][j] = j;
                System.out.println("x = " + x[i][j]);
            }
        }
    }
}
