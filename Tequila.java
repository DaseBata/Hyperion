public class Tequila extends Personnage{
    public Tequila(String abrege, String couleur, int ligne, int colonne){
        super(couleur, ligne, colonne);
        this.name = abrege + "" + couleur;
    }

    @Override
    public int[][] futuresCases(Personnage[][] plateau){

        int[][] possibilite = null;
        int i=0;

        if (this.couleur.equals("B")) {

            if (this.ligne + 1 < 17){
                if(plateau[this.ligne+1][this.colonne].name.substring(plateau[this.ligne+1][this.colonne].name.length()-1).equals("R") || plateau[this.ligne+1][this.colonne].name.substring(plateau[this.ligne+1][this.colonne].name.length()-1).equals("J") || plateau[this.ligne+1][this.colonne].name.equals("_____") || plateau[this.ligne+1][this.colonne].name.substring(0, 2).equals("OL")){
                    i = 1;
                }
            }
            if (i != 0){

                possibilite = new int[1][2];

                possibilite[0][0] = this.ligne + 1;
                possibilite[0][1] = this.colonne;
            }

        } else if (this.couleur.equals("J")){

            if (this.ligne - 1 >= 0){
                if(plateau[this.ligne-1][this.colonne].name.substring(plateau[this.ligne-1][this.colonne].name.length()-1).equals("B") || plateau[this.ligne-1][this.colonne].name.substring(plateau[this.ligne-1][this.colonne].name.length()-1).equals("V") || plateau[this.ligne-1][this.colonne].name.equals("_____")){
                    i = 1;
                }
            }
            if (i != 0){

                possibilite = new int[1][2];

                possibilite[0][0] = this.ligne - 1;
                possibilite[0][1] = this.colonne;
            }

        } else if (this.couleur.equals("V")){

            if (this.colonne + 1 < 17){
                if(plateau[this.ligne][this.colonne+1].name.substring(plateau[this.ligne][this.colonne+1].name.length()-1).equals("J") || plateau[this.ligne][this.colonne+1].name.substring(plateau[this.ligne][this.colonne+1].name.length()-1).equals("R") || plateau[this.ligne][this.colonne+1].name.equals("_____")){
                    i = 1;
                }
            }
            if (i != 0){

                possibilite = new int[1][2];

                possibilite[0][0] = this.ligne;
                possibilite[0][1] = this.colonne + 1;
            }

        } else {

            if (this.colonne - 1 >= 0){
                if(plateau[this.ligne][this.colonne-1].name.substring(plateau[this.ligne][this.colonne-1].name.length()-1).equals("B") || plateau[this.ligne][this.colonne-1].name.substring(plateau[this.ligne][this.colonne-1].name.length()-1).equals("V") || plateau[this.ligne][this.colonne-1].name.equals("_____")){
                    i = 1;
                }
            }
            if (i != 0){

                possibilite = new int[1][2];

                possibilite[0][0] = this.ligne;
                possibilite[0][1] = this.colonne -1;
            }
        }
        return possibilite;
    }
}
