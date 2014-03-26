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
public class Segment {
    private int row;
    private int col;
    private boolean player;
    private Tile[][] segment = new Tile[9][9];
    
    public Segment(int Row, int Col){
        row = Row;
        col = Col;
        
    }
    
    
}
