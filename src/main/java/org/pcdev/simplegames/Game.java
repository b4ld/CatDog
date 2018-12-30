package org.pcdev.simplegames;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.pcdev.simplegames.characters.Catdog;

import java.awt.geom.PathIterator;

public class Game {

    private Rectangle board;
    private Picture backgroundImg;
    private static final int PADDING = 10;
    private Catdog catdog;

    void init() {
        drawBoard();
        initBackgroungImg();
        initCatDog();


    }

    //Draw game background
    private void drawBoard() {
        board = new Rectangle(PADDING, PADDING, 1200, 600);
        board.setColor(Color.BLACK);
        board.draw();
    }


    private void initBackgroungImg(){
        backgroundImg = new Picture(PADDING,PADDING,"day1.png");
        backgroundImg.draw();
    }


    private void initCatDog(){
        catdog = new Catdog(10,450, "catdogImg.png");
        catdog.drawCatdog();


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
