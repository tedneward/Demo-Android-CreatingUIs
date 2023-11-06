package edu.uw.ischool.newart.uisfromresources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main)

        // setContentView() is the default way to do this,
        // as it inflates the layout then sets the resulting
        // ViewGroup as the top-level View for the Activity.
        // We can accomplish the same thing by doing that
        // work by hand, which is what we'll do.
        val viewRoot = layoutInflater.inflate(R.layout.activity_main, null)
        setContentView(viewRoot)
    }
}
