package IntroduccionJava;

import java.io.BufferedReader;
import java.io.FileReader;

public class LeerTextos {
    public static void main(String[] args) {
        Textos textos = new Textos();
        textos.leer("archivo.txt");
    }
}

class Textos {
    public void leer(String nombreArchivo){
        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
            String temp = "";
            while (temp != null){
                temp = bufferedReader.readLine();
                if(temp == null){
                    break;
                }
                System.out.println(temp);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}