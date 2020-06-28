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
    private Point2D tail;
    private Point2D head;
    
    public Vector2D(){
        this.tail = new Point2D();
        this.head = new Point2D();
    }
    
    public Vector2D(Point2D head, Point2D tail){
        this.head = head;
        this.tail = tail;
    }

    /**
     * @return the tail
     */
    public Point2D getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(Point2D tail) {
        this.tail = tail;
    }

    /**
     * @return the head
     */
    public Point2D getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Point2D head) {
        this.head = head;
    }
    
    public double getMagnitude(){
        return Math.sqrt(Math.pow(head.getX()-tail.getX(),2) + Math.pow(head.getY()-tail.getY(), 2));
    }
    
    public double getDirection(){
        return Math.atan((head.getY()-tail.getY()) / (head.getX()-tail.getX()));
    }
}
