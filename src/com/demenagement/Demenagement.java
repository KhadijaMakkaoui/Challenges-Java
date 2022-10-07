package com.demenagement;

import java.util.Scanner;

public class Demenagement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("1-Ajouter un carton");
        System.out.println("2-Ajouter un objet à un carton");
        System.out.println("3-Ajouter un carton à un carton");
        System.out.println("4-Afficher le contenu d'un carton");
        System.out.println("5-Chercher un objet");
        System.out.println("-----------------------------");

        System.out.println("Donner votre choix : ");
        int choix=s.nextInt();
        s.nextLine();
        switch (choix){
            case 1:
                Carton.displayObjets();
                break;
        }
    }
}
