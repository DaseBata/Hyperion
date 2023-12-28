public class MacchaAzukina extends Personnage{
    public MacchaAzukina(String couleur, int ligne, int colonne){
        super(couleur, ligne, colonne);
        this.name = "MA__" + couleur;
    }

    @Override
    public int[][] futuresCases(Personnage[][] plateau){
        int[][] possibilite = new int[1][2];
        return possibilite;
    }
}
