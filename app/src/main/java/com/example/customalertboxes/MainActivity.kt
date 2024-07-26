package com.example.customalertboxes

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // create a variable of type dialog
    lateinit var dialog : Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myButton = findViewById<Button>(R.id.btnClick)
        // var btnGood = findViewById<>()
        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialogue)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))


        // creating variables for the custom_dialog.xml design
        var btnGood = dialog.findViewById<Button>(R.id.btnGood)
        var btnFeedback = dialog.findViewById<Button>(R.id.btnFeedback)

        btnGood.setOnClickListener{
            dialog.dismiss()
            Toast.makeText(this,"Hope it gets better for you!",Toast.LENGTH_SHORT).show()

        }

        btnFeedback.setOnClickListener{
            dialog.dismiss()
            Toast.makeText(this,"That's great!",Toast.LENGTH_SHORT).show()

            // intents or Toast
        }

        myButton.setOnClickListener{
            dialog.show()
    }

        }
    }