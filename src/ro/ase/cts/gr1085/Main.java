package ro.ase.cts.gr1085;

import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("tastati o propozitie care contine litere mari si mici: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String text = br.readLine();


            //daca toate literele sunt mici (lowercase) - LowerCaseException
            //daca toate literele sunt mari (uppercase) - UpperCaseException

            if (text.toLowerCase(Locale.ROOT).equals(text)) throw new LowerCaseException();
            if (text.toUpperCase(Locale.ROOT).equals(text)) throw new UpperCaseException();

            System.out.println(text);

        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }


    }
}

