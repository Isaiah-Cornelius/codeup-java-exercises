import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;


public class ArraysExercises {

    private static Person[] personArray = new Person[3];

    private static Person[] addPerson(Person[] arrayOfPersonObjects, Person person){
        Person[] newPersonArray = Arrays.copyOf(arrayOfPersonObjects, (arrayOfPersonObjects.length + 1));
        newPersonArray[newPersonArray.length -1] = person;
        return newPersonArray;
    }

    private static Person[] addPerson(Person[] arrayOfPersonObjects, String name){
        Person newPerson = new Person(name);
        Person[] newPersonArray = Arrays.copyOf(arrayOfPersonObjects, (arrayOfPersonObjects.length + 1));
        newPersonArray[newPersonArray.length -1] = newPerson;
        return newPersonArray;
    }


    public static void main(String[] args) {

        personArray[0] = new Person("Person 1");
        personArray[1] = new Person("Person 2");
        personArray[2] = new Person("Person 3");
        Person person4 = new Person("Person 4");

        for (Person person : addPerson(personArray, person4)){
            System.out.println(person.getName());
        }

        for (Person person : addPerson(personArray, "Isaiah")){
            System.out.println(person.getName());
        }

    }
}
