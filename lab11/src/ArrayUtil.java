import java.util.*;

public class ArrayUtil
{
    static public <T extends Comparable<T>> boolean isSorted(T[] items)
    {
        for (int i = 0; i < items.length-1; i++)
        {
            if (items[i].compareTo(items[i + 1]) > 0)
            {
                return false;
            }
        }

        return true;
    }

    static public <T extends Comparable<T>> int binSearch(T[] items, T item) throws RuntimeException
    {
        if (!ArrayUtil.isSorted(items))
        {
            throw new RuntimeException("Array isn't sorted!");
        }

        int left = 0;
        int right = items.length -1;
        int index;

        while (left <= right)
        {
            index = (int)Math.floor((left + right)/2);
            if (items[index].compareTo(item) < 0)
            {
                left = index + 1;
            }
            else if (items[index].compareTo(item) > 0)
            {
                right = index - 1;
            }
            else
            {
                return index;
            }
        }

        return -1;
    }

    static private <T extends Comparable<T>> int getIndexOfMin(int index, T[] items)
    {
        int result = index;
        T min = items[index];
        for (; index < items.length; index++)
        {
            int tmp = items[index].compareTo(min);
            if (tmp < 0)
            {
                result = index;
                min = items[index];
            }
        }
        return result;
    }

    static public <T extends Comparable<T>> void selectionSort(T[] items)
    {
        for (int i = 0; i < items.length; i++)
        {
            int index = getIndexOfMin(i, items);
            T tmp = items[i];
            items[i] = items[index];
            items[index] = tmp;
        }
    }

    static private <T extends Comparable<T>> void merge(T[] items, int left, int center, int right)
    {
        int leftSize = center-left+1;
        int rightSize = right-center;
        ArrayList<T> leftArray = new ArrayList<T>();
        ArrayList<T> rightArray = new ArrayList<T>();

        for (int i = 0; i < leftSize; i++)
        {
            leftArray.add(i, items[left+i]);
        }
        for (int i = 0; i < rightSize; i++)
        {
            rightArray.add(i, items[center+i+1]);
        }

        int i=0, j=0;
        int main = left;
        for(;main <= right && i < leftSize && j < rightSize; main++)
        {
            if(leftArray.get(i).compareTo(rightArray.get(j)) <= 0)
            {
                items[main] = leftArray.get(i++);
            }
            else
            {
                items[main] = rightArray.get(j++);
            }
        }
        for(; i < leftSize; i++)
        {
            items[main++] = leftArray.get(i);
        }

        for(; j < rightSize; j++)
        {
            items[main++] = rightArray.get(j);
        }
    }

    static private <T extends Comparable<T>> void mergeSortMain(T[] items, int left, int right)
    {
        if (left < right)
        {
            int center = (left + right) / 2;
            mergeSortMain(items, left, center);
            mergeSortMain(items, center+1, right);
            merge(items, left, center, right);
        }
    }

    static public <T extends Comparable<T>> void mergeSort(T[] items)
    {
        ArrayUtil.mergeSortMain(items, 0, items.length-1);
    }
}