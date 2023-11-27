package com.example.telainicial

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.telainicial.Meeting
import com.example.telainicial.MeetingAdapter
import com.example.telainicial.Fragment.NavBar

class Reuniao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reuniao_main)

        if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.menu_container, NavBar())
                .commit()

        }

        val meetings = listOf(
            Meeting("Reunião 1", "10/11/2023", "14:00"),
            Meeting("Reunião 2", "12/11/2023", "15:30"),
            Meeting("Reunião 3", "15/11/2023", "10:00")
        )

        val listView: ListView = findViewById(R.id.listView)
        val adapter = MeetingAdapter(this, meetings)
        listView.adapter = adapter
    }
}