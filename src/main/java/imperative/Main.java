package imperative;

import com.google.common.collect.Lists;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Lists.newArrayList(
                new Person("Bob", MALE),
                new Person("Katy", FEMALE),
                new Person("Tom", MALE),
                new Person("Anna", FEMALE)
        );

        List<Person> females = people.stream()
                .filter(person -> person.gender == FEMALE)
                .collect(Collectors.toList());

        females.forEach(System.out::println);

        people.stream()
                .filter(person -> person.gender == FEMALE)
                .forEach(System.out::println);
    }

    @ToString
    @RequiredArgsConstructor
    static class Person {
        private final String name;
        private final Gender gender;
    }

    enum Gender {
        MALE, FEMALE
    }
}
