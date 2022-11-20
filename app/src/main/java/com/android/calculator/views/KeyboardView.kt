package com.android.calculator.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.android.calculator.R

enum class KeyboardKey {
    BUTTON_CE,
    BUTTON_MC,
    BUTTON_QUOTES,
    BUTTON_DIV,
    BUTTON_7,
    BUTTON_8,
    BUTTON_9,
    BUTTON_MULTI,
    BUTTON_4,
    BUTTON_5,
    BUTTON_6,
    BUTTON_MINUS,
    BUTTON_1,
    BUTTON_2,
    BUTTON_3,
    BUTTON_PLUS,
    BUTTON_0,
    BUTTON_COMMA,
    BUTTON_EQUALS;
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
            listener?.onKeyPressed(KeyboardKey.BUTTON_CE)
        }
        findViewById<Button>(R.id.button_mc).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.BUTTON_MC)
        }
        findViewById<Button>(R.id.button_quotes).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.BUTTON_QUOTES)
        }
        findViewById<Button>(R.id.button_div).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.BUTTON_DIV)
        }
        findViewById<Button>(R.id.button_7).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.BUTTON_7)
        }
        findViewById<Button>(R.id.button_8).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.BUTTON_8)
        }
        findViewById<Button>(R.id.button_9).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.BUTTON_9)
        }
        findViewById<Button>(R.id.button_multi).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.BUTTON_MULTI)
        }
        findViewById<Button>(R.id.button_4).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.BUTTON_4)
        }
        findViewById<Button>(R.id.button_5).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.BUTTON_5)
        }
        findViewById<Button>(R.id.button_6).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.BUTTON_6)
        }
        findViewById<Button>(R.id.button_minus).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.BUTTON_MINUS)
        }
        findViewById<Button>(R.id.button_1).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.BUTTON_1)
        }
        findViewById<Button>(R.id.button_2).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.BUTTON_2)
        }
        findViewById<Button>(R.id.button_3).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.BUTTON_3)
        }
        findViewById<Button>(R.id.button_plus).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.BUTTON_PLUS)
        }
        findViewById<Button>(R.id.button_0).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.BUTTON_0)
        }
        findViewById<Button>(R.id.button_comma).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.BUTTON_COMMA)
        }
        findViewById<Button>(R.id.button_equals).setOnClickListener {
            listener?.onKeyPressed(KeyboardKey.BUTTON_EQUALS)
        }

    }

    fun setOnKeyPressedListener(listener: KeyboardPressListener) {
        this.listener = listener
    }

}