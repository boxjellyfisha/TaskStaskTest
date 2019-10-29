package com.ddrift.taskstasktest

import android.content.Intent
import android.content.Intent.*
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sub.*

class ChildActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
        description.text = this.toString()
        new_sub.setOnClickListener {
            startActivity(Intent(this, SubActivity::class.java))
        }

        clear_sub.setOnClickListener {
            startActivity(
                Intent(this.applicationContext, SubActivity::class.java).apply {
                    setFlags(FLAG_ACTIVITY_CLEAR_TOP)
                })
        }

        clear_child.setOnClickListener {
            startActivity(
                Intent(this.applicationContext, ChildActivity::class.java).apply {
                    setFlags(FLAG_ACTIVITY_CLEAR_TOP)
                })
        }

        clear_main.setOnClickListener {
            startActivity(
                Intent(this.applicationContext, MainActivity::class.java).apply {
                    setFlags(FLAG_ACTIVITY_CLEAR_TOP)
                })
        }
    }
}
