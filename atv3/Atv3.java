import java.io.*;

public class Atv3{
    public static void main(String args[]){
        float[] valor = {67836.43F, 36678.66F, 29229.88F, 27165.48F, 19849.53F};
        String[] estado = {"SP", "RJ", "MG", "ES", "Outros"};
        float total=0;
        for(int i=0; i<5; i++){
            total+=valor[i];
        }
        float porcentagem = 0;
        for(int i=0; i<5; i++){
            porcentagem = valor[i]*100/total;
            System.out.println(estado[i]+" %"+Float.toString(porcentagem));
        }
    }
}