import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("--------------------------1------------------------------");
        Tasks tasks = new Tasks();
        Task task0 = new Task(0, "dziecko");
        Task task1 = new Task(3, "biegnie");
        Task task2 = new Task(8, "do");
        Task task3 = new Task(3, "sklepu");
        Task task4 = new Task(0, "teraz");
        tasks.dodaj(task0);
        tasks.dodaj(task1);
        tasks.dodaj(task2);
        tasks.dodaj(task3);
        tasks.dodaj(task4);

        tasks.nastepne();
        System.out.println("\n--------------------------2 and 3------------------------------");
        StudentDB db = new StudentDB();
        Student student1 = new Student("Arek", "Kowalski");
        db.add(new Student("Ryszard", "Nowak"), "db");
        db.add(student1, "db+");
        db.add(new Student("Janek", "Bziukiewicz"), "bdb");
        //db.remove(student1);
        System.out.println(db);

        System.out.println("--------------------------4------------------------------");
        Map<Integer, HashSet<String>> map = new HashMap<Integer, HashSet<String>>();
        try
        {
            File file = new File("file.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext())
            {
                ArrayList<String> words = new ArrayList<String>(Arrays.asList(scanner.next().split(" ")));
                Iterator<String> it = words.iterator();
                while (it.hasNext())
                {
                    String word = it.next();
                    int tmp = word.hashCode();
                    if (map.containsKey(tmp))
                    {
                        map.get(word.hashCode()).add(word);
                    }
                    else
                    {
                        HashSet<String> subMap = new HashSet<String>();
                        map.put(word.hashCode(), subMap);
                    }
                }
            }
            Iterator<Integer> it = map.keySet().iterator();
            while (it.hasNext())
            {
                Integer integer = it.next();
                if (map.get(integer).size() == 1)
                {
                    System.out.println(map.get(integer));
                }
            }
        }
        catch (FileNotFoundException e)
        {
            return;
        }
    }
}