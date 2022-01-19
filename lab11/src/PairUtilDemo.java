public class PairUtilDemo
{
    public static void main(String[] args)
    {
        Pair<String> pair = new Pair<String>("arek", "kowalski");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        PairUtil.swap(pair);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}