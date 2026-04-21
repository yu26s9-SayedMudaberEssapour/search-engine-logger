package com.pluralsight;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {





    //This is the method that will be returning the value based on the input.
    public String log(String searchTerm){
        //Here I am making a variabe that keeps track of LocalDateTime



        return formatterTime() + " search : " + searchTerm + "\n";

    }


    public static String formatterTime(){
        LocalDateTime today = LocalDateTime.now();

        //Here I am changing the format of it
        DateTimeFormatter Date1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formatterTime = today.format(Date1);

        return formatterTime;
    }





}