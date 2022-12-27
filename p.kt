package com.testmypsy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class AggressionTest : AppCompatActivity() {
    fun getRes(radio:String):Int{
        var result = 0
        if(radio == "Extremely Unlikely"){
            result = 1
        }
        else if(radio == "Somewhat Unlikely"){
            result = 2
        }
        else if(radio == "Neutral"){
            result = 3
        }
        else if(radio == "Somewhat Likely"){
            result = 4
        }
        else if(radio == "Extremely Likely"){
            result = 5
        }
        return result
    }
    fun rev(res:Int):Int{
        if(res == 1){
            res = 5
        }
        else if(res == 2){
            res = 4
        }
        else if(res == 4){
            res = 2
        }
        else if(res == 5){
            res = 1
        }
        else{
            res = 3
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agression_test)
        val rg1 = findViewById<RadioGroup>(R.id.rg1)
        rg1.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg2 = findViewById<RadioGroup>(R.id.rg2)
        rg2.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg3 = findViewById<RadioGroup>(R.id.rg3)
        rg3.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg4 = findViewById<RadioGroup>(R.id.rg4)
        rg4.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg5 = findViewById<RadioGroup>(R.id.rg5)
        rg5.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg6 = findViewById<RadioGroup>(R.id.rg6)
        rg6.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg7 = findViewById<RadioGroup>(R.id.rg7)
        rg7.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg8 = findViewById<RadioGroup>(R.id.rg8)
        rg8.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg9 = findViewById<RadioGroup>(R.id.rg9)
        rg9.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg10 = findViewById<RadioGroup>(R.id.rg10)
        rg10.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg11 = findViewById<RadioGroup>(R.id.rg11)
        rg11.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg12 = findViewById<RadioGroup>(R.id.rg12)
        rg12.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg13 = findViewById<RadioGroup>(R.id.rg13)
        rg13.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg14 = findViewById<RadioGroup>(R.id.rg14)
        rg14.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg15 = findViewById<RadioGroup>(R.id.rg15)
        rg15.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg16 = findViewById<RadioGroup>(R.id.rg16)
        rg16.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg17 = findViewById<RadioGroup>(R.id.rg17)
        rg17.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg18 = findViewById<RadioGroup>(R.id.rg18)
        rg18.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg19 = findViewById<RadioGroup>(R.id.rg19)
        rg19.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg20 = findViewById<RadioGroup>(R.id.rg20)
        rg20.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg21 = findViewById<RadioGroup>(R.id.rg21)
        rg21.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg22 = findViewById<RadioGroup>(R.id.rg22)
        rg22.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg23 = findViewById<RadioGroup>(R.id.rg23)
        rg23.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg24 = findViewById<RadioGroup>(R.id.rg24)
        rg24.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg25 = findViewById<RadioGroup>(R.id.rg25)
        rg25.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg26 = findViewById<RadioGroup>(R.id.rg26)
        rg26.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg27 = findViewById<RadioGroup>(R.id.rg27)
        rg27.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg28 = findViewById<RadioGroup>(R.id.rg28)
        rg28.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg29 = findViewById<RadioGroup>(R.id.rg29)
        rg29.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val submitButton = findViewById<Button>(R.id.submitButton)
        submitButton.setOnClickListener{
            // Get the checked radio button id from radio group
            val rg1id: Int = rg1.checkedRadioButtonId
            var atq1res:Int
            if (rg1id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg1id)
                atq1res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq1res = $atq1res",
                    Toast.LENGTH_SHORT).show()
            }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg2id: Int = rg2.checkedRadioButtonId
            var atq2res:Int
            if (rg2id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg2id)
                atq2res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq1res = $atq2res",
                    Toast.LENGTH_SHORT).show()
            }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg3id: Int = rg3.checkedRadioButtonId
            var atq3res:Int
            if (rg3id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg3id)
                atq3res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq3res = $atq3res",
                    Toast.LENGTH_SHORT).show()
            }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg4id: Int = rg4.checkedRadioButtonId
            var atq4res:Int
            if (rg4id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg4id)
                atq4res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq4res = $atq4res",
                    Toast.LENGTH_SHORT).show()
            }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg5id: Int = rg5.checkedRadioButtonId
            var atq5res:Int
            if (rg5id!=-1){
                val radio:RadioButton = findViewById(rg5id)
                atq5res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq5res = $atq5res",
                    Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg6id: Int = rg6.checkedRadioButtonId
            var atq6res:Int
            if (rg6id!=-1){
                val radio:RadioButton = findViewById(rg6id)
                atq6res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq6res = $atq6res",
                    Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg7id: Int = rg7.checkedRadioButtonId
            var atq7res:Int
            if (rg7id!=-1){
                val radio:RadioButton = findViewById(rg7id)
                atq7res = getRes(radio.text.toString())
                atq7res = rev(atq7res)
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq7res = $atq7res",
                    Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg8id: Int = rg8.checkedRadioButtonId
            var atq8res:Int
            if (rg8id!=-1){
                val radio:RadioButton = findViewById(rg8id)
                atq8res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq8res = $atq8res",
                    Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg9id: Int = rg9.checkedRadioButtonId
            var atq9res:Int
            if (rg9id!=-1){
                val radio:RadioButton = findViewById(rg9id)
                atq9res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq9res = $atq9res",
                    Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg10id: Int = rg10.checkedRadioButtonId
            var atq10res:Int
            if (rg10id!=-1){
                val radio:RadioButton = findViewById(rg10id)
                atq10res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq10res = $atq10res",
                    Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg11id: Int = rg11.checkedRadioButtonId
            var atq11res:Int
            if (rg11id!=-1){
                val radio:RadioButton = findViewById(rg11id)
                atq11res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq11res = $atq11res",
                    Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg12id: Int = rg12.checkedRadioButtonId
            var atq12res:Int
            if (rg12id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg12id)
                atq12res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq12res = $atq12res",
                    Toast.LENGTH_SHORT).show()
            }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg13id: Int = rg13.checkedRadioButtonId
            var atq13res:Int
            if (rg13id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg13id)
                atq13res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq13res = $atq13res",
                    Toast.LENGTH_SHORT).show()
            }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg14id: Int = rg14.checkedRadioButtonId
            var atq14res:Int
            if (rg14id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg14id)
                atq14res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq14res = $atq14res",
                    Toast.LENGTH_SHORT).show()
            }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg15id: Int = rg15.checkedRadioButtonId
            var atq15res:Int
            if (rg15id!=-1){
                val radio:RadioButton = findViewById(rg15id)
                atq15res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq15res = $atq15res",
                    Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg16id: Int = rg16.checkedRadioButtonId
            var atq16res:Int
            if (rg16id!=-1){
                val radio:RadioButton = findViewById(rg16id)
                atq16res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq16res = $atq16res",
                    Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg17id: Int = rg17.checkedRadioButtonId
            var atq17res:Int
            if (rg17id!=-1){
                val radio:RadioButton = findViewById(rg17id)
                atq17res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq17res = $atq17res",
                    Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg18id: Int = rg18.checkedRadioButtonId
            var atq18res:Int
            if (rg18id!=-1){
                val radio:RadioButton = findViewById(rg18id)
                atq18res = getRes(radio.text.toString())
                atq18res = rev(atq18res)
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq18res = $atq18res",
                    Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg19id: Int = rg19.checkedRadioButtonId
            var atq19res:Int
            if (rg19id!=-1){
                val radio:RadioButton = findViewById(rg19id)
                atq19res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq19res = $atq19res",
                    Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg20id: Int = rg20.checkedRadioButtonId
            var atq20res:Int
            if (rg20id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg20id)
                atq20res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq20res = $atq20res",
                    Toast.LENGTH_SHORT).show()
            }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg21id: Int = rg21.checkedRadioButtonId
            var atq21res:Int
            if (rg21id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg21id)
                atq21res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq21res = $atq21res",
                    Toast.LENGTH_SHORT).show()
            }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg22id: Int = rg22.checkedRadioButtonId
            var atq22res:Int
            if (rg22id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg22id)
                atq22res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq22res = $atq22res",
                    Toast.LENGTH_SHORT).show()
            }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg23id: Int = rg23.checkedRadioButtonId
            var atq23res:Int
            if (rg23id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg23id)
                atq23res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq23res = $atq23res",
                    Toast.LENGTH_SHORT).show()
            }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg24id: Int = rg24.checkedRadioButtonId
            var atq24res:Int
            if (rg24id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg24id)
                atq24res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq24res = $atq24res",
                    Toast.LENGTH_SHORT).show()
            }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg25id: Int = rg25.checkedRadioButtonId
            var atq25res:Int
            if (rg25id!=-1){
                val radio:RadioButton = findViewById(rg25id)
                atq25res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq25res = $atq25res",
                    Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg26id: Int = rg26.checkedRadioButtonId
            var atq26res:Int
            if (rg26id!=-1){
                val radio:RadioButton = findViewById(rg26id)
                atq26res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq26res = $atq26res",
                    Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg27id: Int = rg27.checkedRadioButtonId
            var atq27res:Int
            if (rg27id!=-1){
                val radio:RadioButton = findViewById(rg27id)
                atq27res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq27res = $atq27res",
                    Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg28id: Int = rg28.checkedRadioButtonId
            var atq28res:Int
            if (rg28id!=-1){
                val radio:RadioButton = findViewById(rg28id)
                atq28res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq28res = $atq28res",
                    Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            val rg29id: Int = rg29.checkedRadioButtonId
            var atq29res:Int
            if (rg29id!=-1){
                val radio:RadioButton = findViewById(rg29id)
                atq29res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq29res = $atq29res",
                    Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            if(rg1id==-1 || rg2id==-1 || rg3id==-1 || rg4id==-1 || rg5id==-1 || rg6id==-1 || rg7id==-1 || rg8id==-1 || rg9id==-1 || rg10id==-1 || rg11id==-1 || rg12id==-1 || rg13id==-1 || rg14id==-1 || rg15id==-1 || rg16id==-1 || rg17id==-1 || rg18id==-1 || rg19id==-1 || rg20id==-1 || rg21id==-1 || rg22id==-1 || rg23id==-1 || rg24id==-1 || rg25id==-1 || rg26id==-1 || rg27id==-1 || rg28id==-1 || rg29id==-1){
                return@setOnClickListener
            }else{
                val intent = Intent(this,ATResult::class.java)
                startActivity(intent)
            }
            var pas = 0
            pas = atq8res + atq23res + atq25res + atq11res + atq27res + atq10res + atq24res + atq17res

        }

//        submitButton.setOnClickListener {
//            val intent = Intent(this,ATResult::class.java)
//            startActivity(intent)
//        }
    }
}