public class OverToxicatedLady extends Personnage{
    public OverToxicatedLady(String couleur, int ligne, int colonne){
        super(couleur, ligne, colonne);
        this.name = "OTL_" + couleur;
    }

    @Override
    public int[][] futuresCases(Personnage[][] plateau){
        int[][] possibilite = new int[1][2];
        return possibilite;
    }
}
