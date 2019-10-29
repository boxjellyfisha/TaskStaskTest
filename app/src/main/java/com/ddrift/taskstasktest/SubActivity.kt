package com.ddrift.taskstasktest

import android.content.Intent
import android.content.Intent.*
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
        description.text = this.toString()
        new_sub.setOnClickListener {
            startActivity(Intent(this, SubActivity::class.java))
        }

        /* M->S->S1 => M->S->S2 */
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

        /* M->S->S1 => M2 */
        clear_main.setOnClickListener {
            startActivity(
                Intent(this.applicationContext, MainActivity::class.java).apply {
                    setFlags(FLAG_ACTIVITY_CLEAR_TOP)
                })
        }
    }
}
