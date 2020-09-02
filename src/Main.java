import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        exerciseTwo();
        exerciseThree();
    }

    public static void exerciseTwo(){
        System.out.println("--------------------Exercise 2----------------------");
        ReadFromFile file = new ReadFromFile("C:\\Users\\Ankerstjerne\\IdeaProjects\\FileReadComparable\\resources\\file.txt");
        System.out.println(file.getLinesAmount());
        System.out.println("----------------------------------------------------");
    }

    public static void exerciseThree(){
        System.out.println("--------------------Exercise 3----------------------");
        Person one = new Person("Emil", 179, 22);
        Person two = new Person("Tobias", 189, 20);
        Person three = new Person("Nick", 178, 22);
        Person four = new Person("Chris", 165, 22);
        ArrayList<Person> personList = new ArrayList<>(Arrays.asList(one, two, three, four));
        Collections.sort(personList);
        for (Person person: personList
             ) {
            System.out.println(person.toString());
        }
//        System.out.println(personList.toString());
        System.out.println("----------------------------------------------------");
    }
}
