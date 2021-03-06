package org.pcdev.simplegames.characters.dropables;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GoodDrop implements Dropable {


    private Picture drop;


    public GoodDrop(double InitialY,String path) {
        this.drop = new Picture(-10,InitialY,path);
    }

    @Override
    public void moveDown() {
        drop.translate(0,20);
    }

    @Override
    public void selfDraw() {
        drop.draw();
    }

}
