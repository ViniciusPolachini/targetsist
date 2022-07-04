import java.io.*;

public class Atv4{
    public static void main(String args[]){
        String texto = args[0];
        String inverso = "";
        int tamanho = texto.length();
        for(int i=tamanho-1; i>=0; i--){
            inverso+=texto.charAt(i);
        }
        System.out.println(inverso);
    }
}