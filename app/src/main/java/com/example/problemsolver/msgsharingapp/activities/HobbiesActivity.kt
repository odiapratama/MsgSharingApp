package com.example.problemsolver.msgsharingapp.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.example.problemsolver.msgsharingapp.adapters.HobbiesAdapter
import com.example.problemsolver.msgsharingapp.R
import com.example.problemsolver.msgsharingapp.models.supplier
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity : AppCompatActivity() {

    companion object {
        val TAG: String = HobbiesActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        setUpRecylerView()

    }

    private fun setUpRecylerView() {

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayout.VERTICAL
        recylerView.layoutManager = layoutManager

        val adapter = HobbiesAdapter(this, supplier.hobbies)
        recylerView.adapter = adapter
    }
}
