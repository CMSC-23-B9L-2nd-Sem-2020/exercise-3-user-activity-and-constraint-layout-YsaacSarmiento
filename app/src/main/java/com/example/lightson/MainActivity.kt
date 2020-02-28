package com.example.lightson

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var matrix: Array<Array<Int>> = arrayOf(
        arrayOf(1,1,1,1,1),
        arrayOf(1,1,1,1,1),
        arrayOf(1,1,1,1,1),
        arrayOf(1,1,1,1,1),
        arrayOf(1,1,1,1,1)
    )
    var count = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickname(it)
        }
        findViewById<TextView>(R.id.viewName).setOnClickListener{
            updateNickname(it)
        }
        findViewById<Button>(R.id.button2).setOnClickListener{
            retry(it)
        }
        setListeners()

    }
    private fun addNickname(view: View) {
        val editText = findViewById<EditText>(R.id.editName)
        val nicknameTextView = findViewById<TextView>(R.id.viewName)
        val done = findViewById<Button>(R.id.done_button)
        nicknameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE
        done.visibility = View.GONE
    }
    private fun updateNickname(view: View) {
        val editText = findViewById<EditText>(R.id.editName)
        val nicknameTextView = findViewById<TextView>(R.id.viewName)
        val done = findViewById<Button>(R.id.done_button)

        editText.visibility = View.VISIBLE
        view.visibility = View.VISIBLE
        nicknameTextView.visibility = View.GONE
        done.visibility = View.VISIBLE
    }
    private fun retry(view: View){
        var counter = findViewById<TextView>(R.id.counting)
        val a1 = findViewById<TextView>(R.id.a1)
        val a2 = findViewById<TextView>(R.id.a2)
        val a3 = findViewById<TextView>(R.id.a3)
        val a4 = findViewById<TextView>(R.id.a4)
        val a5 = findViewById<TextView>(R.id.a5)
        val b1 = findViewById<TextView>(R.id.b1)
        val b2 = findViewById<TextView>(R.id.b2)
        val b3 = findViewById<TextView>(R.id.b3)
        val b4 = findViewById<TextView>(R.id.b4)
        val b5 = findViewById<TextView>(R.id.b5)
        val c1 = findViewById<TextView>(R.id.c1)
        val c2 = findViewById<TextView>(R.id.c2)
        val c3 = findViewById<TextView>(R.id.c3)
        val c4 = findViewById<TextView>(R.id.c4)
        val c5 = findViewById<TextView>(R.id.c5)
        val d1 = findViewById<TextView>(R.id.d1)
        val d2 = findViewById<TextView>(R.id.d2)
        val d3 = findViewById<TextView>(R.id.d3)
        val d4 = findViewById<TextView>(R.id.d4)
        val d5 = findViewById<TextView>(R.id.d5)
        val e1 = findViewById<TextView>(R.id.e1)
        val e2 = findViewById<TextView>(R.id.e2)
        val e3 = findViewById<TextView>(R.id.e3)
        val e4 = findViewById<TextView>(R.id.e4)
        val e5 = findViewById<TextView>(R.id.e5)
        val clickableView: List<List<View>> = listOf(
            listOf(a1,a2,a3,a4,a5),
            listOf(b1,b2,b3,b4,b5),
            listOf(c1,c2,c3,c4,c5),
            listOf(d1,d2,d3,d4,d5),
            listOf(e1,e2,e3,e4,e5)
        )

        for(item in clickableView) {
            for (k in item) {
                k.visibility = View.VISIBLE
                findViewById<TextView>(R.id.game_over).visibility = View.GONE
            }
        }
        counter.text = "0"
        a1.setBackgroundColor(Color.YELLOW)
        a2.setBackgroundColor(Color.YELLOW)
        a3.setBackgroundColor(Color.YELLOW)
        a4.setBackgroundColor(Color.YELLOW)
        a5.setBackgroundColor(Color.YELLOW)
        b1.setBackgroundColor(Color.YELLOW)
        b2.setBackgroundColor(Color.YELLOW)
        b3.setBackgroundColor(Color.YELLOW)
        b4.setBackgroundColor(Color.YELLOW)
        b5.setBackgroundColor(Color.YELLOW)
        c1.setBackgroundColor(Color.YELLOW)
        c2.setBackgroundColor(Color.YELLOW)
        c3.setBackgroundColor(Color.YELLOW)
        c4.setBackgroundColor(Color.YELLOW)
        c5.setBackgroundColor(Color.YELLOW)
        d1.setBackgroundColor(Color.YELLOW)
        d2.setBackgroundColor(Color.YELLOW)
        d3.setBackgroundColor(Color.YELLOW)
        d4.setBackgroundColor(Color.YELLOW)
        d5.setBackgroundColor(Color.YELLOW)
        e1.setBackgroundColor(Color.YELLOW)
        e2.setBackgroundColor(Color.YELLOW)
        e3.setBackgroundColor(Color.YELLOW)
        e4.setBackgroundColor(Color.YELLOW)
        e5.setBackgroundColor(Color.YELLOW)

        for(item in matrix){
            item.set(0,1)
            item.set(1,1)
            item.set(2,1)
            item.set(3,1)
            item.set(4,1)
        }

    }

    private fun setListeners() {
        val a1 = findViewById<TextView>(R.id.a1)
        val a2 = findViewById<TextView>(R.id.a2)
        val a3 = findViewById<TextView>(R.id.a3)
        val a4 = findViewById<TextView>(R.id.a4)
        val a5 = findViewById<TextView>(R.id.a5)
        val b1 = findViewById<TextView>(R.id.b1)
        val b2 = findViewById<TextView>(R.id.b2)
        val b3 = findViewById<TextView>(R.id.b3)
        val b4 = findViewById<TextView>(R.id.b4)
        val b5 = findViewById<TextView>(R.id.b5)
        val c1 = findViewById<TextView>(R.id.c1)
        val c2 = findViewById<TextView>(R.id.c2)
        val c3 = findViewById<TextView>(R.id.c3)
        val c4 = findViewById<TextView>(R.id.c4)
        val c5 = findViewById<TextView>(R.id.c5)
        val d1 = findViewById<TextView>(R.id.d1)
        val d2 = findViewById<TextView>(R.id.d2)
        val d3 = findViewById<TextView>(R.id.d3)
        val d4 = findViewById<TextView>(R.id.d4)
        val d5 = findViewById<TextView>(R.id.d5)
        val e1 = findViewById<TextView>(R.id.e1)
        val e2 = findViewById<TextView>(R.id.e2)
        val e3 = findViewById<TextView>(R.id.e3)
        val e4 = findViewById<TextView>(R.id.e4)
        val e5 = findViewById<TextView>(R.id.e5)
        val clickableView: List<List<View>> = listOf(
            listOf(a1,a2,a3,a4,a5),
            listOf(b1,b2,b3,b4,b5),
            listOf(c1,c2,c3,c4,c5),
            listOf(d1,d2,d3,d4,d5),
            listOf(e1,e2,e3,e4,e5)
        )
        for(item in clickableView){
            for(j in item){
                j.setOnClickListener{lightsOut(it)}
            }
        }
    }
    private fun lightsOut(view: View){
        var isBreak = false
        var isGameOver = true
        var counter = findViewById<TextView>(R.id.counting)
        var i = 0
        var j = 0
        val a1 = findViewById<TextView>(R.id.a1)
        val a2 = findViewById<TextView>(R.id.a2)
        val a3 = findViewById<TextView>(R.id.a3)
        val a4 = findViewById<TextView>(R.id.a4)
        val a5 = findViewById<TextView>(R.id.a5)
        val b1 = findViewById<TextView>(R.id.b1)
        val b2 = findViewById<TextView>(R.id.b2)
        val b3 = findViewById<TextView>(R.id.b3)
        val b4 = findViewById<TextView>(R.id.b4)
        val b5 = findViewById<TextView>(R.id.b5)
        val c1 = findViewById<TextView>(R.id.c1)
        val c2 = findViewById<TextView>(R.id.c2)
        val c3 = findViewById<TextView>(R.id.c3)
        val c4 = findViewById<TextView>(R.id.c4)
        val c5 = findViewById<TextView>(R.id.c5)
        val d1 = findViewById<TextView>(R.id.d1)
        val d2 = findViewById<TextView>(R.id.d2)
        val d3 = findViewById<TextView>(R.id.d3)
        val d4 = findViewById<TextView>(R.id.d4)
        val d5 = findViewById<TextView>(R.id.d5)
        val e1 = findViewById<TextView>(R.id.e1)
        val e2 = findViewById<TextView>(R.id.e2)
        val e3 = findViewById<TextView>(R.id.e3)
        val e4 = findViewById<TextView>(R.id.e4)
        val e5 = findViewById<TextView>(R.id.e5)
        val clickableView: List<List<View>> = listOf(
            listOf(a1,a2,a3,a4,a5),
            listOf(b1,b2,b3,b4,b5),
            listOf(c1,c2,c3,c4,c5),
            listOf(d1,d2,d3,d4,d5),
            listOf(e1,e2,e3,e4,e5)
        )
        for(item in clickableView){
            j=0
            for(k in item){
                if(k.equals(view)){
                    isBreak = true
                    break
                }
                j+=1
            }
            if(isBreak == true){
                break
            }
            i+=1

        }

        if(matrix.get(i).get(j) == 1) {
            view.setBackgroundColor(Color.DKGRAY)
            matrix.get(i).set(j, 0)
        }
        else{
            view.setBackgroundColor(Color.YELLOW)
            matrix.get(i).set(j, 1)
        }
        try {
            if(matrix.get(i+1).get(j) == 1) {
                clickableView.get(i+1).get(j).setBackgroundColor(Color.DKGRAY)
                matrix.get(i+1).set(j, 0)
            }
            else{
                clickableView.get(i+1).get(j).setBackgroundColor(Color.YELLOW)
                matrix.get(i+1).set(j, 1)
            }
        } catch (e: Exception) {
        }
        try {
            if(matrix.get(i-1).get(j) == 1) {
                clickableView.get(i-1).get(j).setBackgroundColor(Color.DKGRAY)
                matrix.get(i-1).set(j, 0)
            }
            else{
                clickableView.get(i-1).get(j).setBackgroundColor(Color.YELLOW)
                matrix.get(i-1).set(j, 1)
            }
        } catch (e: Exception) {
        }
        try {
            if(matrix.get(i).get(j+1) == 1) {
                clickableView.get(i).get(j+1).setBackgroundColor(Color.DKGRAY)
                matrix.get(i).set(j+1, 0)
            }
            else{
                clickableView.get(i).get(j+1).setBackgroundColor(Color.YELLOW)
                matrix.get(i).set(j+1, 1)
            }
        } catch (e: Exception) {
        }
        try {
            if(matrix.get(i).get(j-1) == 1) {
                clickableView.get(i).get(j-1).setBackgroundColor(Color.DKGRAY)
                matrix.get(i).set(j-1, 0)
            }
            else{
                clickableView.get(i).get(j-1).setBackgroundColor(Color.YELLOW)
                matrix.get(i).set(j-1, 1)
            }
        } catch (e: Exception) {
        }
        count+=1
        counter.text = count.toString()
        //game over
        for(item in matrix){
            for(k in item){
                if(k == 1){
                    isGameOver = false
                    break
                }
            }
            if(isGameOver == false){
                break
            }
        }
        if(isGameOver == true){
            for(item in clickableView){
                for(k in item){
                    k.visibility = View.GONE
                }
                findViewById<TextView>(R.id.game_over).visibility = View.VISIBLE
            }
        }

    }
}
