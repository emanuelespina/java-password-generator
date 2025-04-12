package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) throws Exception {

        //imposto input come lo scanner per leggere i dati 

        Scanner input = new Scanner(System.in);

        //inserimento del nome
        
        System.out.println("Inserisci il tuo nome");

        String name = input.nextLine();

        //inserimento congnome

        System.out.println("Inserisci il tuo cognome");

        String lastname = input.nextLine();

        //inserimento colore preferito 

        System.out.println("Inserisci il tuo colore preferito");

        String favoriteColor = input.nextLine();

        //inserimento data di nascita

        System.out.println("Inserisci il giorno in cui sei nato in formato numerico");

        String strDayBirth = input.nextLine();
        int DayBirth = Integer.parseInt(strDayBirth);

        System.out.println("Inserisci il mese in cui sei nato in formato numerico");

        String strMonthBirth = input.nextLine();
        int MonthBirth = Integer.parseInt(strMonthBirth);

        System.out.println("Inserisci l'anno in cui sei nato in formato numerico");

        String strYearBirth = input.nextLine(); 
        int YearBirth = Integer.parseInt(strYearBirth);

        //costruzione della pw
        
        String password = name + "-" + lastname + "-" + favoriteColor + "-" + (DayBirth + MonthBirth + YearBirth);

        System.out.println(password);

        input.close();

    }
}

//chiedere nome , congnome, colore preferito, data di nascita in gg/mm/aaaa

//nome => string name 
//cognome => string lastname 
//colore preferito => string favoriteColor
//data di nascita => da divide in giorno mese e anno 

//chiedo il giorno il mese e l'anno in cui è nato e li converto in numeri interi 

//sommare gli addendi per ottenere il numero della pw

//comporre la pw con i vari elemente disivi da -

// password => string password



