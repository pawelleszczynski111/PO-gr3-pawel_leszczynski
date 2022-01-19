import java.time.chrono.ChronoLocalDate;
import java.util.*;

public class Main
{
    static public void main(String[] args)
    {
        System.out.println("\n-------------------------1--------------------------");
        LinkedList<Integer> pracownicy = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Utils.redukuj(pracownicy, 2);
        System.out.println(pracownicy);
        System.out.println("\n-------------------------3--------------------------");
        LinkedList<Integer> lista = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Utils.odwroc(lista);
        System.out.println(lista);
        System.out.println("\n-------------------------5--------------------------");
        {
            Stack<String> stack = new Stack<String>();
            String string = new String("Ala ma kota. Jej kot jest koloru czarnego.");
            String tmp = new String();
            for (int i = 0; i < string.length(); i++)
            {
                char character = string.charAt(i);
                if (character == ' ' && tmp == "")
                    continue;

                if ((character == ' ' || character == '.'))
                {
                    stack.push(tmp);
                    if (character == '.')
                        stack.push(String.valueOf(character));
                    tmp = "";
                }
                else
                {
                    tmp += Character.toLowerCase(character);
                }
            }

            tmp = "";
            String main = new String();
            while (stack.size() != 0)
            {

                String substring = stack.pop();
                if (substring.equals(".") || stack.size() == 0)
                {
                    if (tmp.equals(""))
                        continue;
                    if (stack.size() == 0)
                    {
                        tmp += " " + substring;
                    }
                    main = tmp.substring(1, 2).toUpperCase() + tmp.substring(2) + ". " + main;
                    tmp = "";
                }
                else
                {
                    tmp += " " + substring;
                }
            }
            System.out.println(main);
        }
        System.out.println("\n-------------------------6--------------------------");
        int number = 2015;
        Stack<Integer> stack = new Stack<Integer>();
        while (number != 0)
        {
            stack.push(number % 10);
            number /= 10;
        }
        while (!stack.isEmpty())
        {
            System.out.print(stack.pop());
        }
        System.out.println("\n-------------------------7--------------------------");
        int n = 21;
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i < n; i++)
        {
            primes.add(i);
        }
        for (int i = 2; i < n; i++)
        {
            for (int j = 0; j < primes.size(); j++)
            {
                if (primes.get(j)%i == 0 && primes.get(j) != i)
                {
                    primes.remove(j);
                    j--;
                }
            }
        }
        System.out.println(primes);
        System.out.println("\n-------------------------8--------------------------");
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("arek1", "arek2", "arek3", "arek4"));
        Utils.print(arrayList);
        stack.add(9);
        stack.add(9);
        stack.add(7);
        Utils.print(stack);

    }
}