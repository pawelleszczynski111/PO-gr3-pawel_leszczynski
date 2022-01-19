public class PairDemo
{
    public static void main(String[] args)
    {
        Pair<String> pair = new Pair<String>("Paweł", "Leszczyński");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        pair.swap();
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}