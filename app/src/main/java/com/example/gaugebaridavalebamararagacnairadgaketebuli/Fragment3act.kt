package com.example.gaugebaridavalebamararagacnairadgaketebuli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Fragment3act : AppCompatActivity() {

    private lateinit var noteEditText: EditText
    private lateinit var addNoteButton: EditText
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment3act)



        noteEditText = findViewById(R.id.editTextNote)
        addNoteButton = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        val SharedPreferences = getSharedPreferences("MY_NOTES_PREF", MODE_PRIVATE)
        val text = SharedPreferences.getString("Note","")
        textView.text = text

        addNoteButton.setOnClickListener {

            val note = noteEditText.text.toString()
            val text = textView.text.toString()
            val result = note + "\n" + text
            textView.text = result

            SharedPreferences.edit()
                .putString("NOTE", result)
                .apply()

        }

    }
}