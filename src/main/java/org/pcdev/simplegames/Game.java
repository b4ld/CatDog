package org.pcdev.simplegames;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.pcdev.simplegames.characters.Catdog;
import org.pcdev.simplegames.user_interface.KeyBoardHandler;


public class Game {

    private Rectangle board;
    private Picture backgroundImg;
    private static final int PADDING = 10;
    private Catdog catdog;
    private KeyBoardHandler KeyBoardHandler;
    private Keyboard keyboard;

    void init() {
        drawBoard();
        initBackgroundImg();
        initCatDog();

    }

    //Draw game frame view
    private void drawBoard() {
        board = new Rectangle(PADDING, PADDING, 1200, 600);
        board.setColor(Color.BLACK);
        board.draw();
    }


    private void initBackgroundImg() {
        int imgCounter = 1;
        backgroundImg = new Picture(PADDING, PADDING, "day" + imgCounter + ".png");
        backgroundImg.draw();
        // TODO : for loop and array to simulate day and night
        //NOTE: EVERY TIME THE PICTURE IS REDAW STEPS IN FRONT:::::

    }


    private void initCatDog() {
        catdog = new Catdog(10, 450, "catdogImg.png");
        catdog.drawCatdog();
        KeyBoardHandler = new KeyBoardHandler(catdog);
        initKeyBoard();
    }

    private void initKeyBoard() {

        keyboard = new Keyboard(KeyBoardHandler);

        KeyboardEvent[] events = new KeyboardEvent[3];

        for (int i = 0; i < events.length; i++) {
            events[i] = new KeyboardEvent();
        }


        for (int i = 0; i < events.length; i++) {
            events[i].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(events[i]);
        }

        events[0].setKey(KeyboardEvent.KEY_RIGHT);
        events[1].setKey(KeyboardEvent.KEY_LEFT);
        events[2].setKey(KeyboardEvent.KEY_S);

    }





































/*
    private void initKeyboard() {

        keyboard = new Keyboard(movements);


//Inicializar um array de keyboardEvents
        KeyboardEvent[] events = new KeyboardEvent[5];
        for (int i = 0; i < events.length; i++) {
            events[i] = new KeyboardEvent();
        }
//atribuir cada evento a uma posição do array
        events[0].setKey(KeyboardEvent.KEY_RIGHT);
        events[1].setKey(KeyboardEvent.KEY_UP);
        events[2].setKey(KeyboardEvent.KEY_DOWN);
        events[3].setKey(KeyboardEvent.KEY_LEFT);

        events[4].setKey(KeyboardEvent.KEY_SPACE);


//criar array de Listeners,if only KEY_PRESSED
        for (int i = 0; i < events.length; i++) {
            events[i].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(events[i]);
        }
    }

        */

}
