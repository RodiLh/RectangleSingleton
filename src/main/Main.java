package main;

import rectangle.Rectangle;

/**
 *
 * @author dmr
 */
public class Main {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Rectangle rectangle1 = Rectangle.getInstance();
        
        System.out.println(rectangle1);
        
//        System.out.println("\nLongueur rectangle1 : " + rectangle1.getLongueur());
//        System.out.println("Largeur rectangle1 : " + rectangle1.getLargeur());
    }
}