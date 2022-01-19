
import java.util.Random;
public class zad1e {
    public static int getRandomNumber(int min, int max)
    {
        Random r = new Random();
        int x = r.nextInt(max-min)+min;
        return x;
    }
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(11);
        int dlugosc=1;
        int max_dlugosc=1;
        int tab[] = new int[n];

        for(int i=0; i<n; i++)
        {
            int a = getRandomNumber(-999, 999);
            tab[i]=a;
            System.out.println("Element: " + a);
        }
        for(int j=0; j<n-1; j++)
        {
            if(tab[j]>0 && tab[j+1]>0)
            {
                dlugosc++;
                if(dlugosc>max_dlugosc)
                    max_dlugosc=dlugosc;
                else
                    dlugosc=1;
            }
        }
        System.out.println("Max dlugosc: " + max_dlugosc);

    }
}