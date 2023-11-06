package edu.uw.ischool.newart.uifromcode

import android.R
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.updateLayoutParams


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        // Simple Vertical LinearLayout
        //
        /*
        val viewRoot = LinearLayout(this)
        viewRoot.orientation = LinearLayout.VERTICAL
        viewRoot.layoutParams =
            ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT)
         */

        // More complex ConstraintLayout
        //
        val viewRoot = ConstraintLayout(this)
        viewRoot.layoutParams = ConstraintLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
        viewRoot.id = View.generateViewId()

        val textView = TextView(this)
        textView.id = View.generateViewId()
        textView.text = "Hello, Android!"
        textView.layoutParams =
            ConstraintLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)

        textView.updateLayoutParams<ConstraintLayout.LayoutParams> {
            bottomToBottom = viewRoot.id
            topToTop = viewRoot.id
            startToStart = viewRoot.id
            endToEnd = viewRoot.id
        }

        viewRoot.addView(textView)

        setContentView(viewRoot)
    }
}