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

    private static final int PADDING = 10;
    private Catdog catdog;
    private KeyBoardHandler KeyBoardHandler;

    void init() {
        drawBoard();
        initBackgroundImg();
        initCatDog();

    }

    //Draw game frame view
    private void drawBoard() {
        Rectangle board;
        board = new Rectangle(PADDING, PADDING, 1200, 600);
        board.setColor(Color.BLACK);
        board.draw();
    }


    private void initBackgroundImg() {
        Picture backgroundImg;
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

        Keyboard keyboard;

        keyboard = new Keyboard(KeyBoardHandler);

        KeyboardEvent[] events = new KeyboardEvent[3];

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
