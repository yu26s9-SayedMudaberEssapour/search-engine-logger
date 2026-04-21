package com.pluralsight;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    //it will be writting user action to a file name logs.txt

    //I will need to put the year-month-day time and then launch
    //I will then need to do that same but search : whatever is serached
    //Keep doing the above until the application stops
    //date time ... exit (once the user exits)



    private static LocalDateTime today = LocalDateTime.now();


    static DateTimeFormatter Date1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    static String formatterTime = today.format(Date1);

    public String logg(String searchTerm){



        if (searchTerm.equalsIgnoreCase("x")) {
            return formatterTime + " exit \n";
        }
        else{
            return formatterTime + " search : " + searchTerm + "\n";
        }

    }

    public static String launchStatement(){
        return formatterTime + " Launch\n";
    }

    public static String exitMessage(){
        return formatterTime + ": Exit\n";
    }




}