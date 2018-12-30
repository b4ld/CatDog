package org.pcdev.simplegames;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Game {

    private Rectangle board;
    private static final int PADDING = 10;

    void init(){
        drawBoard();


    }





    //Draw game background
    private void drawBoard() {
        board = new Rectangle(PADDING , PADDING, 1200, 600);
        board.setColor(Color.BLACK);
        board.draw();
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
