package marabillas.loremar.drawableexperiments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 * Demonstrates use of Level List drawable. Every second drawable changes level which is indicated by the change of
 * color. The color for each level is indicated in the drawable itself.
 */
class LevelListSampleActivity : AppCompatActivity() {
    private var sample: View? = null
    private val handler: Handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_levelllist_sample)
        sample = findViewById(R.id.levelimages)
    }

    override fun onStart() {
        super.onStart()

        object : Runnable {
            private var level: Int = 0
            override fun run() {
                if (level > 2) {
                    level = 0
                }
                val d = sample?.background
                d?.level = level++
                handler.postDelayed(this, 1000)
            }
        }.run()
    }
}