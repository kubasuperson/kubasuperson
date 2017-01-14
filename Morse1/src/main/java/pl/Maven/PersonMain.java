package pl.Maven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by RENT on 2017-01-12.
 */
public class PersonMain {

    public static void main(String[] args) {

        List personList = new ArrayList<>();
        personList.add(new Person("Jan", "Kowalski", 1980));
        personList.add(new Person("Adam", "Mickiewicz", 1960));
        personList.add(new Person("Adam", "Adamski", 1970));

        Collections.sort(personList, new Comparator<Person>() {
                    @Override
                    public int compare(Person person1, Person person2) {
                        int lastNameComparingResult = person1.getLastName().compareTo(person2.getLastName());

                        if (lastNameComparingResult == 0) {
                            return person1.getFirstName().compareTo(person2.getFirstName());
                        } else {
                            return lastNameComparingResult;
                        }
                    }
                }
        );

        for (Object object : personList) {
            System.out.println(object);
        }
    }
}

