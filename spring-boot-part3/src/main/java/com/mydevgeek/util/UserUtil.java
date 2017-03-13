package com.mydevgeek.util;

/**
 * Created by DAM on 3/4/17.
 */
public class UserUtil {

    private UserUtil() {

    }

    public static String convertToFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
