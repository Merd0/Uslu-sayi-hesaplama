import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int n,k,total =1;
        System.out.print("Üssü alıncak sayıyı giriniz :");
        n = inp.nextInt();

        System.out.print("Üs olcak sayıyıyı giriniz :");
        k = inp.nextInt();

        for ( int i = 1 ; i <= k ; i++  ){
            total = total * n;

        } System.out.println("Sonuç :" + total);
    }
}