package org.pcdev.simplegames;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.pcdev.simplegames.characters.Catdog;
import org.pcdev.simplegames.characters.dropables.Dropable;
import org.pcdev.simplegames.characters.factory.FactoryDropables;
import org.pcdev.simplegames.user_interface.KeyBoardHandler;


public class Game {

    private static final int PADDING = 10;
    private final int INITIAL_CATDOG_X_POSITION = 250;
    private final int INITIAL_CATDOG_Y_POSITION = 450;

    private Catdog catdog;
    private KeyBoardHandler KeyBoardHandler;
    private KeyboardEvent keyboardEvent;
    private KeyboardEvent[] events = new KeyboardEvent[3];
    private Dropable dropableProp;


    public void initStartMenu() {
        Picture startMenuImg = new Picture(PADDING, PADDING, "day10.png");

    }

    public void init() {
        drawBoard();
        initBackgroundImg();
        initCatDog();
        initDrops();
        dropDrops();

    }


    //Draw game frame view
    private void drawBoard() {
        Rectangle board = new Rectangle(PADDING, PADDING, 1200, 600);
        board.setColor(Color.BLACK);
        board.draw();
    }


    private void initBackgroundImg() {
        int imgCounter = 1;
        Picture backgroundImg = new Picture(PADDING, PADDING, "day" + imgCounter + ".png");
        backgroundImg.draw();
        // TODO : for loop and array to simulate day and night
        //NOTE: EVERY TIME THE PICTURE IS REDRAW STEPS IN FRONT:::::

    }


    private void initCatDog() {

        catdog = new Catdog(INITIAL_CATDOG_X_POSITION, INITIAL_CATDOG_Y_POSITION, "catdogImg.png");
        catdog.drawCatdog();
        KeyBoardHandler = new KeyBoardHandler(catdog);
        initKeyBoard();
    }



    private void initDrops(){

        FactoryDropables factoryDropables = new FactoryDropables();

        Dropable dropable = factoryDropables.createADrop();

        dropable.selfDraw();


        dropableProp=dropable;

    }

    private void dropDrops(){

        for (int i = 0; i < 40 ; i++) {
            try {
                Thread.sleep(70);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dropableProp.moveDown();
        }


    }






    private void initKeyBoard() {

        Keyboard keyboard = new Keyboard(KeyBoardHandler);


        //add new keyBoard to array
        for (int i = 0; i < events.length; i++) {
            events[i] = new KeyboardEvent();
        }

        //add event to each
        for (int i = 0; i < events.length; i++) {
            events[i].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(events[i]);
        }
        //add specific key
        events[0].setKey(KeyboardEvent.KEY_RIGHT);
        events[1].setKey(KeyboardEvent.KEY_LEFT);
        events[2].setKey(KeyboardEvent.KEY_S);

    }


}
