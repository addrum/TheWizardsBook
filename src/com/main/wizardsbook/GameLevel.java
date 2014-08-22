/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.wizardsbook;

import org.jbox2d.common.Vec2;

/**
 *
 * @author adam
 */
public abstract class GameLevel {
    
    protected Game game;
    
    public GameLevel(Game g) {
        game = g;
    }
    
    public abstract void initLevel();
    
}
