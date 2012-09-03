//package com.carouseldemo.controls;
//
//import android.content.Context;
//import android.graphics.Canvas;
//import android.util.AttributeSet;
//import android.view.View;
//import android.view.animation.Transformation;
//
//import com.carouseldemo.controls.Carousel;
//
//public class TestCarousel extends Carousel
//{
//	
//	  
//		private int x, y, z, w;
//
//	    @Override
//	    protected void drawableStateChanged() {
//	        // TODO Auto-generated method stub
//	        super.drawableStateChanged();
//	    }
//
//	    public TestCarousel(Context context) {
//	        super(context);
//	    }
//
//	    public TestCarousel(Context context, AttributeSet attrs, int defStyle) {
//	        super(context, attrs, defStyle);
//	    }
//
//	    public TestCarousel(Context context, AttributeSet attrs) {
//	        super(context, attrs);
//	    }
//
//	    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
//	        super.onSizeChanged(h, w, oldh, oldw);
//	        this.x = w;
//	        this.y = h;
//	        this.z = oldw;
//	        this.w = oldh;
//	    }
//
//	    @Override
//	    protected synchronized void onMeasure(int widthMeasureSpec,
//	            int heightMeasureSpec) {
//	        super.onMeasure(heightMeasureSpec, widthMeasureSpec);
//	        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
//	    }
//
//	    protected void onDraw(Canvas c) {
//	        c.rotate(-90);
//	        c.translate(-getHeight(), 0);
//	        super.onDraw(c);
//	    }
//
//		@Override
//		protected boolean getChildStaticTransformation(View child,
//				Transformation transformation) 
//		{
//			return super.getChildStaticTransformation(child, transformation);
//		}
//
//
//}
