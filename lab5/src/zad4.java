import java.util.ArrayList;
public class zad4 {
    public static ArrayList<Integer> reversed (ArrayList<Integer> a){
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        for(int i=a.size(); i>=0; i--){
            if(i<=a.size()-1)
                lista1.add(a.get(i));
        }
        return lista1;
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

        ArrayList<Integer> wynik1 = reversed(a);
        ArrayList<Integer> wynik2 = reversed(b);
        System.out.print(wynik1);
        System.out.print(wynik2);

    }

}