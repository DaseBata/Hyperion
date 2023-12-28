public class Shoe extends Personnage{
    public Shoe(String couleur, int ligne, int colonne){
        super(couleur, ligne, colonne);
        this.name = "SH__" + couleur;
    }

    @Override
    public int[][] futuresCases(Personnage[][] plateau){
        int[][] possibilite = new int[1][2];
        return possibilite;
    }
}
