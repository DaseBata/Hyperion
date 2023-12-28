import java.util.ArrayList;

public class GrandCross{

    ArrayList<Personnage> listePersonnage;
    Personnage[][] plateau;

    public GrandCross(){
        plateau = initVide();
        listePersonnage = new ArrayList<>();
    }

    public void afficherGrandCross(Personnage[][] plateau){

        //PARTIE EN TETE
        System.out.print("  ");
        for (int colonne = 0; colonne < 17; colonne++) {
            System.out.print(String.format("%6s", colonne +" "));
        }
        System.out.println();
        System.out.println("                                  _________________________________________                         ");
        //PARTIE HAUTE DU PLATEAU
        for (int ligne = 0; ligne < 4; ligne++) {
            System.out.print(String.format("%3s", ligne +" "));
            System.out.print("                              |");
            for (int colonne = 5; colonne < 12; colonne++) {
                System.out.print(""+ plateau[ligne][colonne].name + "|");
            }
            System.out.println("");
        }
        //LIGNE 4
        for (int ligne = 4; ligne < 5; ligne++) {
            System.out.print(String.format("%3s", ligne +" "));
            System.out.print(" _____________________________|");
            for (int colonne = 5; colonne < 12; colonne++) {
                System.out.print(""+ plateau[ligne][colonne].name + "|");
            }
            System.out.println("_____________________________");
        }
        //PARTIE CENtrALE DU PLATEAU
        for (int ligne = 5; ligne < 12; ligne++) {
            System.out.print(String.format("%3s", ligne +" "));
            System.out.print("|");
            for (int colonne = 0; colonne < plateau[ligne].length; colonne++) {
                System.out.print(""+ plateau[ligne][colonne].name + "|");
            }
            System.out.println("");
        }
        //PARTIE BASSE DU PLATEAU
        for (int ligne = 12; ligne < 17; ligne++) {
            System.out.print(String.format("%3s", ligne +" "));
            System.out.print("                              |");
            for (int colonne = 5; colonne < 12; colonne++) {
                System.out.print(""+ plateau[ligne][colonne].name + "|");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public Personnage[][] initVide(){

        Personnage[][] plateau = new Personnage[17][17];

        for (int ligne = 0; ligne < plateau.length; ligne++) {
            for (int colonne = 0; colonne < plateau[ligne].length; colonne++) {
                plateau[ligne][colonne] = new Vide("_____", ligne, colonne);
            }
        }
        return plateau;
    }

    public Personnage[][] ajoutPersoB(Joueur joueur){

        Abrasimovich abra = new Abrasimovich(joueur.couleur, 0, 8);
        MacchaAzukina macchaA = new MacchaAzukina(joueur.couleur, 1, 6);
        FamilyMan familyM = new FamilyMan(joueur.couleur, 3, 8);
        Dodondondodon dodon = new Dodondondodon(joueur.couleur, 4, 8);
        OfficeLady officeL = new OfficeLady(joueur.couleur, 1, 10);
        Shoe shoe = new Shoe(joueur.couleur, 3, 6);
        Steam steam = new Steam(joueur.couleur, 3, 10);
        MassProducedZaf massProd1 = new MassProducedZaf("MP1_", joueur.couleur, 4, 9);
        MassProducedZaf massProd2 = new MassProducedZaf("MP2_", joueur.couleur, 4, 7);
        Tequila tequila1 = new Tequila("TQ1_" ,joueur.couleur, 0, 10);
        Tequila tequila2 = new Tequila("TQ2_" ,joueur.couleur, 2, 5);
        Tequila tequila3 = new Tequila("TQ3_" ,joueur.couleur, 3, 5);
        Tequila tequila4 = new Tequila("TQ4_" ,joueur.couleur, 0, 11);
        Tequila tequila5 = new Tequila("TQ5_" ,joueur.couleur, 2, 11);
        Tequila tequila6 = new Tequila("TQ6_" ,joueur.couleur, 3, 11);

        this.listePersonnage.add(abra);
        this.listePersonnage.add(macchaA);
        this.listePersonnage.add(familyM);
        this.listePersonnage.add(dodon);
        this.listePersonnage.add(officeL);
        this.listePersonnage.add(shoe);
        this.listePersonnage.add(steam);
        this.listePersonnage.add(massProd1);
        this.listePersonnage.add(massProd2);
        this.listePersonnage.add(tequila1);
        this.listePersonnage.add(tequila2);
        this.listePersonnage.add(tequila3);
        this.listePersonnage.add(tequila4);
        this.listePersonnage.add(tequila5);
        this.listePersonnage.add(tequila6);

        for (int i = 0; i < listePersonnage.size(); i++) {
            plateau = this.actualiserPlateau(listePersonnage.get(i), plateau);
        }
        return plateau;
    }

    public Personnage[][] ajoutPersoV(Joueur joueur){

        Abrasimovich abra = new Abrasimovich(joueur.couleur, 8, 0);
        MacchaAzukina macchaA = new MacchaAzukina(joueur.couleur, 10, 1);
        FamilyMan familyM = new FamilyMan(joueur.couleur, 8, 3);
        Dodondondodon dodon = new Dodondondodon(joueur.couleur, 8, 8);
        OfficeLady officeL = new OfficeLady(joueur.couleur, 6, 1);
        Shoe shoe = new Shoe(joueur.couleur, 10, 3);
        Steam steam = new Steam(joueur.couleur, 6, 3);
        MassProducedZaf massProd1 = new MassProducedZaf("MP1_", joueur.couleur, 7, 4);
        MassProducedZaf massProd2 = new MassProducedZaf("MP2_", joueur.couleur, 9, 4);
        Tequila tequila1 = new Tequila("TQ1_" ,joueur.couleur, 11, 0);
        Tequila tequila2 = new Tequila("TQ2_" ,joueur.couleur, 11, 2);
        Tequila tequila3 = new Tequila("TQ3_" ,joueur.couleur, 11, 3);
        Tequila tequila4 = new Tequila("TQ4_" ,joueur.couleur, 5, 0);
        Tequila tequila5 = new Tequila("TQ5_" ,joueur.couleur, 5, 2);
        Tequila tequila6 = new Tequila("TQ6_" ,joueur.couleur, 5, 3);

        this.listePersonnage.add(abra);
        this.listePersonnage.add(macchaA);
        this.listePersonnage.add(familyM);
        this.listePersonnage.add(dodon);
        this.listePersonnage.add(officeL);
        this.listePersonnage.add(shoe);
        this.listePersonnage.add(steam);
        this.listePersonnage.add(massProd1);
        this.listePersonnage.add(massProd2);
        this.listePersonnage.add(tequila1);
        this.listePersonnage.add(tequila2);
        this.listePersonnage.add(tequila3);
        this.listePersonnage.add(tequila4);
        this.listePersonnage.add(tequila5);
        this.listePersonnage.add(tequila6);

        for (int i = 0; i < listePersonnage.size(); i++) {
            plateau = this.actualiserPlateau(listePersonnage.get(i), plateau);
        }
        return plateau;
    }

    public Personnage[][] ajoutPersoJ(Joueur joueur){

        Abrasimovich abra = new Abrasimovich(joueur.couleur, 16, 8);
        MacchaAzukina macchaA = new MacchaAzukina(joueur.couleur, 15, 10);
        FamilyMan familyM = new FamilyMan(joueur.couleur, 13, 8);
        Dodondondodon dodon = new Dodondondodon(joueur.couleur, 12, 8);
        OfficeLady officeL = new OfficeLady(joueur.couleur, 15, 6);
        Shoe shoe = new Shoe(joueur.couleur, 13, 10);
        Steam steam = new Steam(joueur.couleur, 13, 6);
        MassProducedZaf massProd1 = new MassProducedZaf("MP1_", joueur.couleur, 12, 7);
        MassProducedZaf massProd2 = new MassProducedZaf("MP2_", joueur.couleur, 12, 9);
        Tequila tequila1 = new Tequila("TQ1_" ,joueur.couleur, 16, 11);
        Tequila tequila2 = new Tequila("TQ2_" ,joueur.couleur, 14, 11);
        Tequila tequila3 = new Tequila("TQ3_" ,joueur.couleur, 13, 11);
        Tequila tequila4 = new Tequila("TQ4_" ,joueur.couleur, 16, 5);
        Tequila tequila5 = new Tequila("TQ5_" ,joueur.couleur, 14, 5);
        Tequila tequila6 = new Tequila("TQ6_" ,joueur.couleur, 13, 5);

        this.listePersonnage.add(abra);
        this.listePersonnage.add(macchaA);
        this.listePersonnage.add(familyM);
        this.listePersonnage.add(dodon);
        this.listePersonnage.add(officeL);
        this.listePersonnage.add(shoe);
        this.listePersonnage.add(steam);
        this.listePersonnage.add(massProd1);
        this.listePersonnage.add(massProd2);
        this.listePersonnage.add(tequila1);
        this.listePersonnage.add(tequila2);
        this.listePersonnage.add(tequila3);
        this.listePersonnage.add(tequila4);
        this.listePersonnage.add(tequila5);
        this.listePersonnage.add(tequila6);

        for (int i = 0; i < listePersonnage.size(); i++) {
            plateau = this.actualiserPlateau(listePersonnage.get(i), plateau);
        }
        return plateau;
    }

    public Personnage[][] ajoutPersoR(Joueur joueur){

        Abrasimovich abra = new Abrasimovich(joueur.couleur, 8, 16);
        MacchaAzukina macchaA = new MacchaAzukina(joueur.couleur, 6, 15);
        FamilyMan familyM = new FamilyMan(joueur.couleur, 8, 13);
        Dodondondodon dodon = new Dodondondodon(joueur.couleur, 8, 12);
        OfficeLady officeL = new OfficeLady(joueur.couleur, 10, 15);
        Shoe shoe = new Shoe(joueur.couleur, 6, 13);
        Steam steam = new Steam(joueur.couleur, 10, 13);
        MassProducedZaf massProd1 = new MassProducedZaf("MP1_", joueur.couleur, 9, 12);
        MassProducedZaf massProd2 = new MassProducedZaf("MP2_", joueur.couleur, 7, 12);
        Tequila tequila1 = new Tequila("TQ1_" ,joueur.couleur, 5, 16);
        Tequila tequila2 = new Tequila("TQ2_" ,joueur.couleur, 5, 14);
        Tequila tequila3 = new Tequila("TQ3_" ,joueur.couleur, 5, 13);
        Tequila tequila4 = new Tequila("TQ4_" ,joueur.couleur, 11, 16);
        Tequila tequila5 = new Tequila("TQ5_" ,joueur.couleur, 11, 14);
        Tequila tequila6 = new Tequila("TQ6_" ,joueur.couleur, 11, 13);

        this.listePersonnage.add(abra);
        this.listePersonnage.add(macchaA);
        this.listePersonnage.add(familyM);
        this.listePersonnage.add(dodon);
        this.listePersonnage.add(officeL);
        this.listePersonnage.add(shoe);
        this.listePersonnage.add(steam);
        this.listePersonnage.add(massProd1);
        this.listePersonnage.add(massProd2);
        this.listePersonnage.add(tequila1);
        this.listePersonnage.add(tequila2);
        this.listePersonnage.add(tequila3);
        this.listePersonnage.add(tequila4);
        this.listePersonnage.add(tequila5);
        this.listePersonnage.add(tequila6);

        for (int i = 0; i < listePersonnage.size(); i++) {
            plateau = this.actualiserPlateau(listePersonnage.get(i), plateau);
        }
        return plateau;
    }

    public Personnage[][] actualiserPlateau(Personnage perso, Personnage[][] plateau){
        plateau[perso.oldPosition[0]][perso.oldPosition[1]] = new Vide("_____", perso.oldPosition[0], perso.oldPosition[1]);
        plateau[perso.ligne][perso.colonne] = perso;
        return plateau;
    }
}
