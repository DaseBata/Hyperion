public class OfficeLady extends Personnage{
    public OfficeLady(String couleur, int ligne, int colonne){
        super(couleur, ligne, colonne);
        this.name = "OL__" + couleur;
    }

    @Override
    public int[][] futuresCases(Personnage[][] plateau){
        int[][] possibilite = new int[1][2];
        return possibilite;
    }
}
