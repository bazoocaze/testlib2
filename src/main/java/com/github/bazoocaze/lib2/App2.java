package com.github.bazoocaze.lib2;

import com.github.bazoocaze.lib.App;

/**
 * Library that extends testlib1's answer with a custom suffix.
 */
public class App2 {

    /**
     * Returns the answer from testlib1 concatenated with " is the answer".
     * @return "42 is the answer"
     */
    public static String getFullAnswer() {
        return App.getAnswer() + " is the answer";
    }

    public static void main(String[] args) {
        System.out.println(getFullAnswer());
    }
}