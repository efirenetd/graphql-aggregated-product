package org.efire.net.enums;

public enum Employee {

    JONG(40), QENG(37), DERIQ(10);
    private int age;

    Employee(int age) {
        this.age = age;
        System.out.println("Constructor was called for: "+this.toString());
    }

    public int getAge() {
        return age;
    }
}
