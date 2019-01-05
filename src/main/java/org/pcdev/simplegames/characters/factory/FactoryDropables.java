package org.pcdev.simplegames.characters.factory;


import org.pcdev.simplegames.characters.dropables.BadDrop;
import org.pcdev.simplegames.characters.dropables.Dropable;
import org.pcdev.simplegames.characters.dropables.GoodDrop;
import org.pcdev.simplegames.utility.Randomizer;

public class FactoryDropables {

    public Dropable createADrop() {

        int random = Randomizer.Random(10);
        System.out.println(random);
        //TODO . Random create drop

        if (random >= 4) {
            return new BadDrop(100, "bad2.jpeg");

        }

        return new GoodDrop(100, "bone1.jpg");
    }

}
