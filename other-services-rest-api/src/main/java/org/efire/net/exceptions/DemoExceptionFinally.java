package org.efire.net.exceptions;

public class DemoExceptionFinally {

    // finally block is always executed
    public static int method1() {
        try {
            return -1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static void main(String[] args) {
        var i = method1();
        System.out.println("return: "+i);
    }
}
