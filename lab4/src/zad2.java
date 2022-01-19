import java.util.Random;
public class zad2 {
    public static int getRandomNumber(int min, int max)
    {
        Random r = new Random();
        int x = r.nextInt(max-min)+min;
        return x;
    }
    public static int[] generuj(int tab[], int n, int minWartosc, int maxWartosc)
    {
        tab[] = new int[n];
        for (int i=0; i < n; i++)
        {
            int a = getRandomNumber(minWartosc, maxWartosc);
            tab[i] = a;
        }
        return tab;
    }
    public static int ileNieparzystych(int tab[])
    {
        int nieparzyste=0;
        int n = tab.length;
        for(int j=0; j<n; j++)
        {   if(tab[j]%2!=0)
            nieparzyste++;
        }
        return nieparzyste;
    }
    public static int ileParzystych(int tab[])
    {
        int parzyste=0;
        int n = tab.length;
        for(int j=0; j<n; j++)
        {
            if(tab[j]%2==0)
                parzyste++;
        }
        return parzyste;
    }
    public static void main(String[] args)
    {
        int tablica[];
        System.out.println(generuj(tablica[], 10, -999, 999));
        ileParzystych(tablica);

    }
}