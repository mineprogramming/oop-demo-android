package org.mineprogramming.demo.androidoop.shape;

import android.graphics.Color;

public class Square extends Rectangle {
    public Square(float x, float y, float side) {
        super(x, y, side, side);
        paint.setColor(Color.CYAN);
    }
}
