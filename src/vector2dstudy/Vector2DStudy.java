/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector2dstudy;

import java.util.Scanner;

/**
 *
 * @author Wilson S. Moreno
 */
public class Vector2DStudy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector2D v = new Vector2D();
        Point2D tail = new Point2D();
        Point2D head = new Point2D();
        
        Scanner input = new Scanner( System.in );
        
        System.out.println("Welcome to Vector 2D Study Program");
        
        System.out.print("\nPlease enter x coordinate of vector tail: ");
        tail.setX(input.nextDouble());
        System.out.print("Please enter y coordinate of vector tail: ");
        tail.setY(input.nextDouble());
        System.out.print("\nPlease enter x coordinate of vector head: ");
        head.setX(input.nextDouble());
        System.out.print("Please enter y coordinate of vector head: ");
        head.setY(input.nextDouble());
        
        v.setTail(tail);
        v.setHead(head);
        
        System.out.printf("\nThe magnitude of the vector is: %.2f", v.getMagnitude());
        System.out.printf("\nThe direction of the vector is: %.2f radian", v.getDirection());
        
        System.out.println();
    }
    
}
