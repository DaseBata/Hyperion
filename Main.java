import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        GrandCross jeu = new GrandCross();

        Personnage[][] grandCross = jeu.initVide();

        Joueur joueur1 = new Joueur("B");
        grandCross = jeu.ajoutPersoB(joueur1);

        Joueur joueur2 = new Joueur("J");
        grandCross = jeu.ajoutPersoJ(joueur2);

        Joueur joueur3 = new Joueur("V");
        grandCross = jeu.ajoutPersoV(joueur3);

        Joueur joueur4 = new Joueur("R");
        grandCross = jeu.ajoutPersoR(joueur4);

        jeu.afficherGrandCross(grandCross);
        //jeu.afficherTout(grandCross);

        List<Joueur> listeJoueurs = new ArrayList<>();
        listeJoueurs.add(joueur1);
        listeJoueurs.add(joueur2);
        listeJoueurs.add(joueur3);
        listeJoueurs.add(joueur4);

        int nombreDeJoueurs = listeJoueurs.size();

        boolean[] tableauFin = new boolean[2];

        tableauFin[0] = false;
        tableauFin[1] = false;

        boolean finDuJeu = tableauFin[0];

        boolean bonPerso = false;
        Personnage perso = null;

        Joueur currentJoueur = joueur1;
        int resultat;

        int i = 0;
        while (finDuJeu != true){
            while (bonPerso != true){
            //CHOISIR CASE DE PERSONNAGE

                System.out.println("Player order");
                for (int k = 0; k < listeJoueurs.size(); k++) {
                    System.out.print(listeJoueurs.get(k).couleur);
                }
                System.out.println("");

                System.out.println("Player turn : " + currentJoueur.couleur);
                Scanner scanner = new Scanner(System.in);
                System.out.print("Chose character (x,y) ? : ");
                String ligneSaisie = scanner.nextLine();
                String[] casePerso = ligneSaisie.split(",");

                int ligne = Integer.parseInt(casePerso[0]);
                int colonne = Integer.parseInt(casePerso[1]);

                perso = currentJoueur.getPersonnage(grandCross, ligne, colonne);
                System.out.println("Character picked : " + perso.name);
                //System.out.println("J " + currentJoueur.couleur + ",P " + perso.name.charAt(perso.name.length() - 1));
                if( currentJoueur.couleur.equals("" + perso.name.charAt(perso.name.length() - 1))){
                    resultat = perso.move(grandCross, currentJoueur, perso);
                    // Cas normal
                    if(resultat == 1){
                        bonPerso = true;
                    // Création OTL
                    } else if(resultat == 2){
                        System.out.println("Transformation OTL !");
                        OverToxicatedLady otl = new OverToxicatedLady(currentJoueur.couleur, perso.ligne, perso.colonne);
                        otl.oldPosition[0] = perso.oldPosition[0];
                        otl.oldPosition[1] = perso.oldPosition[1];
                        perso = otl;
                        bonPerso = true;
                    } else if(resultat == 3){
                        System.out.println("Dead Extrem Attack !");
                        Vide vide = new Vide("_____", "_____", perso.ligne, perso.colonne);
                        vide.oldPosition[0] = perso.oldPosition[0];
                        vide.oldPosition[1] = perso.oldPosition[1];
                        perso = vide;
                        bonPerso = true;
                    } else if (resultat == 4){
                        jeu.defaitePersonnage("B", grandCross);
                        listeJoueurs = jeu.enleverJoueur("B", "V", listeJoueurs);
                        bonPerso = true;
                    } else if (resultat == 5){
                        jeu.defaitePersonnage("V", grandCross);
                        listeJoueurs = jeu.enleverJoueur("V", "B", listeJoueurs);
                        bonPerso = true;
                    } else if (resultat == 6){
                        jeu.defaitePersonnage("J", grandCross);
                        listeJoueurs = jeu.enleverJoueur("J", "R", listeJoueurs);
                        bonPerso = true;
                    } else if (resultat == 7){
                        jeu.defaitePersonnage("R", grandCross);
                        listeJoueurs = jeu.enleverJoueur("R", "J", listeJoueurs);
                        bonPerso = true;
                    }
                }
            }
            grandCross = jeu.actualiserPlateau(perso, grandCross);
            jeu.afficherGrandCross(grandCross);

            i++;
            i = i % listeJoueurs.size();
            currentJoueur = listeJoueurs.get(i);
            bonPerso = false;
            tableauFin = jeu.vainqueur(listeJoueurs);
            finDuJeu = tableauFin[0];
        }

        System.out.println("");
        if(tableauFin[1] == true){
            System.out.println("WINNERS BLUE (B) AND GREEN (V)");
        } else {
            System.out.println("WINNERS YELLOW (J) AND RED (R)");
        }
        System.out.println("");
    }
}
//FAIRE LES CASES D'ARRIVÉES, A SURLIGNER
