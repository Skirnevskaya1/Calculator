package com.android.calculator.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.android.calculator.R

enum class KeyboardKey {
    // rename camelcase
    button_ce,
    button_mc,
    button_quotes,
    button_div,
    button_7,
    button_8,
    button_9,
    button_multi,
    button_4,
    button_5,
    button_6,
    button_minus,
    button_1,
    button_2,
    button_3,
    button_plus,
    button_0,
    button_comma,
    button_equals;
}

class KeyboardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(
    context, attrs, defStyleAttr
) {
    fun interface KeyboardPressListener {

        fun onKeyPressed(key: KeyboardKey)
    }

    private var listener: KeyboardPressListener? = null

    init {
        val inflater = LayoutInflater.from(context)
        inflater.inflate(R.layout.view_keyboard, this, true)
        //
    }

    override fun onFinishInflate() {
        super.onFinishInflate()

        findViewById<Button>(R.id.button_ce).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_ce)
        }
        findViewById<Button>(R.id.button_mc).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_mc)
        }
        findViewById<Button>(R.id.button_quotes).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_quotes)
        }
        findViewById<Button>(R.id.button_div).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_div)
        }
        findViewById<Button>(R.id.button_7).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_7)
        }
        findViewById<Button>(R.id.button_8).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_8)
        }
        findViewById<Button>(R.id.button_9).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_9)
        }
        findViewById<Button>(R.id.button_multi).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_multi)
        }
        findViewById<Button>(R.id.button_4).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_4)
        }
        findViewById<Button>(R.id.button_5).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_5)
        }
        findViewById<Button>(R.id.button_6).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_6)
        }
        findViewById<Button>(R.id.button_minus).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_minus)
        }
        findViewById<Button>(R.id.button_1).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_1)
        }
        findViewById<Button>(R.id.button_2).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_2)
        }
        findViewById<Button>(R.id.button_3).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_3)
        }
        findViewById<Button>(R.id.button_plus).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_plus)
        }
        findViewById<Button>(R.id.button_0).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_0)
        }
        findViewById<Button>(R.id.button_comma).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_comma)
        }
        findViewById<Button>(R.id.button_equals).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.button_equals)
        }

    }

    fun setOnKeyPressedListener(listener: KeyboardPressListener) {
        this.listener = listener
    }
}