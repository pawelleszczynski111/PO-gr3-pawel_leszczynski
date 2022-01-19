import java.time.LocalDate;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("========================= 3 =============================================");
        ArrayList<Integer> integers = new ArrayList<Integer>(List.of(10, 2, 4, 4, 1, 6, 7, 3 , 9, 8));
        ArrayList<Integer> integersSorted = (ArrayList<Integer>) integers.clone();
        Collections.sort(integersSorted);
        ArrayList<LocalDate> dates = new ArrayList<LocalDate>(List.of(
                LocalDate.of(2020, 1, 8),
                LocalDate.of(1999, 12, 3),
                LocalDate.of(2020, 1, 8),
                LocalDate.of(2232, 1, 5),
                LocalDate.of(113, 4, 3)
        ));
        ArrayList<LocalDate> datesSorted = (ArrayList<LocalDate>) dates.clone();
        datesSorted.sort(Comparator.naturalOrder());
        System.out.println(integers);
        System.out.println(integersSorted);
        System.out.println(dates);
        System.out.println(datesSorted);

        System.out.println(ArrayUtil.isSorted(
                Arrays.copyOf(integers.toArray(),
                        integers.toArray().length,
                        Integer[].class)));
        System.out.println(ArrayUtil.isSorted(
                Arrays.copyOf(integersSorted.toArray(),
                        integersSorted.toArray().length,
                        Integer[].class)));
        System.out.println(ArrayUtil.isSorted(
                Arrays.copyOf(dates.toArray(),
                        dates.toArray().length,
                        LocalDate[].class)));
        System.out.println(ArrayUtil.isSorted(
                Arrays.copyOf(datesSorted.toArray(),
                        datesSorted.toArray().length,
                        LocalDate[].class)));

        System.out.println("========================= 4 =============================================");
        System.out.println(ArrayUtil.binSearch(
                Arrays.copyOf(integersSorted.toArray(),
                        integersSorted.toArray().length,
                        Integer[].class),
                2
        ));
        System.out.println(ArrayUtil.binSearch(
                Arrays.copyOf(datesSorted.toArray(),
                        datesSorted.toArray().length,
                        LocalDate[].class),
                LocalDate.of(113, 4, 3)
        ));

        System.out.println("========================= 5 =============================================");
        Integer[] integers5 = Arrays.copyOf(integers.toArray(), integers.toArray().length, Integer[].class);
        LocalDate[] dates5 = Arrays.copyOf(dates.toArray(), dates.toArray().length, LocalDate[].class);
        ArrayUtil.selectionSort(integers5);
        ArrayUtil.selectionSort(dates5);
        for (Iterator it = Arrays.asList(integers5).iterator(); it.hasNext();)
        {
            System.out.print(it.next() + ", ");
        }
        System.out.println();
        for (Iterator it = Arrays.asList(dates5).iterator(); it.hasNext();)
        {
            System.out.print(it.next() + ", ");
        }

        System.out.println("\n========================= 6 =============================================");
        Integer[] integers6 = Arrays.copyOf(integers.toArray(), integers.toArray().length, Integer[].class);
        LocalDate[] dates6 = Arrays.copyOf(dates.toArray(), dates.toArray().length, LocalDate[].class);
        ArrayUtil.mergeSort(integers6);
        ArrayUtil.mergeSort(dates6);
        for (Iterator it = Arrays.asList(integers6).iterator(); it.hasNext();)
        {
            System.out.print(it.next() + ", ");
        }
        System.out.println();
        for (Iterator it = Arrays.asList(dates6).iterator(); it.hasNext();)
        {
            System.out.print(it.next() + ", ");
        }
    }
}