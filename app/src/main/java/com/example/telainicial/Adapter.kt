package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.telainicial.R

class MeetingAdapter(context: Context, meetings: List<Meeting>) :
    ArrayAdapter<Meeting>(context, 0, meetings) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.meeting_list_item, parent, false)
        }

        val meeting = getItem(position)

        val meetingNameTextView: TextView = itemView!!.findViewById(R.id.meetingNameTextView)
        val meetingDateTextView: TextView = itemView.findViewById(R.id.meetingDateTextView)
        val meetingTimeTextView: TextView = itemView.findViewById(R.id.meetingTimeTextView)

        meetingNameTextView.text = meeting?.nome
        meetingDateTextView.text = meeting?.data
        meetingTimeTextView.text = meeting?.hora

        return itemView
    }
}