import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5};
//        System.out.println(Arrays.toString(numbers));


        Person[] allPeople = new Person[3];
        allPeople[0] = new Person("Mike");
        allPeople[1] = new Person("Joe");
        allPeople[2] = new Person("Bill");

        for (Person aPerson : allPeople){
            System.out.println(aPerson.getName());
        }

//        String[] persons = {"Bon", "Bob", "Joe"};
//        String[] newPerson = Arrays.copyOf(allPeople, allPeople.length + 1);
//
//
//        for(String person: persons) {
//            System.out.println(person);
//        }
//
//        newPerson[newPerson.length - 1] = "Sam";
//        System.out.println("newPerson = " + Arrays.toString(newPerson));
//        System.out.println(addName(allPeople, "Jae"));





//        END of Main
    }


    public static Person[] addName(Person[] originalArray, Person personToAdd){
        Person[] newArray = Arrays.copyOf(originalArray, originalArray.length + 1);
        newArray[newArray.length-1] = personToAdd;

        return newArray;
    }

}
