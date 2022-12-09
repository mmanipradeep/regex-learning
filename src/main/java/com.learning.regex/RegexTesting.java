package com.learning.regex;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTesting {
    private static final Pattern pattern = Pattern.compile(".[a-zA-Z0-9]+");
    public static void main(String[] args) {
        System.out.println(getFileExtensionRegex("mani@#$.pdf"));
    }

public static String  getFileExtensionRegex(String name){
        String extension = null;
    Matcher m1 =null;

    if (name != null){
        m1 = pattern.matcher(name);

    }
    if (m1 !=null){
        while (m1.find()){
            extension = m1.group();
        }
    }
return  extension;
}

}
