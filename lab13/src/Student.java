public class Student implements Comparable<Student>
{
    String name;
    String surname;
    protected Integer id;
    private static Integer counter = 0;

    public Student(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
        this.id = counter++;
    }

    @Override
    public int compareTo(Student o)
    {
        if (this.surname.compareTo(o.surname) > 0)
        {
            return 1;
        }
        else if (this.surname.compareTo(o.surname) < 0)
        {
            return -1;
        }
        else
        {
            if (this.name.compareTo(o.name) > 0)
            {
                return 1;
            }
            else if (this.name.compareTo(o.name) < 0)
            {
                return -1;
            }
            else
            {
                return Integer.compare(this.id, o.id);
            }
        }

    }
}