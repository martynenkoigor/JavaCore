package com.martynenkoigor.javacore.chapter17;

import java.util.Properties;
import java.util.Set;

public class PropDemoDef {
    public static void main(String[] args) {
        Properties defList = new Properties();
        defList.put("Флopидa" , "Тэлесси");
        defList.put("Bиcкoнcин" , "Мэдисон");
        Properties capitals = new Properties(defList);
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миccypи" , "Джефферсон-Сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана" , "Индианаполис");

        Set<?> states = capitals.keySet();

        for (Object name: states) {
            System.out.println("Cтoлицa штата " + name + " - " + capitals.getProperty((String)name) + ".");
        }
        System.out.println();

        String str = capitals.getProperty("Флopидa");
        System.out.println("Cтoлицa Флориды - " + str + ".");
    }
}
