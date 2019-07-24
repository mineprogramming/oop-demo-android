package org.mineprogramming.demo.androidoop.shape;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Rectangle extends Shape {
    private float width, height;
    protected Paint paint;

    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;

        paint = new Paint();
        paint.setColor(Color.RED);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRect(x, y, x + width, y + height, paint);
    }
}
