package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        Paint paint1 = new Paint();
        paint1.setAntiAlias(true);
        paint1.setColor(Color.RED);
        Paint paint2 = new Paint();
        paint1.setAntiAlias(true);
        paint1.setColor(Color.RED);
        Paint paint3 = new Paint();
        paint1.setAntiAlias(true);
        paint1.setColor(Color.RED);

        canvas.drawArc(new RectF(100, 20, 600, 520), -180, 120, true, paint1);
        paint1.setColor(Color.YELLOW);
        canvas.drawArc(new RectF(120, 40, 620, 540), -60, 60, true, paint1);
        paint1.setColor(Color.GREEN);
        canvas.drawArc(new RectF(120, 40, 620, 540), 3, 50, true, paint1);
        paint1.setColor(Color.BLUE);
        canvas.drawArc(new RectF(120, 40, 620, 540), 56, 20, true, paint1);
        paint1.setColor(Color.DKGRAY);
        canvas.drawArc(new RectF(120, 40, 620, 540), 110, 60, true, paint1);


        //        canvas.drawArc(new RectF(100, 20, 600, 520), -180, 120, true, paint1);
//        canvas.drawArc(new RectF(100, 20, 600, 520), -180, 120, true, paint1);


    }
}
