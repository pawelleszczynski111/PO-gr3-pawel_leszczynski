import java.util.ArrayList;
import java.util.Collections;

public class zad3 {
    public static ArrayList<Integer> mergeSorted (ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> lista1 = new ArrayList<Integer>(10);
        int n=0;
        if(a.size()>b.size())
            n = a.size();
        else n = b.size();
        for(int i=0; i<10; i++) {
            if(i<=a.size()-1)
                lista1.add(a.get(i));
            if(i<=b.size()-1)
                lista1.add(b.get(i));
        }
        Collections.sort(lista1);
        return lista1;
    }
    public static void wyswietl(ArrayList a){
        for (int i = 0; i < a.size();i++)
        {
            System.out.println(a.get(i));
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        ArrayList<Integer> wynik = mergeSorted(a,b);
        //Collections.sort(wynik);
        wyswietl(wynik);

    }

}