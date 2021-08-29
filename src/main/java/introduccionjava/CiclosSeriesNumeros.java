package introduccionjava;

public class CiclosSeriesNumeros {
    public static void main(String[] args) {
//        impares var1 = new impares(100);
//        fibonacci var = new fibonacci(30);
    }

}
class impares{
    public impares(int numero){
        for (int i = 0; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println("i = " + i);
            }
        }
    }
}

class fibonacci {
    public fibonacci(int limit) {
        int x = 1;
        int anterior = 0;
        int temp;
        while (true) {
            System.out.println("x = " + x);
            temp = x;
            x += anterior;
            anterior = temp;
            if (x>limit){
                break;
            }
        }
    }
}

