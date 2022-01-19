import java.util.Random;
public class zad1a {
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
        int parzyste=0;
        int nieparzyste=0;
        for(int i=0; i<n; i++)
        {
            int a = getRandomNumber(-999, 999);
            tab[i]=a;
            System.out.println("Element: " + a);
        }
        for(int j=0; j<n; j++)
        {
            if(tab[j]%2!=0)
                nieparzyste++;
            else
                parzyste++;
        }
        System.out.println("Ilosc nieparzystych: " + nieparzyste);
        System.out.println("Ilosc parzystych: " + parzyste);


    }
}