package com.app.v

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class HomeActivity : AppCompatActivity() {

    private lateinit var bubbleEmitterView: BubbleEmitterView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val rippleBackground1 = findViewById<WaveView>(R.id.content1)
        val rippleBackground2 = findViewById<WaveView>(R.id.content2)
        val rippleBackground3 = findViewById<WaveView>(R.id.content3)
        val rippleBackground4 = findViewById<WaveView>(R.id.content4)
        val rippleBackground5 = findViewById<WaveView>(R.id.content5)
        val rippleBackground6 = findViewById<WaveView>(R.id.content6)
        rippleBackground1.startRippleAnimation()
        rippleBackground2.startRippleAnimation()
        rippleBackground3.startRippleAnimation()
        rippleBackground4.startRippleAnimation()
        rippleBackground5.startRippleAnimation()
        rippleBackground6.startRippleAnimation()

        bubbleEmitterView = findViewById(R.id.bubbleEmitter)
        emitBubbles()


    }

    private fun emitBubbles() {
        Handler().postDelayed({
            val size = Random.nextInt(20, 80)
            bubbleEmitterView.emitBubble(size)
            emitBubbles()
        }, Random.nextLong(100, 500))
    }
}