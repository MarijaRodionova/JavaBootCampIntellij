import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Person extends Exception {


    public String firstName;
    public String lastName;
    public int age;
    private Object Person;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {


        Person person = new Person("Albert", "Lee", 9);


        System.out.println("My first name is " + person.firstName);
        System.out.println("My last name is " + person.lastName);
        System.out.println("My age is " + person.age);

        TryCatch obj = new TryCatch();
        obj.catchObj();


    }

    String obj;

    public void catchObj() {
        System.out.println(obj);

        try {
            System.out.println(obj.toUpperCase());
        } catch (NullPointerException ex) {
            System.out.println("Not initialized " + ex.getMessage());
        }
        System.out.println(obj);
    }

//    public void setName(String name) throws Exception {
//
//        if (firstName == null || name.isEmpty());
//        { throw new Exception();
//        }
//
//
//        try {
//            setName();
//        } catch (Exception ce) {
//            System.out.println("Cannot be a number or contain a number" + ce);
//            System.out.println(ce.getMessage());
//        }
//
//
//    }
}


