package com.ddrift.taskstasktest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**
 * launch mode: https://medium.com/wiselteach/activity-back-stack-and-launch-mode-part-2-e715c724f7cf
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        description.text = this.toString()
        btn_sub.setOnClickListener {
            startActivity(Intent(this, SubActivity::class.java))
        }
    }
}
