package kata1;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Kata1 {

    public static void main(String[] args) throws ParseException {
        Person person = new Person("Aitor","08/09/1994");
        System.out.println("Su edad es la siguiente " + person.Age());
        
    }
}
