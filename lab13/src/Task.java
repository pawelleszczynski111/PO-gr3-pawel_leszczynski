public class Task implements Comparable<Task>
{
    Integer priority;
    String description;

    public Task(Integer priority, String description)
    {
        this.priority = priority;
        this.description = description;
    }

    public int compareTo(Task other)
    {
        return Integer.compare(priority, other.priority);
    }
}