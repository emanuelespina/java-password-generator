package org.lessons.java.security;

import java.sql.Date;
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

        System.out.println("Inserisci il tuo colore preferito gg/mm/aaaa");

        //costruzione della pw
        
        String password = name + "-" + lastname + "-" + favoriteColor + "-";

        System.out.println(password);

        input.close();

    }
}

//chiedere nome , congnome, colore preferito, data di nascita in gg/mm/aaaa

//nome => string name 
//cognome => string lastname 
//colore preferito => string favoriteColor
//data di nascita => date birthDate

//converitore la data i un oggetto numero per poter sommare gli addendi 

//sommare gli addendi per ottenere il numero della pw

//comporre la pw con i vari elemente disivi da -

// password => string password



