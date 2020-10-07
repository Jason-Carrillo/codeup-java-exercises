import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5};
//        System.out.println(Arrays.toString(numbers));

        String[] persons = {"Bon", "Bob", "Joe"};
        String[] newPerson = Arrays.copyOf(persons, persons.length + 1);


        for(String person: persons) {
            System.out.println(person);
        }

        newPerson[newPerson.length - 1] = "Sam";
        System.out.println("newPerson = " + Arrays.toString(newPerson));
        System.out.println(addName(persons, "Jae"));





//        END of Main
    }


    public static String addName(String Person[], String newPerson ){
        String[] newArray = Arrays.copyOf(Person, Person.length + 1);
        newArray[newArray.length-1] = newPerson;

        return Arrays.toString(newArray);
    }

}
