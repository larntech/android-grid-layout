package net.larntech.grid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onClickListener();
    }

    fun onClickListener(){
        cvBroccoli.setOnClickListener {
            startActivity(Intent(this, BroccoliActivity::class.java).putExtra("name","Broccoli").putExtra("image", R.drawable.broccoli))
        }


        cvOnions.setOnClickListener {
            startActivity(Intent(this, OnionsActivity::class.java).putExtra("name","Onions").putExtra("image", R.drawable.onions))

        }

    }

}