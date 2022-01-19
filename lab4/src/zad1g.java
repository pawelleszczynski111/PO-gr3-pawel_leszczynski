import java.util.Random;
import java.util.Scanner;
public class zad1g {
    public static int getRandomNumber(int min, int max)
    {
        Random r = new Random();
        int x = r.nextInt(max-min)+min;
        return x;
    }
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        int n = r.nextInt(11)-1;
        int tab[] = new int[n];

        System.out.println("Podaj dwie liczby mniejsze od " +n);
        int lewy = scan.nextInt();
        int prawy = scan.nextInt();
        for(int i=0; i<n; i++)
        {
            int a = getRandomNumber(-999, 999);
            tab[i]=a;
            System.out.println("Element: " + a);
        }
        while(lewy<prawy)
        {
            int pomocnicza = tab[lewy];
            tab[lewy]=tab[prawy];
            tab[prawy]=pomocnicza;
            lewy++;
            prawy--;

        }
        for(int i=0; i<n; i++)
        {
            System.out.println("Element po zmianie: " + tab[i]);
        }
    }
}