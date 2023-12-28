public class Abrasimovich extends Personnage{
    public Abrasimovich(String couleur, int ligne, int colonne){
        super(couleur, ligne, colonne);
        this.name = "AB__" + couleur;
    }

    @Override
    public int[][] futuresCases(Personnage[][] plateau){
        int[][] possibilite = new int[8][2];
        possibilite[0][0] = this.ligne;
        possibilite[0][1] = this.colonne;
        return possibilite;
    }
}
