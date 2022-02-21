package org.efire.net;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;

@ExtendWith(SpringExtension.class)
public class ComparableTests {

    @Test
    void testComparable() {
        var employees = new ArrayList<Employee>();
        employees.add(new Employee(3, "John", 40));
        employees.add(new Employee(1, "Abe", 42));
        employees.add(new Employee(4, "Mike", 35));
        employees.add(new Employee(2, "Luc", 52));
        //Collections.sort(employees);
        //System.out.println(employees);
        employees.stream()
                .sorted()
                .forEach(System.out::println);
    }


}
