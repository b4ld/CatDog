package org.pcdev.simplegames.characters;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Catdog {

    private Picture catdogImage;


    public Catdog(double posX, double posY, String path) {
        this.catdogImage = new Picture(posX,posY,path);
    }

    public void drawCatdog(){
        catdogImage.draw();
    }

    public void move(int direction){
        System.out.println("outside If "+catdogImage.getX());
        System.out.println("Direction" +direction);
        if(catdogImage.getX()>=50 && catdogImage.getX()<=900){
        catdogImage.translate(direction,0);
            System.out.println("inside if "+catdogImage.getX());
        }

        //TODO : Check colision??
    }

    public Picture getCatdogImage() {
        return catdogImage;
    }
}
