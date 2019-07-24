package org.mineprogramming.demo.androidoop.shape;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Circle extends Shape {
    private float radius;
    private Paint paint;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;

        paint = new Paint();
        paint.setColor(Color.GREEN);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawCircle(x, y, radius, paint);
    }
}
