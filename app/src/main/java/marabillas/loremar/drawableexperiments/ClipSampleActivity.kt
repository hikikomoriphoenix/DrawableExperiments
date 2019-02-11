package marabillas.loremar.drawableexperiments

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 * Demonstrates the use of Clip Drawable. Given a level value less than max level(default = 10000), only a portion of
 * the drawable is visible.
 */
class ClipSampleActivity : AppCompatActivity() {
    private var sample: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.clip_sample)
        sample = findViewById(R.id.clip_view)
    }

    override fun onStart() {
        super.onStart()

        val d = sample?.background
        d?.level = 8000
    }
}