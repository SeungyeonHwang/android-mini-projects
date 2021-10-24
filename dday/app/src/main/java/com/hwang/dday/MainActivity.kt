package com.hwang.dday

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.util.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startBtn = findViewById<Button>(R.id.startBtn)
        val endBtn = findViewById<Button>(R.id.endBtn)

        var startDate = ""
        var endDate = ""

        val calender_start = Calendar.getInstance()
        val calender_end = Calendar.getInstance()

        startBtn.setOnClickListener {

            val today = GregorianCalendar()
            val year = today.get(Calendar.YEAR)
            val month = today.get(Calendar.MONTH)
            val day = today.get(Calendar.DATE)


            val dlg = DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener {
                override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {

                    startDate = year.toString() + (month + 1).toString() + dayOfMonth.toShort()
                    Log.d("startDate", startDate)

                    calender_start.set(year, month + 1, dayOfMonth)
                }

            }, year, month, day)
            dlg.show()
        }

        endBtn.setOnClickListener {

            val today = GregorianCalendar()
            val year = today.get(Calendar.YEAR)
            val month = today.get(Calendar.MONTH)
            val day = today.get(Calendar.DATE)


            val dlg = DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener {
                override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {

                    endDate = year.toString() + (month + 1).toString() + dayOfMonth.toShort()
                    Log.d("endDate", endDate)

                    calender_end.set(year, month + 1, dayOfMonth)

                    val finalDate =
                        TimeUnit.MILLISECONDS.toDays(calender_end.timeInMillis - calender_start.timeInMillis)

                    findViewById<TextView>(R.id.finalDate).text = finalDate.toString()
                }

            }, year, month, day)
            dlg.show()
        }
    }
}