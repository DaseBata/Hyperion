import java.util.Scanner;

public class Joueur{

    String couleur;

    public Joueur(String couleur){
        this.couleur = couleur;
    }

    public Personnage getPersonnage(Personnage[][] plateau, int ligne, int colonne){
        return plateau[ligne][colonne];
    }

    public int[] chooseMove(Personnage[][] plateau, int[][] arrive, Personnage perso){

        int[] choixJoueur = new int[2];
        boolean choixValide = false;

        for( int i=0 ; i < arrive.length ; i++){
            System.out.println("" + i + " : " + arrive[i][0] + "," + arrive[i][1]);
        }

        while (choixValide != true){

            boolean dedans = false;

            while (dedans == false){
                //scanner
                Scanner scanner = new Scanner(System.in);
                System.out.print("choix | x,y : ");
                String ligneSaisie = scanner.nextLine();
                String[] nombres = ligneSaisie.split(",");

                choixJoueur[0] = Integer.parseInt(nombres[0]);
                choixJoueur[1] = Integer.parseInt(nombres[1]);

                for( int i=0 ; i < arrive.length ; i++){
                    if (getPersonnage(plateau,choixJoueur[0],choixJoueur[1]).couleur == this.couleur){
                        dedans = true;
                    } else if((choixJoueur[0] == arrive[i][0]) && choixJoueur[1] == arrive[i][1]){
                        dedans = true;
                    }
                }
            }

            // ETRE SUR LE PLATEAU ET VOULOIR ALLER SUR UNE CASE VIDE
            if( plateau[choixJoueur[0]][choixJoueur[1]].name == "_____"){
                System.out.println("CAS(1) : Personnage sur la case d'arrive : " + plateau[choixJoueur[0]][choixJoueur[1]].name);
                choixValide = true;
            }

            // ETRE SUR LE PLATEAU ET VOULOIR ALLER SUR UNE CASE PRISE PAR UNE PIECE DE LA MEME COULEUR
            else if( plateau[choixJoueur[0]][choixJoueur[1]].name.substring(plateau[choixJoueur[0]][choixJoueur[1]].name.length()-1).equals("" + this.couleur)){
                System.out.println("CAS(2) : Changement de Personnage ou transformation OTL");
                choixValide = true;
            }

            //ETRE SUR LE PLATEAU ET VOULOIR ALLER SUR UNE CASE PRISE PAR UNE PIECE ADVERSE
            else if(!(plateau[choixJoueur[0]][choixJoueur[1]].name.substring(plateau[choixJoueur[0]][choixJoueur[1]].name.length()-1).equals("" + this.couleur))){
                System.out.println("CAS(3) : Personnage sur la case d'arrive : " + plateau[choixJoueur[0]][choixJoueur[1]].name);
                choixValide = true;
            }
        }
        System.out.println("------Fin Choix------");
        return choixJoueur;
    }
}
