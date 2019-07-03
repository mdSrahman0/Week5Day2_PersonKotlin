/**
 * Create an activity with an edittext for each item listed below.
 * On a button click, have the values from the edit text save to an Person Object.
 * populate text views for each of the items below from the person object. (You have to make the person class)
First Name
Last Name
Street Address
City
State
Zip
 */

package com.example.week5day2_personkotlin

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view : View) {
        var fName = etFName.text.toString()
        var lName = etLName.text.toString()
        var address = etStAddr.text.toString()
        var city = etCity.text.toString()
        var state = etState.text.toString()
        var zip = etZip.text.toString()

        var person = Person(fName, lName, address, city, state, zip)
        //Typeface.createFromAsset(assets, "fonts/lulu_clean_bold.otf")

        // a new typeface var to hold our custom font from the assets folder
        val typeface : Typeface = Typeface.createFromAsset(assets, "bank_gothic_bold.ttf")

        tvFName.text = person.firstName
        tvFName.typeface = typeface

        tvLName.text = person.lastName
        tvLName.typeface = typeface

        tvAddress.text = person.address
        tvAddress.typeface = typeface

        tvCity.text = person.city
        tvCity.typeface = typeface

        tvState.text = person.state
        tvState.typeface = typeface

        tvZip.text = person.zip
        tvZip.typeface = typeface
    }
}
