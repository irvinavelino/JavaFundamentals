import java.util.Date;
import java.util.GregorianCalendar;

public class JavaLibraries
{
    public static void main(String[] args)
    {
        Date today=new Date();
        GregorianCalendar calendar =new GregorianCalendar();
        GregorianCalendar birthday =new GregorianCalendar(1995,3,10);
        Date birthdayDate =birthday.getTime();
        System.out.println(today);
    }
}
