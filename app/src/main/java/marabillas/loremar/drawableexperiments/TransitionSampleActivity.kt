package marabillas.loremar.drawableexperiments

import android.graphics.drawable.TransitionDrawable
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 * Demonstrates the use of TransitionDrawable. Drawable switches color every 2 seconds. The two colors being switched
 * between each other are indicated in the drawable itself.
 */
class TransitionSampleActivity : AppCompatActivity() {
    private var sample: View? = null
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition_sample)
        sample = findViewById(R.id.transition_view)
    }

    override fun onStart() {
        super.onStart()
        startTransition()
    }

    private fun startTransition() {
        val drawable = sample?.background
        if (drawable is TransitionDrawable) {
            drawable.startTransition(2000)
            handler.postDelayed({ reverseTransition() }, 2000)
        }
    }

    private fun reverseTransition() {
        val drawable = sample?.background
        if (drawable is TransitionDrawable) {
            drawable.reverseTransition(2000)
            handler.postDelayed({ startTransition() }, 2000)
        }
    }
}