package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String userName= scan.nextLine();

        System.out.print("Inserisci il tuo cognome: ");
        String userSurname= scan.nextLine();

        System.out.print("Inserisci il tuo colore preferito: ");
        String userFavoriteColour= scan.nextLine();

        System.out.print("Inserisci il tuo giorno di nascita: ");
        int userGiornoNascita= scan.nextInt();

        System.out.print("Inserisci il tuo mese di nascita: ");
        int userMeseNascita= scan.nextInt();

        System.out.print("Inserisci il tuo anno di nascita: ");
        int userAnnoNascita= scan.nextInt();

        int sommaGiornoMeseAnnoNascita = userGiornoNascita + userMeseNascita + userAnnoNascita;

        String password = userName + "-" + userSurname + "-" + userFavoriteColour + "-" + sommaGiornoMeseAnnoNascita;
        System.out.println("La tua password è: " + password);

        scan.close();
    }
}
