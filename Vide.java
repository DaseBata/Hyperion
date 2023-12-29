public class Vide extends Personnage{

    public Vide(String name, String couleur, int ligne, int colonne){
        super(couleur, ligne, colonne);
        this.name = "" + name;
    }

    @Override
    public int[][] futuresCases(Personnage[][] plateau){
        int[][] possibilite = new int[0][0];
        return possibilite;
    }
}
