package org.efire.net.common;

public interface Util {
    default int sum() {
        return 0;
    }

    static int sum(int x, int y) {
        return x + y;
    }

    private String calc() {
        return null;
    }

    public String rate();
}

