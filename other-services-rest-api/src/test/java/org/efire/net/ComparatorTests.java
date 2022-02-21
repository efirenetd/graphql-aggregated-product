package org.efire.net;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.Comparator;

@ExtendWith(SpringExtension.class)
public class ComparatorTests {

    @Test
    void testComparator() {
        var employees = new ArrayList<Employee>();
        employees.add(new Employee(3, "John", 40));
        employees.add(new Employee(1, "Abe", 42));
        employees.add(new Employee(4, "Mike", 35));
        employees.add(new Employee(6, "John", 35));
        employees.add(new Employee(2, "Luc", 52));
        employees.add(new Employee(5, "John", 32));
/*        Collections.sort(employees, new NameComparator());
        System.out.println(employees);*/
        System.out.println("------NameComparator--------");
        employees.stream().sorted(new NameComparator()).forEach(System.out::println);
        System.out.println("------NameAgeComparator--------");
        employees.stream().sorted(new NameAgeComparator()).forEach(System.out::println);

        //or use lambda expression - using Comparator.comparing chaining
        System.out.println("------Lambda NameComparator--------");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);

        System.out.println("------Lambda NameAgeComparator--------");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName).thenComparingInt(Employee::getAge))
                .forEach(System.out::println);
    }

    class NameComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    class NameAgeComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            var i = o1.getName().compareTo(o2.getName());
            if (i == 0) {
                i = o1.getAge() - o2.getAge();
            }
            return i;
        }
    }
}
