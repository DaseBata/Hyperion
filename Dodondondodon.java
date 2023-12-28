public class Dodondondodon extends Personnage{

    public Dodondondodon(String couleur, int ligne, int colonne){
        super(couleur, ligne, colonne);
        this.name = "DO__" + couleur;
    }

    public int relu(int variable){
        int newVariable;
        if(variable < 0){
            newVariable = 0;
        } else {
            newVariable = variable+1;
        }
        return newVariable;
    }

    @Override
    public int[][] futuresCases(Personnage[][] plateau){

        int[][] possibilite = null;

        int i=0;

        if (this.couleur.equals("B")) {
            while (this.ligne + i < 16) {
                if(plateau[this.ligne+(i+1)][this.colonne].name.substring(plateau[this.ligne+(i+1)][this.colonne].name.length()-1).equals("B") || plateau[this.ligne+(i+1)][this.colonne].name.substring(plateau[this.ligne+(i+1)][this.colonne].name.length()-1).equals("V")){
                    break;
                } else if (plateau[this.ligne+(i+1)][this.colonne].name.substring(plateau[this.ligne+(i+1)][this.colonne].name.length()-1).equals("J") || plateau[this.ligne+(i+1)][this.colonne].name.substring(plateau[this.ligne+(i+1)][this.colonne].name.length()-1).equals("R")){
                    i++;
                    break;
                }
                i++;
            }

            if (i>0){

                possibilite = new int[i][2];

                possibilite[0][0] = this.ligne + 1;
                possibilite[0][1] = this.colonne;

                i = 1;
                while (i < possibilite.length) {
                    possibilite[i][0] = possibilite[i - 1][0] + 1;
                    possibilite[i][1] = this.colonne;
                    i++;
                }
            }


        } else if (this.couleur.equals("J")){

            while (this.ligne - i > 0) {
                if(plateau[this.ligne-(i+1)][this.colonne].name.substring(plateau[this.ligne-(i+1)][this.colonne].name.length()-1).equals("J") || plateau[this.ligne-(i+1)][this.colonne].name.substring(plateau[this.ligne-(i+1)][this.colonne].name.length()-1).equals("R")){
                    break;
                } else if(plateau[this.ligne-(i+1)][this.colonne].name.substring(plateau[this.ligne-(i+1)][this.colonne].name.length()-1).equals("B") || plateau[this.ligne-(i+1)][this.colonne].name.substring(plateau[this.ligne-(i+1)][this.colonne].name.length()-1).equals("V")){
                    i++;
                    break;
                }
                i++;
            }

            if (i>0){

                possibilite = new int[i][2];

                possibilite[0][0] = this.ligne - 1;
                possibilite[0][1] = this.colonne;

                i = 1;
                while (i < possibilite.length) {
                    possibilite[i][0] = possibilite[i - 1][0] - 1;
                    possibilite[i][1] = this.colonne;
                    i++;
                }
            }

        } else if (this.couleur.equals("V")){

            while (this.colonne + i < 16) {
                if(plateau[this.ligne][this.colonne+(i+1)].name.substring(plateau[this.ligne][this.colonne+(i+1)].name.length()-1).equals("V") || plateau[this.ligne][this.colonne+(i+1)].name.substring(plateau[this.ligne][this.colonne+(i+1)].name.length()-1).equals("B")){
                    break;
                } else if (plateau[this.ligne][this.colonne+(i+1)].name.substring(plateau[this.ligne][this.colonne+(i+1)].name.length()-1).equals("J") || plateau[this.ligne][this.colonne+(i+1)].name.substring(plateau[this.ligne][this.colonne+(i+1)].name.length()-1).equals("R")){
                    i++;
                    break;
                }
                i++;
            }

            if (i>0){

                possibilite = new int[i][2];

                possibilite[0][0] = this.ligne;
                possibilite[0][1] = this.colonne  + 1;

                i = 1;
                while (i < possibilite.length) {
                    possibilite[i][0] = this.ligne;
                    possibilite[i][1] = possibilite[i - 1][1] + 1;
                    i++;
                }
            }

        } else {

            while (this.colonne - i > 0) {
                if(plateau[this.ligne][this.colonne-(i+1)].name.substring(plateau[this.ligne][this.colonne-(i+1)].name.length()-1).equals("R") || plateau[this.ligne][this.colonne-(i+1)].name.substring(plateau[this.ligne][this.colonne-(i+1)].name.length()-1).equals("J")){
                    break;
                } else if(plateau[this.ligne][this.colonne-(i+1)].name.substring(plateau[this.ligne][this.colonne-(i+1)].name.length()-1).equals("B") || plateau[this.ligne][this.colonne-(i+1)].name.substring(plateau[this.ligne][this.colonne-(i+1)].name.length()-1).equals("V")){
                    i++;
                    break;
                }
                i++;
            }


            if (i>0){

                possibilite = new int[i][2];

                possibilite[0][0] = this.ligne;
                possibilite[0][1] = this.colonne - 1;

                i = 1;
                while (i < possibilite.length) {
                    possibilite[i][0] = this.ligne;
                    possibilite[i][1] = possibilite[i - 1][1] - 1;
                    i++;
                }
            }

        }

        return possibilite;
    }
}
//FAIRE LE BLOCAGE D'UNE PIECE (NE PEUT PAS PASSER A TRAVERS UNE PIECE DE LA MEME COULEUR)
