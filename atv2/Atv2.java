import java.io.*;

public class Atv2{
    public static void main(String args[]){
        int numero = Integer.parseInt(args[0]);
        int[] fribonacci = {0,1};
        int aux = 1;
        while(fribonacci[1]<numero){
            fribonacci[1] = fribonacci[0]+fribonacci[1];
            fribonacci[0] = aux;
            aux = fribonacci[1];
        }
        if(numero==fribonacci[1] || numero==fribonacci[0]){
            System.out.println("O número pertence a sequência");
        }else{
            System.out.println("O número não pertence a sequência");
        }
    }
}
