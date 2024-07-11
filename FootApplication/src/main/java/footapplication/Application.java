/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footapplication;

import java.util.Scanner;

/**
 *
 * @author 64050030_Kitipum_Nornua
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FootShape footShape = new FootShape();
        Foot foot = new Foot(footShape);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("What to draw? 1. Ellipse, 2. Rectangle");
        int type = sc.nextInt();
        switch(type){
            case 1 :
                foot.draw("Ellipse");
                break;
            case 2 :
                foot.draw("Rectangle");
                break;
            default:
                System.out.println("Please choose either 1 or 2");
        }
        sc.close();
    }
    
}
