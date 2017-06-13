package model;

public class EffetDisparitionColonne extends Effect{

    @Override
    public void playEffect(int line, int column, Game game) {
        int i;
        for(i=0;i<10;i++){
            game.getBoard().getTileIJ(i, column).setStatus(-1);
        }
    }
}
