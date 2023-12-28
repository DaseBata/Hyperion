public class Vide extends Personnage{

    public Vide(String couleur, int ligne, int colonne){
        super(couleur, ligne, colonne);
        this.name = "_____";
    }

    @Override
    public int[][] futuresCases(Personnage[][] plateau){
        int[][] possibilite = new int[0][0];
        return possibilite;
    }
}
