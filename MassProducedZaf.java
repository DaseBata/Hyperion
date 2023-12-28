public class MassProducedZaf extends Personnage{
    public MassProducedZaf(String abrege, String couleur, int ligne, int colonne){
        super(couleur, ligne, colonne);
        this.name = abrege + "" + couleur;
    }

    @Override
    public int[][] futuresCases(Personnage[][] plateau){
        int[][] possibilite = new int[1][2];
        return possibilite;
    }
}
