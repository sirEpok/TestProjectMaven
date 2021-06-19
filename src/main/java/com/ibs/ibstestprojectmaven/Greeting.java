package com.ibs.ibstestprojectmaven;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;



public class Greeting {
    public static void main(String[] args) {
//        for (String arg : args) {           1ое задание
//            System.out.println(arg);
//        }
        
        List<String> list = new ArrayList<>();
        for (String arg : args) {
            list.add(arg);
        }
        for(int i = 0; i < list.size(); i++) {
            System.out.print(StringUtils.upperCase(list.get(i)));
        }
    }
}
