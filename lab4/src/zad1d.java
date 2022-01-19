import java.util.Random;
public class zad1d {
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
        int dodatnie=0;
        int ujemne=0;
        for(int i=0; i<n; i++)
        {
            int a = getRandomNumber(-999, 999);
            tab[i]=a;
            System.out.println("Element: " + a);
        }
        for(int j=0; j<n; j++)
        {
            if(tab[j]>0)
                dodatnie+=tab[j];
            else if (tab[j]<0)
                ujemne+=tab[j];
        }
        System.out.println("Suma dodatnich: " + dodatnie);
        System.out.println("Suma ujemnych: " + ujemne);

    }
}