package org.mineprogramming.demo.androidoop;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceView;
import android.view.View;

import org.mineprogramming.demo.androidoop.shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class MySurfaceView extends SurfaceView {
    List<Shape> shapes = new ArrayList<>();

    public MySurfaceView(Context context) {
        super(context);
        setWillNotDraw(false);
        setLayerType(View.LAYER_TYPE_SOFTWARE, null);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        for (Shape shape: shapes) {
            shape.draw(canvas);
        }
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }
}
