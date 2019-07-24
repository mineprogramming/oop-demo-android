package org.mineprogramming.demo.androidoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.mineprogramming.demo.androidoop.shape.Circle;
import org.mineprogramming.demo.androidoop.shape.Rectangle;
import org.mineprogramming.demo.androidoop.shape.Triangle;

public class MainActivity extends AppCompatActivity {
    MySurfaceView surface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        surface = new MySurfaceView(this);
        surface.addShape(new Circle(200, 200, 200));
        surface.addShape(new Rectangle(400, 300, 500, 300));
        surface.addShape(new Triangle(1000, 700, 1200, 800, 1100, 500));
        setContentView(surface);
    }

}
