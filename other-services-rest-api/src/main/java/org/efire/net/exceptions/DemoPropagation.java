package org.efire.net.exceptions;

import java.io.IOException;

public class DemoPropagation {

    static class Parent {
        public void hello() throws Exception {
            System.out.println("Parent class hello method");
        }
    }

    static class Child extends Parent {
        @Override
        public void hello() throws IOException {
            System.out.println("Child class hello method");
        }
    }

    public static void main(String[] args) {
        Parent p  = new Child();
        try {
            p.hello();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
