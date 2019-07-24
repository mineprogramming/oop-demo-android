package org.mineprogramming.demo.androidoop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import org.mineprogramming.demo.androidoop.shape.Circle;
import org.mineprogramming.demo.androidoop.shape.Rectangle;
import org.mineprogramming.demo.androidoop.shape.Square;
import org.mineprogramming.demo.androidoop.shape.Triangle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    MySurfaceView surface;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        random = new Random();

        surface = new MySurfaceView(this);
        setContentView(surface);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        float x = random.nextFloat() * 700;
        float y = random.nextFloat() * 700;

        switch(item.getItemId()){
            case R.id.btn_circle:
                surface.addShape(new Circle(x, y, 150));
                break;

            case R.id.btn_rectangle:
                surface.addShape(new Rectangle(x, y, 300, 200));
                break;

            case R.id.btn_square:
                surface.addShape(new Square(x, y, 180));
                break;

            case R.id.btn_triangle:
                surface.addShape(new Triangle(x, y, x + 300, y + 200, x + 50, y + 250));
                break;
        }
        surface.invalidate();
        return true;
    }
}
