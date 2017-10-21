package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        canvas.drawColor(Color.parseColor("#375C68"));

        Paint paint1 = new Paint();
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setColor(Color.WHITE);
        paint1.setStrokeWidth(3);
        paint1.setTextSize(25);
        Paint paint2 = new Paint();
        paint2.setColor(Color.parseColor("#44B400"));
        Paint paint3 = new Paint();
        paint3.setColor(Color.parseColor("#375C68"));
        Paint paint4 = new Paint();
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setColor(Color.WHITE);
        paint4.setStrokeWidth(1);
        paint4.setAntiAlias(true);
        paint4.setTextSize(35);
        Path path=new Path();

        path.moveTo(100,20);
        path.lineTo(100,600);
        path.lineTo(900,600);
        canvas.drawPath(path,paint1);

        canvas.drawText("floyo",130,630,paint4);
        canvas.drawText("floyo",230,630,paint4);
        canvas.drawText("floyo",330,630,paint4);
        canvas.drawText("floyo",430,630,paint4);
        canvas.drawText("floyo",530,630,paint4);
        canvas.drawText("floyo",630,630,paint4);

        canvas.drawRect(new RectF(120,100,210,600),paint2);
        canvas.drawRect(new RectF(220,300,310,600),paint2);
        canvas.drawRect(new RectF(320,500,410,600),paint2);
        canvas.drawRect(new RectF(420,500,510,600),paint2);
        canvas.drawRect(new RectF(520,400,610,600),paint2);
        canvas.drawRect(new RectF(620,600,710,600),paint2);
        canvas.drawRect(new RectF(720,580,810,600),paint2);
    }
}
