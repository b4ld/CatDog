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
        catdogImage.translate(direction,0);
    }

    public Picture getCatdogImage() {
        return catdogImage;
    }
}
