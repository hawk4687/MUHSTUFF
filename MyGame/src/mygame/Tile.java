/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mygame;

/**
 *
 * @author Jon
 */
public class Tile {
    
    private char[][] tile = new char[3][3];
    public Tile(){    
    }
    

    
     @Override
    public String toString() {
        return    "/n" + getTile()[0][0] + getTile()[0][1] + getTile()[0][2] + "/n"    
                 + getTile()[1][0] + getTile()[1][1] + getTile()[1][2] +"/n" 
                  + getTile()[2][0] + getTile()[2][1] + getTile()[2][2] + "/n";
    }

    /**
     * @return the tile
     */
    public char[][] getTile() {
        return tile;
    }

    /**
     * @param tile the tile to set
     */
    public void setTile(char[][] tile) {
        this.tile = tile;
    }
    public String info(){
        
        return "In progress";
    }
    
    
    
    
    
}
