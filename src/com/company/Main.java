package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //OPDRACHT 3.1
        System.out.println("Opdracht 3.1\n");
        int random1 = (int) (Math.random() * 10 + 1);
        int random2 = (int) (Math.random() * 10 + 1);
        System.out.print("Hoeveel is " + random1 +  " + " + random2 +  " ?");
        int userInput = scanner.nextInt();
        int uitkomst = random1 + random2;
        if (userInput == uitkomst) {
            System.out.println("Klopt!\n\n");
        } else {
            System.out.println("Helaas het juiste antwoord was " + uitkomst + ".\n\n");
        }

        //OPDRACHT 3.2
        System.out.println("Opdracht 3.2");
        random1 = (int) (Math.random() * 10 + 1);
        random2 = (int) (Math.random() * 10 + 1);
        int random3 = (int) (Math.random() * 10 + 1);
        System.out.print("Hoeveel is " + random1 + " x " + random2 + " x " +  random3 + " ?");
        userInput = scanner.nextInt();
        uitkomst = random1 * random2 * random3;
        if (userInput == uitkomst) {
            System.out.println("Helemaal goed!\n\n");
        } else {
            System.out.println("Helaas het juiste antwoord was " + uitkomst + ".\n\n");
        }

        //OPDRACHT 3.3
        System.out.println("Opdracht 3.3\n");
        random1 = (int) (Math.random() * 12 + 1);
        String maand = "onbekend";
        switch (random1){
            case 1: maand = "Januari"; break;
            case 2: maand = "Februari"; break;
            case 3: maand = "Maart"; break;
            case 4: maand = "April"; break;
            case 5: maand = "Mei"; break;
            case 6: maand = "Juni"; break;
            case 7: maand = "Juli"; break;
            case 8: maand = "Augustus"; break;
            case 9: maand = "September"; break;
            case 10: maand = "Oktober"; break;
            case 11: maand = "November"; break;
            case 12: maand = "December"; break;
        }
        System.out.println("Het random getal is " + random1 + " en dat is de maand " + maand + ".\n\n");

        //OPDRACHT 3.4
        System.out.println("Opdracht 3.4\n");
        System.out.println("Welke week dag is het nu? ( 1 = ma / 2 = di / 3 = wo / 4 = do / 5 = vr / 6 = za / 7 = zo)\n");
        int weekdag = scanner.nextInt();
        System.out.println("En van hoeveel dagen in de toekomst wil je de weekdag berekenen?\n");
        int dagenVooruit = scanner.nextInt();
        int resultaat = weekdag + dagenVooruit;
        if (resultaat > 7) {
            resultaat = resultaat % 7;
        }
        String dag = "onbekend";
        switch (resultaat) {
            case 1: dag = "Maandag"; break;
            case 2: dag = "Dinsdag"; break;
            case 3: dag = "Woensdag"; break;
            case 4: dag = "Donderdag"; break;
            case 5: dag = "Vrijdag"; break;
            case 6: dag = "Zaterdag"; break;
            case 7: dag = "Zondag"; break;
        }
        System.out.println("Vandaag is het " + dag + " en over " + dagenVooruit + " dagen is het " + dag + ".\n\n ");


    }
}
