package org.launchcode;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String strToSearch = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures " +
                "or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        System.out.println("What term would you like to search the string for?");
        String searchTerm = input.next();

        if(strToSearch.toLowerCase().contains(searchTerm.toLowerCase())) {
            System.out.println(searchTerm + " is contained within the string.");
            System.out.println(("Index: " + strToSearch.indexOf(searchTerm)));
            System.out.println(("Length: " + searchTerm.length()));
            strToSearch = strToSearch.replace(searchTerm, "");
            System.out.println(strToSearch);
        } else {
            System.out.println(searchTerm + " is not contained within the string.");
        }
    }
}
