package es.gensin.amplify

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_amplify_screen.*

class AmplifyScreen : AppCompatActivity() {

    companion object {
        val TEXT = "text"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amplify_screen)
        amplifiedText.text = intent.extras[TEXT] as String
    }
}
