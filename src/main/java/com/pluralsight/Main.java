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

        FileWriter writer = new FileWriter("logs.txt");


        writer.write(Logger.launchStatement());

        while(!(searchTerm.equalsIgnoreCase("x"))){
            Logger l1 = new Logger();

            writer.write(l1.logg(searchTerm));

            System.out.print("Enter a search term (x) to exit: ");
            searchTerm = scanner.nextLine();
        }

        writer.write(Logger.exitMessage());
        writer.close();











    }
}
