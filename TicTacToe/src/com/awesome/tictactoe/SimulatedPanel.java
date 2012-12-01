package com.awesome.tictactoe;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class SimulatedPanel extends SurfaceView {
	SurfaceHolder mHolder;
	Thread mThread;
	Paint mPaint;
	Bitmap mBitmap;
	Canvas mCanvas;
	Rect src;
	Rect des;
	public SimulatedPanel(Context context) {
		super(context);
		mHolder = getHolder();
		mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.);
		src = new Rect(0, 0, 250, 250);
		des = new Rect(0, 0, 500, 500);
	}

}
