package com.example.problemsolver.msgsharingapp.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.problemsolver.msgsharingapp.Constants
import com.example.problemsolver.msgsharingapp.R
import com.example.problemsolver.msgsharingapp.showToast
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : AppCompatActivity(){

    companion object {
        val TAG: String = SecondActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)


        //Safe Call ?.
        //Safe Call with let ?.let{ }

        val bundle: Bundle? = intent.extras

        bundle?.let{
            val msg = bundle.getString(Constants.USR_MSG_KEY)
            showToast(msg)
            txvUserMessage.text = msg
        }
    }
}
