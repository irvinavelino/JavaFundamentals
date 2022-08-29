public class Exceptions
{
    public static void main(String[] args)
    {
        try
        {
            User user1=new User("Matt",21);
            User user2=new User("Irvin",-10);
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e.toString());
        }


    }
}
