public class OfficeLady extends Personnage{
    public OfficeLady(String couleur, int ligne, int colonne){
        super(couleur, ligne, colonne);
        this.name = "OL__" + couleur;
    }

    @Override
    public int[][] futuresCases(Personnage[][] plateau){

        int[][] possibilite = null;
        int i=0;

        if (this.couleur.equals("B")) {

            if ((this.ligne + 1 < 17) && (this.colonne + 1 < 17)){
                if(plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals("R") || plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals("J") || plateau[this.ligne+1][this.colonne+1].name.equals("_____") || (plateau[this.ligne+1][this.colonne+1].name.substring(0, 2).equals("TQ") && plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals(""+this.couleur))){
                    i++;
                }
            }

            if ((this.ligne + 1 < 17) && (this.colonne - 1 >= 0)){
                if(plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals("R") || plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals("J") || plateau[this.ligne+1][this.colonne-1].name.equals("_____") || (plateau[this.ligne+1][this.colonne-1].name.substring(0, 2).equals("TQ") && plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals(""+this.couleur))){
                    i++;
                }
            }

            if ((this.ligne - 1 >= 0) && (this.colonne + 1 < 17)){
                if(plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals("R") || plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals("J") || plateau[this.ligne-1][this.colonne+1].name.equals("_____") || (plateau[this.ligne-1][this.colonne+1].name.substring(0, 2).equals("TQ") && plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals(""+this.couleur))){
                    i++;
                }
            }

            if ((this.ligne - 1 >= 0) && (this.colonne - 1 >= 0)){
                if(plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals("R") || plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals("J") || plateau[this.ligne-1][this.colonne-1].name.equals("_____") || (plateau[this.ligne-1][this.colonne-1].name.substring(0, 2).equals("TQ") && plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals(""+this.couleur))){
                    i++;
                }
            }

            if (i != 0){

                possibilite = new int[i][2];
                int j=0;

                if ((this.ligne + 1 < 17) && (this.colonne + 1 < 17)){
                    if(plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals("R") || plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals("J") || plateau[this.ligne+1][this.colonne+1].name.equals("_____") || (plateau[this.ligne+1][this.colonne+1].name.substring(0, 2).equals("TQ") && plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals(""+this.couleur))){
                        possibilite[j][0] = this.ligne + 1;
                        possibilite[j][1] = this.colonne + 1;
                        j++;
                    }
                }

                if ((this.ligne + 1 < 17) && (this.colonne - 1 >= 0)){
                    if(plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals("R") || plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals("J") || plateau[this.ligne+1][this.colonne-1].name.equals("_____") || (plateau[this.ligne+1][this.colonne-1].name.substring(0, 2).equals("TQ") && plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals(""+this.couleur))){
                        possibilite[j][0] = this.ligne + 1;
                        possibilite[j][1] = this.colonne - 1;
                        j++;
                    }
                }

                if ((this.ligne - 1 >= 0) && (this.colonne + 1 < 17)){
                    if(plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals("R") || plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals("J") || plateau[this.ligne-1][this.colonne+1].name.equals("_____") || (plateau[this.ligne-1][this.colonne+1].name.substring(0, 2).equals("TQ") && plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals(""+this.couleur))){
                        possibilite[j][0] = this.ligne - 1;
                        possibilite[j][1] = this.colonne + 1;
                        j++;
                    }
                }

                if ((this.ligne - 1 >= 0) && (this.colonne - 1 >= 0)){
                    if(plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals("R") || plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals("J") || plateau[this.ligne-1][this.colonne-1].name.equals("_____") || (plateau[this.ligne-1][this.colonne-1].name.substring(0, 2).equals("TQ") && plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals(""+this.couleur))){
                        possibilite[j][0] = this.ligne - 1;
                        possibilite[j][1] = this.colonne - 1;
                        j++;
                    }
                }
            }

        } else if (this.couleur.equals("J")){

            if ((this.ligne + 1 < 17) && (this.colonne + 1 < 17)){
                if(plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals("B") || plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals("V") || plateau[this.ligne+1][this.colonne+1].name.equals("_____") || (plateau[this.ligne+1][this.colonne+1].name.substring(0, 2).equals("TQ") && plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals(""+this.couleur))){
                    i++;
                }
            }

            if ((this.ligne + 1 < 17) && (this.colonne - 1 >= 0)){
                if(plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals("B") || plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals("V") || plateau[this.ligne+1][this.colonne-1].name.equals("_____") || (plateau[this.ligne+1][this.colonne-1].name.substring(0, 2).equals("TQ") && plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals(""+this.couleur))){
                    i++;
                }
            }

            if ((this.ligne - 1 >= 0) && (this.colonne + 1 < 17)){
                if(plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals("B") || plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals("V") || plateau[this.ligne-1][this.colonne+1].name.equals("_____") || (plateau[this.ligne-1][this.colonne+1].name.substring(0, 2).equals("TQ") && plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals(""+this.couleur))){
                    i++;
                }
            }

            if ((this.ligne - 1 >= 0) && (this.colonne - 1 >= 0)){
                if(plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals("B") || plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals("V") || plateau[this.ligne-1][this.colonne-1].name.equals("_____") || (plateau[this.ligne-1][this.colonne-1].name.substring(0, 2).equals("TQ") && plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals(""+this.couleur))){
                    i++;
                }
            }

            if (i != 0){

                possibilite = new int[i][2];
                int j=0;

                if ((this.ligne + 1 < 17) && (this.colonne + 1 < 17)){
                    if(plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals("B") || plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals("V") || plateau[this.ligne+1][this.colonne+1].name.equals("_____") || (plateau[this.ligne+1][this.colonne+1].name.substring(0, 2).equals("TQ") && plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals(""+this.couleur))){
                        possibilite[j][0] = this.ligne + 1;
                        possibilite[j][1] = this.colonne + 1;
                        j++;
                    }
                }

                if ((this.ligne + 1 < 17) && (this.colonne - 1 >= 0)){
                    if(plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals("B") || plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals("V") || plateau[this.ligne+1][this.colonne-1].name.equals("_____") || (plateau[this.ligne+1][this.colonne-1].name.substring(0, 2).equals("TQ") && plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals(""+this.couleur))){
                        possibilite[j][0] = this.ligne + 1;
                        possibilite[j][1] = this.colonne - 1;
                        j++;
                    }
                }

                if ((this.ligne - 1 >= 0) && (this.colonne + 1 < 17)){
                    if(plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals("B") || plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals("V") || plateau[this.ligne-1][this.colonne+1].name.equals("_____") || (plateau[this.ligne-1][this.colonne+1].name.substring(0, 2).equals("TQ") && plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals(""+this.couleur))){
                        possibilite[j][0] = this.ligne - 1;
                        possibilite[j][1] = this.colonne + 1;
                        j++;
                    }
                }

                if ((this.ligne - 1 >= 0) && (this.colonne - 1 >= 0)){
                    if(plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals("B") || plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals("V") || plateau[this.ligne-1][this.colonne-1].name.equals("_____") || (plateau[this.ligne-1][this.colonne-1].name.substring(0, 2).equals("TQ") && plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals(""+this.couleur))){
                        possibilite[j][0] = this.ligne - 1;
                        possibilite[j][1] = this.colonne - 1;
                        j++;
                    }
                }
            }

        } else if (this.couleur.equals("V")){

            if ((this.ligne + 1 < 17) && (this.colonne + 1 < 17)){
                if(plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals("R") || plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals("J") || plateau[this.ligne+1][this.colonne+1].name.equals("_____") || (plateau[this.ligne+1][this.colonne+1].name.substring(0, 2).equals("TQ") && plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals(""+this.couleur))){
                    i++;
                }
            }

            if ((this.ligne + 1 < 17) && (this.colonne - 1 >= 0)){
                if(plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals("R") || plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals("J") || plateau[this.ligne+1][this.colonne-1].name.equals("_____") || (plateau[this.ligne+1][this.colonne-1].name.substring(0, 2).equals("TQ") && plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals(""+this.couleur))){
                    i++;
                }
            }

            if ((this.ligne - 1 >= 0) && (this.colonne + 1 < 17)){
                if(plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals("R") || plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals("J") || plateau[this.ligne-1][this.colonne+1].name.equals("_____") || (plateau[this.ligne-1][this.colonne+1].name.substring(0, 2).equals("TQ") && plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals(""+this.couleur))){
                    i++;
                }
            }

            if ((this.ligne - 1 >= 0) && (this.colonne - 1 >= 0)){
                if(plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals("R") || plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals("J") || plateau[this.ligne-1][this.colonne-1].name.equals("_____") || (plateau[this.ligne-1][this.colonne-1].name.substring(0, 2).equals("TQ") && plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals(""+this.couleur))){
                    i++;
                }
            }

            if (i != 0){

                possibilite = new int[i][2];
                int j=0;

                if ((this.ligne + 1 < 17) && (this.colonne + 1 < 17)){
                    if(plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals("R") || plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals("J") || plateau[this.ligne+1][this.colonne+1].name.equals("_____") || (plateau[this.ligne+1][this.colonne+1].name.substring(0, 2).equals("TQ") && plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals(""+this.couleur))){
                        possibilite[j][0] = this.ligne + 1;
                        possibilite[j][1] = this.colonne + 1;
                        j++;
                    }
                }

                if ((this.ligne + 1 < 17) && (this.colonne - 1 >= 0)){
                    if(plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals("R") || plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals("J") || plateau[this.ligne+1][this.colonne-1].name.equals("_____") || (plateau[this.ligne+1][this.colonne-1].name.substring(0, 2).equals("TQ") && plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals(""+this.couleur))){
                        possibilite[j][0] = this.ligne + 1;
                        possibilite[j][1] = this.colonne - 1;
                        j++;
                    }
                }

                if ((this.ligne - 1 >= 0) && (this.colonne + 1 < 17)){
                    if(plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals("R") || plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals("J") || plateau[this.ligne-1][this.colonne+1].name.equals("_____") || (plateau[this.ligne-1][this.colonne+1].name.substring(0, 2).equals("TQ") && plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals(""+this.couleur))){
                        possibilite[j][0] = this.ligne - 1;
                        possibilite[j][1] = this.colonne + 1;
                        j++;
                    }
                }

                if ((this.ligne - 1 >= 0) && (this.colonne - 1 >= 0)){
                    if(plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals("R") || plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals("J") || plateau[this.ligne-1][this.colonne-1].name.equals("_____") || (plateau[this.ligne-1][this.colonne-1].name.substring(0, 2).equals("TQ") && plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals(""+this.couleur))){
                        possibilite[j][0] = this.ligne - 1;
                        possibilite[j][1] = this.colonne - 1;
                        j++;
                    }
                }
            }

        } else {

            if ((this.ligne + 1 < 17) && (this.colonne + 1 < 17)){
                if(plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals("B") || plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals("V") || plateau[this.ligne+1][this.colonne+1].name.equals("_____") || (plateau[this.ligne+1][this.colonne+1].name.substring(0, 2).equals("TQ") && plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals(""+this.couleur))){
                    i++;
                }
            }

            if ((this.ligne + 1 < 17) && (this.colonne - 1 >= 0)){
                if(plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals("B") || plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals("V") || plateau[this.ligne+1][this.colonne-1].name.equals("_____") || (plateau[this.ligne+1][this.colonne-1].name.substring(0, 2).equals("TQ") && plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals(""+this.couleur))){
                    i++;
                }
            }

            if ((this.ligne - 1 >= 0) && (this.colonne + 1 < 17)){
                if(plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals("B") || plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals("V") || plateau[this.ligne-1][this.colonne+1].name.equals("_____") || (plateau[this.ligne-1][this.colonne+1].name.substring(0, 2).equals("TQ") && plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals(""+this.couleur))){
                    i++;
                }
            }

            if ((this.ligne - 1 >= 0) && (this.colonne - 1 >= 0)){
                if(plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals("B") || plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals("V") || plateau[this.ligne-1][this.colonne-1].name.equals("_____") || (plateau[this.ligne-1][this.colonne-1].name.substring(0, 2).equals("TQ") && plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals(""+this.couleur))){
                    i++;
                }
            }

            if (i != 0){

                possibilite = new int[i][2];
                int j=0;

                if ((this.ligne + 1 < 17) && (this.colonne + 1 < 17)){
                    if(plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals("B") || plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals("V") || plateau[this.ligne+1][this.colonne+1].name.equals("_____") || (plateau[this.ligne+1][this.colonne+1].name.substring(0, 2).equals("TQ") && plateau[this.ligne+1][this.colonne+1].name.substring(plateau[this.ligne+1][this.colonne+1].name.length()-1).equals(""+this.couleur))){
                        possibilite[j][0] = this.ligne + 1;
                        possibilite[j][1] = this.colonne + 1;
                        j++;
                    }
                }

                if ((this.ligne + 1 < 17) && (this.colonne - 1 >= 0)){
                    if(plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals("B") || plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals("V") || plateau[this.ligne+1][this.colonne-1].name.equals("_____") || (plateau[this.ligne+1][this.colonne-1].name.substring(0, 2).equals("TQ") && plateau[this.ligne+1][this.colonne-1].name.substring(plateau[this.ligne+1][this.colonne-1].name.length()-1).equals(""+this.couleur))){
                        possibilite[j][0] = this.ligne + 1;
                        possibilite[j][1] = this.colonne - 1;
                        j++;
                    }
                }

                if ((this.ligne - 1 >= 0) && (this.colonne + 1 < 17)){
                    if(plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals("B") || plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals("V") || plateau[this.ligne-1][this.colonne+1].name.equals("_____") || (plateau[this.ligne-1][this.colonne+1].name.substring(0, 2).equals("TQ") && plateau[this.ligne-1][this.colonne+1].name.substring(plateau[this.ligne-1][this.colonne+1].name.length()-1).equals(""+this.couleur))){
                        possibilite[j][0] = this.ligne - 1;
                        possibilite[j][1] = this.colonne + 1;
                        j++;
                    }
                }

                if ((this.ligne - 1 >= 0) && (this.colonne - 1 >= 0)){
                    if(plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals("B") || plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals("V") || plateau[this.ligne-1][this.colonne-1].name.equals("_____") || (plateau[this.ligne-1][this.colonne-1].name.substring(0, 2).equals("TQ") && plateau[this.ligne-1][this.colonne-1].name.substring(plateau[this.ligne-1][this.colonne-1].name.length()-1).equals(""+this.couleur))){
                        possibilite[j][0] = this.ligne - 1;
                        possibilite[j][1] = this.colonne - 1;
                        j++;
                    }
                }
            }
        }
        return possibilite;
    }
}
