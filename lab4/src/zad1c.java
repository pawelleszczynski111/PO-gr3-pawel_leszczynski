import java.util.Random;
public class zad1c {
    public static int getRandomNumber(int min, int max)
    {
        Random r = new Random();
        int x = r.nextInt(max-min)+min;
        return x;
    }
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(11);
        int tab[] = new int[n];
        int licz=0;
        for(int i=0; i<n; i++)
        {
            int a = getRandomNumber(-999, 999);
            tab[i]=a;
            System.out.println("Element: " + a);
        }
        int max=tab[0];
        for(int j=1; j<n; j++)
        {
            if(tab[j]>max)
                max=tab[j];
        }
        for(int j=0; j<n; j++)
        {
            if(tab[j]==max)
                licz++;
        }
        System.out.println("Maksimum: " + max);
        System.out.println("Ilosc maksimum: " + licz);


    }
}