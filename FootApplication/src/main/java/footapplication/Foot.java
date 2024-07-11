/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footapplication;

/**
 *
 * @author User
 */
public class Foot {
    private FootShape footShape;
    public Foot(FootShape footShape){
        this.footShape = footShape;
    }
    
    public void draw(String shape){
        switch(shape){
            case "Rectangle":
                footShape.drawAsRectangle();
                break;
            case "Ellipse":
                footShape.drawAsEllipse();
        }
    }
}
