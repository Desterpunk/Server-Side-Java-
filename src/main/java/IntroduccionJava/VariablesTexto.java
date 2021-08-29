package IntroduccionJava;

import java.io.*;

public class VariablesTexto {
    public static void main(String[] args) {
        String texto = "";
        int x = 0;
//        texto = String.valueOf(x);
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            texto = bufferedReader.readLine();
            x = Integer.parseInt(texto);
            System.out.println("(x+1) = " + (x+1));
        } catch (Exception e){
            System.out.println("Escribe un numero");
        };
//        texto = texto.concat("-Esto es una concatenacion");
//        texto = texto.toLowerCase();
//        texto = texto.toUpperCase();
//        int longitudTexto = texto.length();
//        System.out.println(texto);
//        System.out.println("longitudTexto = " + longitudTexto);

    }
}
