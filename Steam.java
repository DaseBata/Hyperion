public class Steam extends Personnage{
    public Steam(String couleur, int ligne, int colonne){
        super(couleur, ligne, colonne);
        this.name = "ST__" + couleur;
    }

    @Override
    public int[][] futuresCases(Personnage[][] plateau){
        int[][] possibilite = new int[1][2];
        return possibilite;
    }
}
