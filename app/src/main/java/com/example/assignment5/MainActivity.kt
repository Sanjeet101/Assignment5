package com.example.assignment5

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var btndate:EditText
    private lateinit var dob : EditText
    private lateinit var btnresultdate : EditText
    private lateinit var btnresultdob : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btndate = findViewById(R.id.btndate)
        dob = findViewById(R.id.dob)
        btnresultdate=findViewById(R.id.btnresultdate)
        btnresultdob=findViewById(R.id.btnresultdob)

        btndate.setOnClickListener{
            loadCalender()
        }
        dob.setOnClickListener{
            loaddob()
        }

    }
    private fun loadCalender(){
        val c = Calendar.getInstance()
        val year1 = c.get(Calendar.YEAR)
        val month1 = c. get(Calendar.MONTH)
        val day1 = c.get(Calendar.DATE)

        val datePickerDialog=DatePickerDialog(
                this, DatePickerDialog.OnDateSetListener { view, year, month, day ->
            btndate.setText("$year:$month:$day")
            btnresultdate.setText("${year1-year}-${month1-(month+1)}")

        },
                year1,
                month1,
                day1

        )
        datePickerDialog.show()
    }
    private fun loaddob(){
        val c = Calendar.getInstance()
        val year1 = c.get(Calendar.YEAR)
        val month1 = c. get(Calendar.MONTH)
        val day1 = c.get(Calendar.DATE)

        val datePickerDialog=DatePickerDialog(
                this, DatePickerDialog.OnDateSetListener { view, year, month, day ->
            dob.setText("$year:$month:$day")
            btnresultdob.setText("${year1-year}-${month1-(month+1)}")

        },
                year1,
                month1,
                day1

        )
        datePickerDialog.show()
    }

}