package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint mPaint;
    private Path mPath;

    public Practice10HistogramView(Context context) {
        this(context, null);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        mPath.moveTo(100, 150);
        mPath.lineTo(100, 700);
        mPath.lineTo(1000, 700);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(2);
        mPaint.setColor(Color.WHITE);
        canvas.drawPath(mPath, mPaint);

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setTextSize(30);
        mPaint.setAntiAlias(true);
        //画字
        canvas.drawText("Froyo", 140, 730, mPaint);
        canvas.drawText("GB", 260, 730, mPaint);
        canvas.drawText("ICS", 380, 730, mPaint);
        canvas.drawText("JB", 500, 730, mPaint);
        canvas.drawText("KITKAT", 600, 730, mPaint);
        canvas.drawText("L", 755, 730, mPaint);
        canvas.drawText("M", 875, 730, mPaint);

        //画矩形
        mPaint.setColor(Color.GREEN);
        canvas.drawRect(120, 690, 220, 700, mPaint);
        canvas.drawRect(240, 650, 340, 700, mPaint);
        canvas.drawRect(360, 650, 460, 700, mPaint);
        canvas.drawRect(480, 450, 580, 700, mPaint);
        canvas.drawRect(600, 250, 700, 700, mPaint);
        canvas.drawRect(720, 200, 820, 700, mPaint);
        canvas.drawRect(840, 500, 940, 700, mPaint);
    }



}
