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
        if(catdogImage.getX()+direction>=0 && catdogImage.getX()+direction<1000){
        catdogImage.translate(direction,0);
        }

    }

    public Picture getCatdogImage() {
        return catdogImage;
    }
}
