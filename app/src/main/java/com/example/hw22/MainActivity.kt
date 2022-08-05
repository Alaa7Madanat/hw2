package com.example.hw22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstfrag = firstsFragment()
        val secondfrag = secondFragment()
        val btnfrag1: Button = findViewById<Button>(R.id.btnfrag1)
        val btnfrag2: Button = findViewById<Button>(R.id.btnfrag2)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FLfrag, firstfrag)

            commit()
        }
        btnfrag1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.FLfrag, firstfrag)
                commit()
            }
        }
        btnfrag2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.FLfrag, secondfrag)
                commit()
            }
        }


    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.menus, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 -> Toast.makeText(this,"This is the first item", Toast.LENGTH_SHORT).show()
            R.id.item2 -> Toast.makeText(this, "This is the Second Item",Toast.LENGTH_SHORT).show()
            R.id.item3 -> Toast.makeText(this,"This is the Third Item",Toast.LENGTH_SHORT).show()
        }
        return true;
    }
}





