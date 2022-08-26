public class ArrayOfObjects
{
    public static void main(String[] args)
    {
        int[] numbers={1,2,3};
        Book[] books=new Book[10];

        books[4]=new Book("a good read","Matt Greencroft",17.99);
        Book myBook=null;
        if(myBook !=null)
        {
            System.out.println(myBook.getTitle());
        }
        for (int i = 0; i < 10; i++)
        {
            if(books[i]!=null)
            {
                System.out.println(books[i].getTitle());
            }
        }
        for(Book book:books)
        {
            if(book !=null)
            {
                System.out.println(book.getTitle());
            }
        }
    }
}
