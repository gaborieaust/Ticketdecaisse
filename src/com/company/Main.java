package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        // On déclare un scanner pour lire les entrées(quantités/descriptif/pxunitaire de la console
        Scanner sc = new Scanner(System.in);

        // On affiche un message pour demander le descriptif
        System.out.println("Quel plat a été commandé  ? ");

        // On récupère le plat suite à l'entrée du serveur dans de la console
        String plat = sc.nextLine();
        String platTotal = plat;

        // On demande le prix unitaire
        System.out.println("Quel est le prix unitaire du plat ? ");
        Float pxunit = sc.nextFloat();
        sc.nextLine();

        // On demande la quantité
        System.out.println("Quelle est la quantité ? ");
        int quant = sc.nextInt();
        sc.nextLine();

        // on calcule le prix par plat
        float prixplat = quant*pxunit;
        float prixtotal = +prixplat;
        // On affiche le résultat
        System.out.println("Bonjour le prix pour un plat de  " + plat + " est de " + prixplat + " soit un total de " + prixtotal );
        System.out.println ("soit un plat de " + platTotal );
        //On vérifie si c'est le dernier plat
        System.out.println("Avez-vous d'autres plats à déclarer (1 pour Oui ; 0 pour Non? ");
        // On récupère la réponse
        char    rep = sc.nextLine().charAt(0);

        while (rep == 'o') {
            // On affiche un message pour demander le descriptif
            System.out.println("Quel plat a été commandé  ? ");

            // On récupère le plat suite à l'entrée du serveur dans de la console
            plat = sc.nextLine();
            sc.nextLine();
            platTotal = platTotal+plat;

            // On demande le prix unitaire
            System.out.println("Quel est le prix unitaire du plat ? ");
            pxunit = sc.nextFloat();
            sc.nextLine();

            // On demande la quantité
            System.out.println("Quelle est la quantité ? ");
            quant = sc.nextInt();
            sc.nextLine();

            // on calcule le prix par plat
            prixplat = quant*pxunit;
            prixtotal = prixtotal+prixplat;
            // On affiche le résultat
            System.out.println("Bonjour le prix pour un plat de  " + plat + " est de " + prixplat + " soit un total de " + prixtotal );
            System.out.println ("soit un plat de " + platTotal );


            //On vérifie si c'est le dernier plat
            System.out.println("Avez-vous d'autres plats à déclarer (1 pour Oui ; 0 pour Non? ");
            // On récupère la réponse
            rep = sc.nextLine().charAt(0);
            sc.nextLine();
        }

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
