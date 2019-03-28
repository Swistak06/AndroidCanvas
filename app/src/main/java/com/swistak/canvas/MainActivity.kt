package com.swistak.canvas

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var corx13 = 0.25f;
    var corx21 = 0.75f;
    var corx32 = 0.5f;

    var cory13 = 0.25f;
    var cory21 = 0.25f;
    var cory32 = 0.5f;

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout1 = findViewById(R.id.consLay) as android.support.constraint.ConstraintLayout
        val tr = TriangleCanvas(this)
        layout1.addView(tr)





        //val rec = TriangleCanvas(this)
//        val line1 = Line(this,0.25f,0.25f,0.75f,0.25f)
//        val line2 = Line(this,0.75f,0.25f,0.5f,0.5f)
//        val line3 = Line(this,0.5f,0.5f,0.25f,0.25f)
//
//
//        val point13 = Point(this,0.25f,0.25f)
//        val point21 = Point(this,0.75f,0.25f)
//        val point32 = Point(this,0.5f,0.5f)
//        layout1.addView(line1)
//        layout1.addView(line2)
//        layout1.addView(line3)
//        layout1.addView(point13)
//        layout1.addView(point21)
//        layout1.addView(point32)
//
//
//        point13.setOnTouchListener(){ view, motionEvent ->
//            point13.centerX = motionEvent.x/point13.right
//            point13.centerY = motionEvent.y/point13.bottom
//            line1.starX = motionEvent.x/line1.right
//            line1.starY  = motionEvent.y/line1.bottom
//            line3.stoX = motionEvent.x/line3.right
//            line3.stoY  = motionEvent.y/line3.bottom
//            point13.invalidate()
//            line1.invalidate()
//            line3.invalidate()
//            true
//        }
//
//        point21.setOnTouchListener(){ view, motionEvent ->
//            point21.centerX = motionEvent.x/point21.right
//            point21.centerY = motionEvent.y/point21.bottom
//            line2.starX = motionEvent.x/line2.right
//            line2.starY  = motionEvent.y/line2.bottom
//            line1.stoX = motionEvent.x/line1.right
//            line1.stoY  = motionEvent.y/line1.bottom
//            point21.invalidate()
//            line1.invalidate()
//            line2.invalidate()
//            true
//        }


        //imageView.invalidate()
        //val background = Canvass(this)
        //layout1.addView(background)
//        background.setOnTouchListener { view, motionEvent ->
//            corx = motionEvent.x
//            cory = motionEvent.y
//            background.invalidate()
//            true
//        }
    }


//    inner class Line(context: Context,var starX : Float, var starY : Float, var stoX : Float,var  stoY :Float) : View(context){
//
//        override fun onDraw(canvas: Canvas) {
//            val paint = Paint()
//            paint.setARGB(255, 255, 0, 0)
//            paint.strokeWidth = 4f
//            paint.style = Paint.Style.STROKE
//            canvas.drawLine(starX * right,starY * bottom,stoX * right,stoY * bottom,paint)
//            canvas.drawLine(0.65f * right,starY * bottom,0.95f * right,stoY * bottom,paint)
//
//        }
//    }
//
//    inner class Point(context: Context, var centerX : Float, var centerY : Float): View(context){
//
//        override fun onDraw(canvas: Canvas) {
//            val paint = Paint()
//            paint.setARGB(255, 255, 0, 0)
//            paint.strokeWidth = 4f
//            paint.style = Paint.Style.STROKE
//            canvas.drawCircle(centerX*right,centerY*bottom,10f,paint)
//        }
//    }

}
