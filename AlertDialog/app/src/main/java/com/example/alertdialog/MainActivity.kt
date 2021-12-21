package com.example.alertdialog

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import android.content.DialogInterface
import android.graphics.Color
import android.os.Build
import android.content.Context



class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setMessage("Do you want to add Mayank in your Contact List")
            .setIcon(R.drawable.ic_add_contact_foreground)
            .setPositiveButton("Yes"){ _, _->
                Toast.makeText(this,"You added Mayank in your contact list",Toast.LENGTH_LONG).show()
                }
            .setNegativeButton("No"){ _, _->
                Toast.makeText(this,"You  don't added Mayank in your contact list",Toast.LENGTH_LONG).show()
            }.create()

        val btnDialog1 = findViewById<Button>(R.id.btnDialog1)
        btnDialog1.setOnClickListener {
            addContactDialog.show()
        }

        val showAlertDialogBtn = findViewById<Button>(R.id.btnDialog2)
        showAlertDialogBtn.setOnClickListener {
            val listItems = arrayOf("Item 1", "Item 2", "Item 3")
            val mBuilder = AlertDialog.Builder(this@MainActivity)
            mBuilder.setTitle("Choose an item")
            mBuilder.setSingleChoiceItems(listItems, -1) { dialogInterface, i ->

                dialogInterface.dismiss()
                Toast.makeText(this,"You added item $i",Toast.LENGTH_LONG).show()

            }
            // Set the neutral/cancel button click listener
            mBuilder.setNeutralButton("Cancel") { dialog, which ->
                // Do something when click the neutral button
                dialog.cancel()
            }

            val mDialog = mBuilder.create()
            mDialog.show()
        }
        val options = arrayOf("First item","Second item","Third item")
        val multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose multiple from the options")
            .setMultiChoiceItems(options, booleanArrayOf(false,false,false)){_,i, isChecked ->
                if(isChecked){
                    Toast.makeText(this,"you checked ${options[i]}",Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this,"you unchecked ${options[i]}",Toast.LENGTH_SHORT).show()

                }

            }
            .setPositiveButton("Accept") {_, _ ->
                Toast.makeText(this,"you accepted the MultiChoiceDialog",Toast.LENGTH_SHORT).show()
            }

            .setPositiveButton("Decline") {_, _ ->
                Toast.makeText(this,"you Declined the MultiChoiceDialog",Toast.LENGTH_SHORT).show()
            }.create()

        val btnDialog3 = findViewById<Button>(R.id.btnDialog3)
        btnDialog3.setOnClickListener {
            multiChoiceDialog.show()
        }


    }



}

