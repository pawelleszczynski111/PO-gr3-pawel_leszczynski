import java.util.Iterator;
import java.util.LinkedList;

public class Utils
{
    static public <T> void redukuj(LinkedList<T> pracownicy, int n)
    {
        int helper = 1;
        for (int i = 0; i < pracownicy.size()*2; i++)
        {
            if (i % n == 0 && i != 0)
            {
                pracownicy.remove(i-helper);
                helper++;
            }
        }
    }

    static public <T> void odwroc(LinkedList<T> lista)
    {
        for (int i = 0; i < lista.size()/2; i++)
        {
            int index = lista.size()-1-i;
            T tmp = lista.get(index);
            lista.set(index, lista.get(i));
            lista.set(i, tmp);
        }
    }

    static public <T extends Iterable> void print(T object)
    {
        System.out.println();
        Iterator<T> iterator = object.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next() + (iterator.hasNext() ? ", " : ""));
        }
        System.out.println();
    }
}