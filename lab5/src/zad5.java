import java.util.ArrayList;
public class zad5 {
    public static void reverse (ArrayList<Integer> a) {
        int pom = 0;
        for (int i=0; i<a.size()/2; i++) {
            pom = a.get(i);
            a.set(i, a.get(a.size() - i - 1));
            a.set(a.size() - i - 1, pom);
        }
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

        wyswietl(a);
        System.out.println("=====");
        reverse(a);
        wyswietl(a);
        System.out.println("=====");


    }

}