package com.company;

public class Main {


    public static String Temp(String agreement, int age, int temp, String should) {
        Temp("Можно идти гулять", 50,35, "оставайтесь дома");
        if (age > 20 && age < 45 && temp > -20 && temp < 35) {
            return agreement;
        } else if (age < 20 && temp > 0 && temp < 28) {
            return agreement;
        } else if (age > 45 && temp > -10 && temp < 25) {
            return agreement;
        } else
            return should;
    }
}