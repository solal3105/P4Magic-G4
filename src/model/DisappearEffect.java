/**
 * MagicP4
 * IUT Lyon 1 - 2016
 */
package model;

/**
 *
 * @author hakkahi / acordier - IUT Lyon 1 - 2016
 */
public class DisappearEffect extends Effect {

    /**
     * @param int line : Ligne de la case
     * @param int column : colonne de la case
     * @param Game game : jeux de la partie
     * L'effet permet de faire disparaitre la case 
     */
    @Override
    public void playEffect(int line, int column, Game game) {
        /*
        * Nous 
        */
        int tile_id=game.getBoard().getTileIJ(line, column).getStatus();
        int player1_id = game.getPlayer1().getId();
        int player2_id = game.getPlayer2().getId();
        
        if (tile_id == player1_id){
            tile_id = -1;
        }
        else if(tile_id == player2_id){
            tile_id=-1;
        }
        game.getBoard().getTileIJ(line, column).setStatus(tile_id);

    }

}
