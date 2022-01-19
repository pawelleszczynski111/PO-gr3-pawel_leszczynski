public class Pair<T> {

    T first;
    T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public void setSecond(T newValue) {
        second = newValue;
    }

    public void swap()
    {
        if (first != null && second != null)
        {
            T tmp = first;
            first = second;
            second = tmp;
        }
    }
}