package com.android.animatesummary;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ImageView imgElliptical = (ImageView) findViewById(R.id.elliptical_anim_image);

        findViewById(R.id.elliptical_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgElliptical.setImageDrawable(getDrawable(R.drawable.animate_vector_elliptical_drawable));
                Drawable drawableElliptical = imgElliptical.getDrawable();
                if(drawableElliptical instanceof Animatable){
                    ((Animatable)drawableElliptical).start();
                }
            }
        });

        findViewById(R.id.elliptical_path_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgElliptical.setImageDrawable(getDrawable(R.drawable.animate_vector_elliptical_path_drawable));
                Drawable drawableElliptical = imgElliptical.getDrawable();
                if(drawableElliptical instanceof Animatable){
                    ((Animatable)drawableElliptical).start();
                }
            }
        });

        final ImageView imgLine = (ImageView) findViewById(R.id.line_anim_image);
        findViewById(R.id.line_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgLine.setImageDrawable(getDrawable(R.drawable.animate_vector_line_drawable));
                final Drawable drawableLine = imgLine.getDrawable();
                if (drawableLine instanceof  Animatable){
                    ((Animatable) drawableLine).start();
                }
            }
        });

        findViewById(R.id.line_reset_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgLine.setImageDrawable(getDrawable(R.drawable.animate_vector_line_reset_drawable));
                if(imgLine.getDrawable() instanceof Animatable){
                    ((Animatable) imgLine.getDrawable()).start();
                }
            }
        });

        ImageView imgStar = (ImageView) findViewById(R.id.svg_star);
        final Drawable drawableStar = imgStar.getDrawable();

        findViewById(R.id.star_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(drawableStar instanceof  Animatable){
                    ((Animatable) drawableStar).start();
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
