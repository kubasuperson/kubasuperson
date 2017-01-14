package pl.Maven;

import java.util.Comparator;

/**
 * Created by RENT on 2017-01-12.
 */
public class PersonBirthYearComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        if (person1.getBirthYear() > person2.getBirthYear()) {
            return 1;
        } else if (person1.getBirthYear() == person2.getBirthYear()) {
            return 0;
        }
        return -1;
    }

}
