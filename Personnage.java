public abstract class Personnage{

    public String name;
    public String couleur;
    public int ligne;
    public int colonne;
    public int[] oldPosition = {0, 0};

    public Personnage(String couleur, int ligne, int colonne){
        this.couleur = couleur;
        this.ligne = ligne;
        this.colonne = colonne;
        this.oldPosition[0] = ligne;
        this.oldPosition[1] = colonne;
    }

    public int move(Personnage[][] plateau, Joueur joueur, Personnage perso){

        System.out.println("------Case(s) Disponible(s)------");

        int[][] arrive = this.futuresCases(plateau);
        if( arrive == null ){
            return 0;
        }
        int[] moveChoisi = joueur.chooseMove(plateau, arrive, perso);
        if(plateau[moveChoisi[0]][moveChoisi[1]].couleur == this.couleur){
            if(((perso.name.substring(0, 2).equals("TQ")) && (plateau[moveChoisi[0]][moveChoisi[1]].name.substring(0, 2).equals("OL"))) || ((perso.name.substring(0, 2).equals("OL")) && (plateau[moveChoisi[0]][moveChoisi[1]].name.substring(0, 2).equals("TQ")))){
                this.oldPosition[0] = this.ligne;
                this.oldPosition[1] = this.colonne;
                this.ligne = moveChoisi[0];
                this.colonne = moveChoisi[1];
                return 3;
            } else {
                System.out.println(""+plateau[moveChoisi[0]][moveChoisi[1]].couleur);
                return 0;
            }
        }                                                                                                                                                                                     //
        if((this.couleur.equals("B") || this.couleur.equals("V")) && (plateau[moveChoisi[0]][moveChoisi[1]].couleur.equals("R") || plateau[moveChoisi[0]][moveChoisi[1]].couleur.equals("J")) || (this.couleur.equals("R") || this.couleur.equals("J")) && (plateau[moveChoisi[0]][moveChoisi[1]].couleur.equals("B") || plateau[moveChoisi[0]][moveChoisi[1]].couleur.equals("V"))){
            System.out.println("Piece prise : " + plateau[moveChoisi[0]][moveChoisi[1]].name);
            //GÉRER LA PRISE DE PIECE POUR TESTER LA VICTOIRE
            if(plateau[moveChoisi[0]][moveChoisi[1]].name.substring(0, 2).equals("FM")){
                boolean dEA = false;
                dEA = deadExtremAttack(moveChoisi[0], moveChoisi[1], plateau[moveChoisi[0]][moveChoisi[1]].couleur, plateau);
                if (dEA == true){
                    this.oldPosition[0] = this.ligne;
                    this.oldPosition[1] = this.colonne;
                    this.ligne = moveChoisi[0];
                    this.colonne = moveChoisi[1];
                    return 4;
                }
            }
        }

        this.oldPosition[0] = this.ligne;
        this.oldPosition[1] = this.colonne;
        this.ligne = moveChoisi[0];
        this.colonne = moveChoisi[1];
        return 1;
    }

    public abstract int[][] futuresCases(Personnage[][] plateau);

    public boolean deadExtremAttack(int x, int y, String couleur, Personnage[][] plateau){
        boolean resultat = false;

        if (x + 1 < 17){
                if(plateau[x+1][y].name.substring(plateau[x+1][y].name.length()-1).equals("" + couleur)){
                    resultat = true;
                }
            }
            if (x - 1 >= 0){
                if(plateau[x-1][y].name.substring(plateau[x-1][y].name.length()-1).equals("" + couleur)){
                    resultat = true;
                }
            }
            if (y + 1 < 17){
                if(plateau[x][y+1].name.substring(plateau[x][y+1].name.length()-1).equals("" + couleur)){
                    resultat = true;
                }
            }
            if (y - 1 >= 0){
                if(plateau[x][y-1].name.substring(plateau[x][y-1].name.length()-1).equals("" + couleur)){
                    resultat = true;
                }
            }
            if ((x + 1 < 17) && (y + 1 < 17)){
                if(plateau[x+1][y+1].name.substring(plateau[x+1][y+1].name.length()-1).equals("" + couleur)){
                    resultat = true;
                }
            }
            if ((x + 1 < 17) && (y - 1 >= 0)){
                if(plateau[x+1][y-1].name.substring(plateau[x+1][y-1].name.length()-1).equals("" + couleur)){
                    resultat = true;
                }
            }
            if ((x - 1 >= 0) && (y + 1 < 17)){
                if(plateau[x-1][y+1].name.substring(plateau[x-1][y+1].name.length()-1).equals("" + couleur)){
                    resultat = true;
                }
            }
            if ((x - 1 >= 0) && (y - 1 >= 0)){
                if(plateau[x-1][y-1].name.substring(plateau[x-1][y-1].name.length()-1).equals("" + couleur)){
                    resultat = true;
                }
            }
        return resultat;
    }
}
