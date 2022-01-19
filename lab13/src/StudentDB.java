import com.sun.source.tree.Tree;

import java.util.*;

public class StudentDB
{
    HashMap<Integer, Student> db1;
    TreeMap<Student, String> db2;

    public StudentDB()
    {
        db1 = new HashMap<Integer, Student>();
        db2 = new TreeMap<Student, String>();
    }

    public void add(Student student, String grade)
    {
        db1.put(student.id, student);
        db2.put(student, grade);
    }

    public void remove(Student student)
    {
        Student sToR = db1.get(student.id);
        db1.remove(sToR.id);
        db2.remove(sToR);
    }

    public void change(Student student, String grade)
    {
        Student sToR = db1.get(student.id);
        db2.replace(sToR, grade);
    }

    @Override
    public String toString()
    {
        String result = new String();
        Iterator<Student> iterator = db2.keySet().iterator();
        while(iterator.hasNext())
        {
            Student student = iterator.next();
            result += student.name + ": " + db2.get(student) + "\n";
        }
        return result;
    }
}