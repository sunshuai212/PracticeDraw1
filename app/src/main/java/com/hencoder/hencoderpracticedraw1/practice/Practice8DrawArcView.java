package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        canvas.drawArc(new RectF(350,200,750,450),-110,80,true,new Paint());

        canvas.drawArc(new RectF(350,200,750,450),20,150,false,new Paint());

        Paint paint=new Paint();
        paint.setStyle(Paint.Style.STROKE);

        canvas.drawArc(new RectF(350,200,750,450),-180,60,false,paint);

    }
}
