import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        GrandCross jeu = new GrandCross();

        Personnage[][] grandCross = jeu.initVide();

        Joueur joueur1 = new Joueur("B");
        grandCross = jeu.ajoutPersoB(joueur1);

        Joueur joueur2 = new Joueur("V");
        grandCross = jeu.ajoutPersoV(joueur2);

        Joueur joueur3 = new Joueur("J");
        grandCross = jeu.ajoutPersoJ(joueur3);

        Joueur joueur4 = new Joueur("R");
        grandCross = jeu.ajoutPersoR(joueur4);

        jeu.afficherGrandCross(grandCross);


        List<Joueur> listeJoueurs = new ArrayList<>();
        listeJoueurs.add(joueur1);
        listeJoueurs.add(joueur2);
        listeJoueurs.add(joueur3);
        listeJoueurs.add(joueur4);

        int nombreDeJoueurs = listeJoueurs.size();

        boolean finDuJeu = false;
        boolean bonPerso = false;
        Personnage perso = null;

        Joueur currentJoueur = joueur1;
        int resultat;

        int i = 0;
        while (finDuJeu != true){
            while (bonPerso != true){
            //CHOISIR CASE DE PERSONNAGE
                System.out.println("Tour de Jeu : " + currentJoueur.couleur);
                Scanner scanner = new Scanner(System.in);
                System.out.print("Choix personnage (x,y) ? : ");
                String ligneSaisie = scanner.nextLine();
                String[] casePerso = ligneSaisie.split(",");

                int ligne = Integer.parseInt(casePerso[0]);
                int colonne = Integer.parseInt(casePerso[1]);

                perso = currentJoueur.getPersonnage(grandCross, ligne, colonne);
                System.out.println("" + perso.name);
                //System.out.println("J " + currentJoueur.couleur + ",P " + perso.name.charAt(perso.name.length() - 1));
                if( currentJoueur.couleur.equals("" + perso.name.charAt(perso.name.length() - 1))){
                    resultat = perso.move(grandCross, currentJoueur, perso);
                    System.out.println("Resulat moove : "+ resultat);
                    if(resultat == 1){
                        bonPerso = true;
                    } else if(resultat == 2){
                        System.out.println("fin perso couleur : ");
                    } else if(resultat == 3){
                        OverToxicatedLady otl = new OverToxicatedLady(currentJoueur.couleur, perso.ligne, perso.colonne);
                        otl.oldPosition[0] = perso.oldPosition[0];
                        otl.oldPosition[1] = perso.oldPosition[1];
                        perso = otl;
                        bonPerso = true;
                    }
                }
            }
            grandCross = jeu.actualiserPlateau(perso, grandCross);
            jeu.afficherGrandCross(grandCross);

            i++;
            i = i % nombreDeJoueurs;
            currentJoueur = listeJoueurs.get(i);
            bonPerso = false;
        }

        grandCross = jeu.actualiserPlateau(perso, grandCross);
        jeu.afficherGrandCross(grandCross);

    }
}
//FAIRE LES CASES D'ARRIVÉES, A SURLIGNER
