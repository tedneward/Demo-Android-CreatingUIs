package edu.uw.ischool.newart.snackbar

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.qualifiedName

    lateinit var btnGo : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contentRoot : ConstraintLayout = findViewById(R.id.mainRoot)

        btnGo = findViewById(R.id.btnGo)
        btnGo.setOnClickListener {
            val snackbar = Snackbar.make(this, contentRoot, "Snackbar With Action",Snackbar.LENGTH_SHORT).apply {
                setAction("UNDO") {
                    // Undo the action, whatever that means
                    Log.i(TAG, "Undoing the last operation")
                }
            }
            snackbar.show()
        }
    }
}