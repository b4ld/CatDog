package org.pcdev.simplegames.characters.dropables;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GoodDrop implements Dropable {


    private Picture drop;


    public GoodDrop(double InitialY,String path) {
        this.drop = new Picture(InitialY,-10,path);
    }

    @Override
    public void moveDown() {
        drop.translate(20,0);
    }

}
