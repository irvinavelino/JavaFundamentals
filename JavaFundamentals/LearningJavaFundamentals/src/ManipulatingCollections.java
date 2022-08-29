import java.util.*;

public class ManipulatingCollections
{
    public static void main(String[] args)
    {
        List<String> firstList=new ArrayList<>();
        firstList.add("one");
        firstList.add("two");

        for (String s:firstList)
        {
            System.out.println(s);
        }
        Collections.sort(firstList);
        for (String s:firstList)
        {
            System.out.println(s);
        }
        Map<Integer,Book>bookMap=new HashMap<>();
        bookMap.put(17, new Book("a good read","Matt Greencroft",17.99));
        bookMap.put(18, new Book("a good read1","Matt Greencroft",17.99));
        bookMap.put(19, new Book("a good read3","Matt Greencroft",17.99));

        System.out.println(bookMap.size());
    }
}
