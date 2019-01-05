package org.pcdev.simplegames.characters.dropables;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class BadDrop implements Dropable {


    private Picture drop;


    public BadDrop(double InitialY,String path) {
        this.drop = new Picture(InitialY,-10,path);
    }

    @Override
    public void moveDown() {
        drop.translate(40,0);
    }
}
