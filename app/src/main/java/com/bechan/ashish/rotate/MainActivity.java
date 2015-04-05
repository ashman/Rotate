package com.bechan.ashish.rotate;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.ArcShape;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.PathShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /***********************************************************************************************************************************************/
        // placing a rectangle/shape defined in a XML file in the res\drawable folder
        ImageView iv = (ImageView) findViewById(R.id.ImageView1);
        iv.setImageResource(R.drawable.rect);
        //iv.setImageResource(R.drawable.shape);

        /***********************************************************************************************************************************************/
        //programmatically drawing a normal rectangle
        /*ShapeDrawable rect = new ShapeDrawable(new RectShape());
        rect.setIntrinsicHeight(20);
        rect.setIntrinsicWidth(100);
        rect.getPaint().setColor(Color.RED);

        ImageView iView = (ImageView) findViewById(R.id.ImageView1);
        iView.setImageDrawable(rect);*/

        /***********************************************************************************************************************************************/
        //programmatically drawing a rounded rectangle
        /*ShapeDrawable rndRect = new ShapeDrawable(new RoundRectShape(new float[] {50,50,50,50,50,50,50,50}, null, null));
        rndRect.setIntrinsicWidth(950);
        rndRect.setIntrinsicHeight(300);
        rndRect.getPaint().setColor(Color.BLUE);


        ImageView iViewm = (ImageView) findViewById(R.id.ImageView2);
        iViewm.setImageDrawable(rndRect);*/

        /***********************************************************************************************************************************************/
        //programmatically draw a rounded rectangle boarder
        /*float[] outerRadii = new float[]{ 16,16, 6, 6, 16,16, 6,6 };
        RectF insetRectangle = new RectF(8, 8, 8, 8);
        float[] innerRadii = new float[]{ 16, 16, 6, 6, 16, 16, 6, 6 };

        ShapeDrawable rndrect = new ShapeDrawable(new RoundRectShape(outerRadii, insetRectangle , innerRadii));
        rndrect.setIntrinsicHeight(300);
        rndrect.setIntrinsicWidth(500);
        rndrect.getPaint().setColor(Color.WHITE);

        ImageView iView = (ImageView)findViewById(R.id.ImageView1);
        iView.setImageDrawable(rndrect);*/

        /***********************************************************************************************************************************************/
        //programmatically draw and oval\circle
        /*ShapeDrawable oval = new ShapeDrawable(new OvalShape());
        //height and width need to be equal to get a circle
        oval.setIntrinsicWidth(100);
        oval.setIntrinsicHeight(100);
        oval.getPaint().setColor(Color.MAGENTA);

        ImageView iView = (ImageView) findViewById(R.id.ImageView1);
        iView.setImageDrawable(oval);*/

        /***********************************************************************************************************************************************/
        //programmatically drawing an arc
        /*ShapeDrawable arc = new ShapeDrawable(new ArcShape(0,340)); //pacman shape
        //height and width need to be equal to get a circle
        arc.setIntrinsicWidth(100);
        arc.setIntrinsicHeight(100);
        arc.getPaint().setColor(Color.CYAN);

        ImageView iView = (ImageView) findViewById(R.id.ImageView1);
        iView.setImageDrawable(arc);*/

        /***********************************************************************************************************************************************/
        //Programmatically draw a shape using pre-defined points stored as a path
        /*Path p = new Path(); //define a star shape
        p.moveTo(50, 0);
        p.lineTo(25,100);
        p.lineTo(100,50);
        p.lineTo(0,50);
        p.lineTo(75,100);
        p.lineTo(50,0);

        ShapeDrawable star = new ShapeDrawable(new PathShape(p, 100, 100));
        star.setIntrinsicHeight(100);
        star.setIntrinsicWidth(100);
        star.getPaint().setColor(Color.BLACK);

        star.getPaint().setStyle(Paint.Style.STROKE);
        ImageView iView = (ImageView)findViewById(R.id.ImageView1);
        iView.setImageDrawable(star);*/
    }

}
