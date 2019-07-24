package org.mineprogramming.demo.androidoop.shape;

import android.graphics.Canvas;

public abstract class Shape {
    protected float x, y;

    public Shape(float x, float y){
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Canvas canvas);
}
