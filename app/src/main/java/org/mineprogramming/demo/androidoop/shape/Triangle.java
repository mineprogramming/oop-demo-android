package org.mineprogramming.demo.androidoop.shape;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Triangle extends Shape {
    private final static int COLOR = Color.BLUE;

    private float[] vertices;
    private int[] colors;

    private Paint paint;

    public Triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        super(x1, y1);
        vertices = new float[]{x1, y1, x2, y2, x3, y3};
        colors = new int[]{COLOR, COLOR, COLOR, COLOR, COLOR, COLOR};

        paint = new Paint();
        paint.setColor(COLOR);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawVertices(Canvas.VertexMode.TRIANGLE_FAN, vertices.length, vertices, 0,
                null, 0, colors, 0, null, 0, 0, paint);
    }
}
