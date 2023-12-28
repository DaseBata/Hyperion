public class FamilyMan extends Personnage{

    int sens;

    public FamilyMan(String couleur, int ligne, int colonne){
        super(couleur, ligne, colonne);
        this.name = "FM__" + couleur;
        this.sens = 1;
    }

    @Override
    public int[][] futuresCases(Personnage[][] plateau){

        int[][] possibilite = null;
        int i=0;

        if (this.couleur.equals("B")) {

            if (this.ligne + 2 < 17){
                if(plateau[this.ligne+2][this.colonne].name.substring(plateau[this.ligne+2][this.colonne].name.length()-1).equals("R") || plateau[this.ligne+2][this.colonne].name.substring(plateau[this.ligne+2][this.colonne].name.length()-1).equals("J") || plateau[this.ligne+2][this.colonne].name.equals("_____")){
                    i = 1;
                }
            }
            if (i != 0){

                possibilite = new int[1][2];

                possibilite[0][0] = this.ligne + 2;
                possibilite[0][1] = this.colonne;
            }

        } else if (this.couleur.equals("J")){

            if (this.ligne - 2 >= 0){
                if(plateau[this.ligne-2][this.colonne].name.substring(plateau[this.ligne-2][this.colonne].name.length()-1).equals("B") || plateau[this.ligne-2][this.colonne].name.substring(plateau[this.ligne-2][this.colonne].name.length()-1).equals("V") || plateau[this.ligne-2][this.colonne].name.equals("_____")){
                    i = 1;
                }
            }
            if (i != 0){

                possibilite = new int[1][2];

                possibilite[0][0] = this.ligne - 2;
                possibilite[0][1] = this.colonne;
            }

        } else if (this.couleur.equals("V")){

            if (this.colonne + 2 < 17){
                if(plateau[this.ligne][this.colonne+2].name.substring(plateau[this.ligne][this.colonne+2].name.length()-1).equals("J") || plateau[this.ligne][this.colonne+2].name.substring(plateau[this.ligne][this.colonne+2].name.length()-1).equals("R") || plateau[this.ligne][this.colonne+2].name.equals("_____")){
                    i = 1;
                }
            }
            if (i != 0){

                possibilite = new int[1][2];

                possibilite[0][0] = this.ligne;
                possibilite[0][1] = this.colonne + 2;
            }

        } else {

            System.out.println("jusqu ici");
            if (this.colonne - 2 >= 0){
                if(plateau[this.ligne][this.colonne-2].name.substring(plateau[this.ligne][this.colonne-2].name.length()-1).equals("B") || plateau[this.ligne][this.colonne-2].name.substring(plateau[this.ligne][this.colonne-2].name.length()-1).equals("V") || plateau[this.ligne][this.colonne-2].name.equals("_____")){
                    i = 1;
                }
            }
            if (i != 0){

                possibilite = new int[1][2];

                possibilite[0][0] = this.ligne;
                possibilite[0][1] = this.colonne -2;
            }
        }
        return possibilite;
    }
}
