package com.company;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.awt.Color;


public class Main {

    public static void main(String[] args) {
        // write your code here
        // On déclare un scanner pour lire les entrées(quantités/descriptif/pxunitaire de la console
        Scanner sc = new Scanner(System.in);

        // on déclare le nombre d'éléments à facturer
        System.out.println("Quel est le nombre d'éléments à facturer ? ");
        while (sc.hasNextInt() == false) {
            System.out.println("Vous devez saisir un chiffre entier!!! ");
            System.out.println("Quel est le nombre d'éléments à facturer ? ");
            sc.nextLine();
        }
        int n = sc.nextInt();
        sc.nextLine();
        //if (n instanceof int) {System.out.println("Ok");}
        // else {System.out.println("Not Ok");}

        // On affiche un message pour demander le descriptif
        // System.out.println("Quel plat a été commandé  259 ? ");

        // On récupère le plat suite à l'entrée du serveur dans de la console
        //String plat = sc.nextLine();
        //sc.nextLine();
        // je définis un tableau dans lequel je vais venir sauvegarder les données
        int i = 0;
        //String tableau [];
        //tableau = new String[n];
        //tableau[i] = plat;
        //System.out.println(tableau[i]);


        // On demande le prix unitaire
        //System.out.println("Quel est le prix unitaire du plat ? ");
        //Float pxunit = sc.nextFloat();
        //sc.nextLine();

        // On demande la quantité
        //System.out.println("Quelle est la quantité ? ");
        //int quant = sc.nextInt();
        //sc.nextLine();

        // on calcule le prix par plat
        //float prixplat = quant*pxunit;
        //float prixtotal = +prixplat;
        // On affiche le résultat
        //System.out.println("Bonjour le prix pour un plat de  " + plat + " est de " + prixplat + " soit un total de " + prixtotal );
        //On vérifie si c'est le dernier plat
        //System.out.println("Avez-vous d'autres plats à déclarer (O pour Oui ; N pour Non? ");
        // On récupère la réponse
        //char    rep = sc.nextLine().charAt(0);
        String tableau[] = new String[n];
        tableau = new String[n];
        //String plat ="";
        String Totalligne;
        float prixtotal = 0;
        int f = 0;
        float prixplat;
        int quant;
        String plat;
        ArrayList<String> maListe = new ArrayList<String>();
        ArrayList<Float> maListeprix = new ArrayList<Float>();
        ArrayList<Integer> maListeqte = new ArrayList<Integer>();


        while (i < n) {


            // On affiche un message pour demander le descriptif
            System.out.println("Quel plat a été commandé ? ");

            // On récupère le plat suite à l'entrée du serveur dans de la console
            plat = sc.nextLine();
            maListe.add(plat);
            //System.out.println(maListe);
            //Totalligne = Totalligne+" & ".concat(plat) ;
            //sc.nextLine();
            // tableau[f] = plat;

            // On demande le prix unitaire
            System.out.println("Quel est le prix unitaire du plat ? ");
            while (sc.hasNextFloat() == false) {
                System.out.println("Vous devez saisir un chiffre!!! ");
                System.out.println("Quel est le prix unitaire du plat ? ");
                sc.nextLine();
            }
            Float pxunit = sc.nextFloat();
            sc.nextLine();
            maListeprix.add(pxunit);
            //System.out.println(maListeprix);

            // On demande la quantité
            System.out.println("Quelle est la quantité ? ");
            while (sc.hasNextInt() == false) {
                System.out.println("Vous devez saisir un chiffre entier!!! ");
                System.out.println("Quel est le prix unitaire du plat ? ");
                sc.nextLine();
            }
            quant = sc.nextInt();
            sc.nextLine();
            //on vient stocker dans une liste
            maListeqte.add(quant);
            //System.out.println(maListeqte);
            // on calcule le prix par plat selon la quantité
            prixplat = quant * pxunit;
            prixtotal = prixtotal + prixplat;

            // On affiche le résultat
            System.out.println("Le prix pour le  " + plat + " est de " + prixplat);
            i++;
        }
        //On vérifie si c'est le dernier plat
        //System.out.println("Avez-vous d'autres plats à déclarer (1 pour Oui ; 0 pour Non? ");
        // On récupère la réponse
        //rep = sc.nextLine().charAt(0);
        //sc.nextLine();

        // je vais venir énumérer les données qui ont été sauvegardées dans le tableau / lecture basique du tableau
        //for (i = 0; i < tableau.length; i++) {
        //System.out.println(tableau[i]);

        // j'affiche le résultat de ma liste

        System.out.println("*********************************");
        System.out.println("*recapitaltif de la facture*");
        System.out.println("*********************************");
        System.out.println("");

        System.out.println("Descriptif" + " / " + "Prix unitaire" + " / " + "Quantité");

        //+maListe+'\n' +maListeprix+'\n'+ maListeqte+'\n' );
        //jjj

        //for( int s = 0 ; s < maListeprix.size(); s++)
        // System.out.println(maListeprix.get(s) & System.out.println(maListeqte.get(s);

        //System.out.println(maListeqte.get());
        //System.out.println(maListeprix );
        //System.out.println(maListeqte);
        Date now = new Date();
        for (i = 0; i < n; i++) {
            System.out.println((maListe.get(i).toUpperCase() + " / " + maListeprix.get(i) + " / " + maListeqte.get(i) + " soit un total de " + (maListeprix.get(i) * (maListeqte.get(i)))));
            //System.out.println(maListe.get(i) ' + ' System.out.println(maListeprix.get(i)));
            //System.out.println(maListeprix.get(i));
            //System.out.println(maListeqte.get(i));
        }
        // affichage du prix final
        System.out.println("Soit un montant total à payer de " + prixtotal);
        System.out.printf("%tF %<tT\n", now);

        System.out.println("+------------+----------------+----------------+----------------+");
        System.out.println("| Descriptif | Quantité       | Prix uni       |   Prix total   ");
        System.out.println("+------------+----------------+----------------+----------------+");
        for (i = 0; i < n; i++) {
            System.out.printf("| %10s |  %10d    | %12.2f   | %12.2f   |\n",
                    maListe.get(i).toUpperCase(), maListeqte.get(i), maListeprix.get(i), (maListeqte.get(i) * maListeprix.get(i)));
        }
        System.out.println("+------------+----------------+----------------+----------------+");
        System.out.println("+------------+----------------+----------------+----------------+");
        System.out.printf("| Soit un montant total de                          %.2f \n", prixtotal);
        System.out.println("+------------+----------------+----------------+----------------+");
        System.out.printf("%tF %<tT\n", now);
        // On verifi
        //if (age <= 0) {
        //   System.out.println("Vous n'êtes pas encore né ? Hum, bizarre...");
        //} else {
        // On affiche le résultat
        //   System.out.println("Bonjour " + prenom + ". Vous avez " + age + " ans, c'est bien ça ?");
        //ro }

        // On ferme le scanner
        sc.close();
    }

}

