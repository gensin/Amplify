package es.gensin.amplify

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen1.*

class Screen1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)

        amplifyBtn.setOnClickListener{
            if (!userText.text.isEmpty()){
                val intent = Intent(this, AmplifyScreen::class.java)
                intent.putExtra(AmplifyScreen.TEXT, userText.text.toString())
                startActivity(intent)
            }
        }
    }
}
