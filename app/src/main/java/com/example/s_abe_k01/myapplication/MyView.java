package com.example.s_abe_k01.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by s_abe_k01 on 2015/11/12.
 */
public class MyView extends View {

    float X;
    float Y;
    float size;

    public MyView(Context context) {
        super(context);
        X = 100;
        Y = 100;
        size = 100;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.GREEN);

        Paint p = new Paint();
        p.setColor(Color.WHITE);
        canvas.drawCircle(X, Y, size, p);
        X += 1;
        Y += 1;
        invalidate();
    }
}
