package marabillas.loremar.drawableexperiments

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Demonstrates the use of State List Drawable. Shows border when clicked(when state is pressed = true).
 */
class StateListSampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statelist_sample)
    }
}