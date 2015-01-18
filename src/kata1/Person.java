package kata1;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Person {
    
    private String name;
    private String birthday; /*dd/mm/yyyy*/

    public Person(String name,String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }
    
    public int Age () throws ParseException{
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        Date fecha = df.parse(birthday);        
        return (int)(((new Date().getTime() - fecha.getTime())/(1000*24*3600)/365));
    }

 

}
