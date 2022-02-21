package org.efire.net.cloneable;

public class Employee implements Cloneable{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        var e1 = new Employee("Mike", 10);
        System.out.println("Employee name: "+e1.getName()+ " age: "+e1.getAge());
        /*
         Without using .clone method and not implementing Cloneable in the Employee class, will result to below
         Output:
            Employee name: Mike age: 10
            Employee name: John age: 50
            Employee name: John age: 50
         */
        //var e2 = e1;
        var e2 = (Employee) e1.clone();

        e2.setName("John");
        e2.setAge(50);

        System.out.println("Employee name: "+e1.getName()+ " age: "+e1.getAge());
        System.out.println("Employee name: "+e2.getName()+ " age: "+e2.getAge());

    }
}
