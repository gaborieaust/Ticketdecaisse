package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        // On déclare un scanner pour lire les entrées(quantités/descriptif/pxunitaire de la console
        Scanner sc = new Scanner(System.in);

        // on déclare le nombre d'éléments à facturer
        System.out.println("Quel est le nombre d'éléments à facturer ? ");
        int n = sc.nextInt();
        sc.nextLine();

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
        String Totalligne ;
        float prixtotal = 0;
        int f = 0;
        float prixplat;
        int quant;
        String plat;
        ArrayList<String> maListe=new ArrayList<String>();
        ArrayList<Float> maListeprix=new ArrayList<Float>();
        ArrayList<Integer> maListeqte=new ArrayList<Integer>();


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
            Float pxunit = sc.nextFloat();
            sc.nextLine();
            maListeprix.add(pxunit);
            //System.out.println(maListeprix);

            // On demande la quantité
            System.out.println("Quelle est la quantité ? ");
            quant = sc.nextInt();
            sc.nextLine();
            //on vient stocker dans une liste
            maListeqte.add(quant);
            //System.out.println(maListeqte);
            // on calcule le prix par plat selon la quantité
            prixplat = quant * pxunit;
            prixtotal = prixtotal + prixplat;

            // On affiche le résultat
            System.out.println("Le prix pour le  " + plat + " est de " + prixplat );
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
        System.out.println("*******************recapitaltif de la facture********************\n" );
        //+maListe+'\n' +maListeprix+'\n'+ maListeqte+'\n' );

       //for( int s = 0 ; s < maListeprix.size(); s++)
           // System.out.println(maListeprix.get(s) & System.out.println(maListeqte.get(s);

           //System.out.println(maListeqte.get());
        //System.out.println(maListeprix );
        //System.out.println(maListeqte);
        for( i = 0 ; i < n; i++){
            System.out.println((  maListe.get(i) + " " + maListeprix.get(i) + " " + maListeqte.get(i) ));
            //System.out.println(maListe.get(i) ' + ' System.out.println(maListeprix.get(i)));
           //System.out.println(maListeprix.get(i));
            //System.out.println(maListeqte.get(i));
            }
        // affichage du prix final
        System.out.println(" Soit un montant total à payer de " + prixtotal);

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

