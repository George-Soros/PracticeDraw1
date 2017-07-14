package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint mPaint;
    private Path mPath;

    public Practice11PieChartView(Context context) {
        this(context, null);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initData();
    }

    private void initData(){
        mPaint = new Paint();
        mPath = new Path();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        //扇形是逆时针绘制的
        mPaint.setColor(Color.parseColor("#F44336"));
        canvas.drawArc(150, 50, 750, 650, -180, 135, true, mPaint);

        mPaint.setColor(Color.parseColor("#2196F3"));
        canvas.drawArc(170, 110, 760, 680, 75, 105,true,mPaint);

        mPaint.setColor(Color.parseColor("#009688"));
        canvas.drawArc(175, 110, 765, 680, 20, 53,true,mPaint);

        mPaint.setColor(Color.parseColor("#9E9E9E"));
        canvas.drawArc(175, 110, 765, 680, 10, 8,true,mPaint);

        mPaint.setColor(Color.parseColor("#9C27B0"));
        canvas.drawArc(178, 108, 768, 678, 2, 8,true,mPaint);

        mPaint.setColor(Color.parseColor("#FFC107"));
        canvas.drawArc(170, 100, 770, 670, -45, 45,true,mPaint);

        //画线
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.parseColor("#C0C0C1"));
        mPaint.setStrokeWidth(4);
        mPath.moveTo(100, 100);
        mPath.lineTo(240, 100);
        mPath.lineTo(260, 120);
        canvas.drawPath(mPath, mPaint);
        //画字
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(26);
        mPaint.setAntiAlias(true);
        canvas.drawText("Lollipop", 0, 100, mPaint);
    }




}
