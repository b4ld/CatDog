package org.pcdev.simplegames.user_interface;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.pcdev.simplegames.characters.Catdog;

public class KeyBoardHandler implements KeyboardHandler {


    private Catdog catDog;


    public KeyBoardHandler(Catdog catDog) {
        this.catDog = catDog;
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_LEFT:
                catDog.move(-50);
                break;
            case KeyboardEvent.KEY_RIGHT:
                catDog.move(50);
                break;






        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
