package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a search term (x) to exit: ");
        String searchTerm = scanner.nextLine();


        try{
            FileWriter writer = new FileWriter("logs.txt");
            //This will be adding the header of the txt file.
            writer.write(Logger.formatterTime() + " Launch\n");
            while(!(searchTerm.equalsIgnoreCase("x"))){
                Logger l1 = new Logger();

                writer.write(l1.log(searchTerm));

                System.out.print("Enter a search term (x) to exit: ");
                searchTerm = scanner.nextLine();
            }

            //Writes the exit message
            writer.write(Logger.formatterTime() + ": Exit\n");
            //Closing the file here
            writer.close();

        }

        catch(IOException e){
            e.getMessage();
        }













    }
}
