/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector2dstudy;

import java.lang.Math;

/**
 *
 * @author Wilson S. Moreno
 */
public class Vector2D {
    private double x;
    private double y;
        
    public Vector2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Vector2D(){
        this.x = 0;
        this.y = 0;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
    
    public double getMagnitude(){
        return Math.sqrt( x*x + y*y );
    }
}
