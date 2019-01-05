package org.pcdev.simplegames.characters.dropables;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class BadDrop implements Dropable {


    private Picture drop;


    public BadDrop(double InitialY,String path) {
        this.drop = new Picture(-10,InitialY,path);
    }

    @Override
    public void moveDown() {
        drop.translate(0,40);
    }

    @Override
    public void selfDraw() {
        drop.draw();
    }
}
