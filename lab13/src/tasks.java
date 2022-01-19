import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Tasks
{
    PriorityQueue<Task> tasks;

    public Tasks()
    {
        tasks = new PriorityQueue<Task>();
    }

    public void dodaj(Task task)
    {
        tasks.add(task);
    }

    public void zakoncz()
    {
        System.exit(0);
    }

    public void nastepne()
    {
        Task tmp = tasks.poll();
        System.out.print("");
    }
}