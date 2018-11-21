package com.example.problemsolver.msgsharingapp.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.problemsolver.msgsharingapp.Constants
import kotlinx.android.synthetic.main.activity_main.*
import com.example.problemsolver.msgsharingapp.R
import com.example.problemsolver.msgsharingapp.showToast

class MainActivity : AppCompatActivity(){

    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {

            Log.d(TAG, "Button Show Toast Clicked!")
            showToast("Button Clicked!")
        }

        btnSendData.setOnClickListener {

            Log.d("Send Activity", "Button Send Data Clicked!")

            val message = etName.text.toString()
//            Toast.makeText(this, message, Toast.LENGTH_SHORT).show() #MENGGUNAKAN EXPLICIT INTENT

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra(Constants.USR_MSG_KEY, message)

            startActivity(intent)
        }

        btnShareToOtherApps.setOnClickListener {

            val message = etName.text.toString()
            val intent = Intent()

            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "plain/text"

            startActivity(Intent.createChooser(intent, "Share to :"))

        }

        btnListView.setOnClickListener {

            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)

        }
    }
}
