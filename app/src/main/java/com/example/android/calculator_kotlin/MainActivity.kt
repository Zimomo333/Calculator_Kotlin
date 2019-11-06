package com.example.android.calculator_kotlin

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var textView: TextView? = null
    private var sb = StringBuffer()
    private val str = StringBuffer()
    private val count_negative = 0
    private var equals = false
    private var count_bracket_left = 0//左括号个数标记
    private var count_bracket_right = 0//右括号个数标记
    private var a = 0//删除时当做记录的指针

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //定义控件
        val button0 = findViewById<Button>(R.id.button0)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val buttonj = findViewById<Button>(R.id.buttonj)
        val buttonjian = findViewById<Button>(R.id.buttonjian)
        val buttonzuokuo = findViewById<Button>(R.id.buttonzuokuo)
        val buttonyoukuo = findViewById<Button>(R.id.buttonyoukuo)
        val buttoncheng = findViewById<Button>(R.id.buttoncheng)
        val buttonc = findViewById<Button>(R.id.buttonc)
        val buttondeng = findViewById<Button>(R.id.buttondeng)
        val buttonDot = findViewById<Button>(R.id.buttonDot)
        val buttondel = findViewById<Button>(R.id.buttondel)
        val buttonchu = findViewById<Button>(R.id.buttonchu)
        val buttonyu = findViewById<Button>(R.id.buttonyu)
        val buttonfang = findViewById<Button>(R.id.buttonfang)
        textView = findViewById(R.id.text_view)
        button0.setOnClickListener(this)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        buttonc.setOnClickListener(this)
        buttonchu.setOnClickListener(this)
        buttoncheng.setOnClickListener(this)
        buttonjian.setOnClickListener(this)
        buttonj.setOnClickListener(this)
        buttondeng.setOnClickListener(this)
        buttonDot.setOnClickListener(this)
        buttondel.setOnClickListener(this)
        buttonzuokuo.setOnClickListener(this)
        buttonyoukuo.setOnClickListener(this)
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            buttonyu.setOnClickListener(this)
            buttonfang.setOnClickListener(this)
        }
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.button0 -> {
                if (equals) {
                    sb = sb.delete(0, sb.length)
                    equals = false
                }
                if (sb.length == 0) {
                    sb.append("0")
                } else {
                    if (sb[sb.length - 1] == ')') {///如果前面是右括号那么在0前补充乘号
                        sb.append("*0")
                    } else {
                        sb.append("0")
                    }
                }
                textView!!.text = sb.toString()
            }
            R.id.button1 -> {
                if (equals) {
                    sb = sb.delete(0, sb.length)
                    equals = false
                }
                if (sb.length == 0) {
                    sb.append("1")
                } else {
                    if (sb[sb.length - 1] == ')') {
                        sb.append("*1")
                    } else {
                        sb.append("1")
                    }
                }
                textView!!.text = sb.toString()
            }
            R.id.button2 -> {
                if (equals) {
                    sb = sb.delete(0, sb.length)
                    equals = false
                }
                if (sb.length == 0) {
                    sb.append("2")
                } else {
                    if (sb[sb.length - 1] == ')') {
                        sb.append("*2")
                    } else {
                        sb.append("2")
                    }
                }
                textView!!.text = sb.toString()
            }
            R.id.button3 -> {
                if (equals) {
                    sb = sb.delete(0, sb.length)
                    equals = false
                }
                if (sb.length == 0) {
                    sb.append("3")
                } else {
                    if (sb[sb.length - 1] == ')') {
                        sb.append("*3")
                    } else {
                        sb.append("3")
                    }
                }
                textView!!.text = sb.toString()
            }
            R.id.button4 -> {
                if (equals) {
                    sb = sb.delete(0, sb.length)
                    equals = false
                }
                if (sb.length == 0) {
                    sb.append("4")
                } else {
                    if (sb[sb.length - 1] == ')') {
                        sb.append("*4")
                    } else {
                        sb.append("4")
                    }
                }
                textView!!.text = sb.toString()
            }
            R.id.button5 -> {
                if (equals) {
                    sb = sb.delete(0, sb.length)
                    equals = false
                }
                if (sb.length == 0) {
                    sb.append("5")
                } else {
                    if (sb[sb.length - 1] == ')') {
                        sb.append("*5")
                    } else {
                        sb.append("5")
                    }
                }
                textView!!.text = sb.toString()
            }
            R.id.button6 -> {
                if (equals) {
                    sb = sb.delete(0, sb.length)
                    equals = false
                }
                if (sb.length == 0) {
                    sb.append("6")
                } else {
                    if (sb[sb.length - 1] == ')') {
                        sb.append("*6")
                    } else {
                        sb.append("6")
                    }
                }
                textView!!.text = sb.toString()
            }
            R.id.button7 -> {
                if (equals) {
                    sb = sb.delete(0, sb.length)
                    equals = false
                }
                if (sb.length == 0) {
                    sb.append("7")
                } else {
                    if (sb[sb.length - 1] == ')') {
                        sb.append("*7")
                    } else {
                        sb.append("7")
                    }
                }
                textView!!.text = sb.toString()
            }
            R.id.button8 -> {
                if (equals) {
                    sb = sb.delete(0, sb.length)
                    equals = false
                }
                if (sb.length == 0) {
                    sb.append("8")
                } else {
                    if (sb[sb.length - 1] == ')') {
                        sb.append("*8")
                    } else {
                        sb.append("8")
                    }
                }
                textView!!.text = sb.toString()
            }
            R.id.button9 -> {
                if (equals) {
                    sb = sb.delete(0, sb.length)
                    equals = false
                }
                if (sb.length == 0) {
                    sb.append("9")
                } else {
                    if (sb[sb.length - 1] == ')') {
                        sb.append("*9")
                    } else {
                        sb.append("9")
                    }
                }
                textView!!.text = sb.toString()
            }
            R.id.buttondel -> {
                if (equals) {
                    equals = false
                }
                if (sb.length != 0 && a == 0) {
                    if (sb[sb.length - 1] == '-' && sb[sb.length - 2] == '(' || sb[sb.length - 1] == '.' && sb[sb.length - 2] == '0') {
                        sb = sb.deleteCharAt(sb.length - 1)
                        sb = sb.deleteCharAt(sb.length - 1)
                    } else {
                        sb = sb.deleteCharAt(sb.length - 1)
                    }
                } else if (sb.length != 0 && a == 1) {
                    sb = sb.delete(0, sb.length)
                }
                textView!!.text = sb.toString()
                a = 0
            }
            R.id.buttonc -> {
                if (equals) {
                    equals = false
                }
                sb = sb.delete(0, sb.length)
                textView!!.text = sb.toString()
            }
            R.id.buttonzuokuo -> {
                if (equals) {
                    equals = false
                }
                if (sb.length > 0 && sb[sb.length - 1] >= '0' && sb[sb.length - 1] <= '9') {
                    sb = sb.append("*(")
                }
                if (sb.length == 0) {
                    sb.append("(")
                }
                if (sb.length > 0 && (sb[sb.length - 1] == '*' || sb[sb.length - 1] == '/' || sb[sb.length - 1] == '+' || sb[sb.length - 1] == '-')) {
                    sb = sb.append("(")
                }
                textView!!.text = sb.toString()
            }
            R.id.buttonyoukuo -> {
                if (equals) {
                    equals = false
                }
                var count_num = 0
                val Sum = 0
                val num = 0
                count_bracket_right = 0
                count_bracket_left = count_bracket_right
                if (sb.length != 0) {
                    for (i in sb.length - 1 downTo 0) {
                        if (count_bracket_left == 0 && sb[i] >= '0' && sb[i] <= '9') {
                            count_num++
                        }
                        if (sb[i] == '(') {
                            count_bracket_left++

                        }
                        if (sb[i] == ')') {
                            count_bracket_right++
                        }
                    }
                    if (count_bracket_left > count_bracket_right && count_num > 0) {
                        if (sb[sb.length - 1] != '-' && sb[sb.length - 1] != '+' && sb[sb.length - 1] != '*' && sb[sb.length - 1] != '/') {
                            sb.append(")")
                        }
                    }
                }
                textView!!.text = sb.toString()
            }
            R.id.buttonj -> {
                if (equals) {
                    equals = false
                }
                if (sb.length != 0) {
                    if (sb[sb.length - 1] >= '0' && sb[sb.length - 1] <= '9' || sb[sb.length - 1] == '.') {
                        if (sb[sb.length - 1] >= '0' && sb[sb.length - 1] <= '9') {
                            sb.append("+")
                        }
                        if (sb[sb.length - 1] == '.') {
                            sb.append("0+")
                        }
                    }
                    if (sb[sb.length - 1] == ')') {
                        sb.append("+")
                    }
                }
                textView!!.text = sb.toString()
            }
            R.id.buttonjian -> {
                if (equals) {
                    equals = false
                }
                if (sb.length != 0) {
                    if (sb[sb.length - 1] >= '0' && sb[sb.length - 1] <= '9' || sb[sb.length - 1] == '.') {
                        if (sb[sb.length - 1] >= '0' && sb[sb.length - 1] <= '9') {
                            sb.append("-")
                        }
                        if (sb[sb.length - 1] == '.') {
                            sb.append("0-")
                        }
                    } else if (sb[sb.length - 1] == ')') {
                        sb.append("-")
                    } else if (sb[sb.length - 1] == '(') {
                        sb.append("(-")
                    } else if (sb[sb.length - 1] == '+' || sb[sb.length - 1] == '-' || sb[sb.length - 1] == '*' || sb[sb.length - 1] == '/') {
                        sb.append("(-")
                    }
                } else {
                    sb.append("(-")
                }
                textView!!.text = sb.toString()
            }
            R.id.buttoncheng -> {
                if (equals) {
                    equals = false
                }
                if (sb.length != 0) {
                    if (sb[sb.length - 1] >= '0' && sb[sb.length - 1] <= '9' || sb[sb.length - 1] == '.') {
                        if (sb[sb.length - 1] >= '0' && sb[sb.length - 1] <= '9') {
                            sb.append("*")
                        }
                        if (sb[sb.length - 1] == '.') {
                            sb.append("0*")
                        }
                    }
                    if (sb[sb.length - 1] == ')') {
                        sb.append("*")
                    }
                }
                textView!!.text = sb.toString()
            }
            R.id.buttonchu -> {
            if (equals) {
                equals = false
            }
            if (sb.length != 0) {
                if (sb[sb.length - 1] >= '0' && sb[sb.length - 1] <= '9' || sb[sb.length - 1] == '.') {
                    if (sb[sb.length - 1] >= '0' && sb[sb.length - 1] <= '9') {
                        sb.append("/")
                    }
                    if (sb[sb.length - 1] == '.') {
                        sb.append("0/")
                    }
                }
                if (sb[sb.length - 1] == ')') {
                    sb.append("/")
                }
            }
            textView!!.text = sb.toString()
            }
            R.id.buttonyu -> {
                if (equals) {
                    equals = false
                }
                if (sb.length != 0) {
                    if (sb[sb.length - 1] >= '0' && sb[sb.length - 1] <= '9' || sb[sb.length - 1] == '.') {
                        if (sb[sb.length - 1] >= '0' && sb[sb.length - 1] <= '9') {
                            sb.append("%")
                        }
                        if (sb[sb.length - 1] == '.') {
                            sb.append("0%")
                        }
                    }
                    if (sb[sb.length - 1] == ')') {
                        sb.append("%")
                    }
                }
                textView!!.text = sb.toString()
            }
            R.id.buttonfang -> {
                if (equals) {
                    equals = false
                }
                if (sb.length != 0) {
                    if (sb[sb.length - 1] >= '0' && sb[sb.length - 1] <= '9' || sb[sb.length - 1] == '.') {
                        if (sb[sb.length - 1] >= '0' && sb[sb.length - 1] <= '9') {
                            sb.append("^2")
                        }
                        if (sb[sb.length - 1] == '.') {
                            sb.append("0^2")
                        }
                    }
                    if (sb[sb.length - 1] == ')') {
                        sb.append("^2")
                    }
                }
                textView!!.text = sb.toString()
            }
            R.id.buttonDot -> {
                var apps = 0
                if (equals) {
                    equals = false
                }
                if (sb.length != 0) {
                    if (sb[sb.length - 1] >= '0' && sb[sb.length - 1] <= '9') {
                        for (i in sb.length - 2 downTo 0) {
                            if (sb[i] == '.') {
                                apps = 1
                                break
                            } else if (sb[i] == '(' || sb[i] == '+' || sb[i] == '-' || sb[i] == '*' || sb[i] == '/') {
                                break
                            }
                        }
                        if (apps == 0) {
                            sb.append(".")
                        }
                    }
                    if (sb[sb.length - 1] == '(' || sb[sb.length - 1] == ')') {
                        if (sb[sb.length - 1] == ')') {
                            sb.append("*0.")
                        } else {
                            sb.append("0.")
                        }
                    }
                    if (sb[sb.length - 1] == '*' || sb[sb.length - 1] == '/' || sb[sb.length - 1] == '+' || sb[sb.length - 1] == '-') {
                        sb.append("0.")
                    }
                } else {
                    sb.append("0.")
                }
                textView!!.text = sb.toString()
            }
            R.id.buttondeng -> {
                var count_left = 0
                var count_right = 0
                if (equals) {
                    equals = false
                }
                if (sb.length != 0) {
                    for (i in sb.length - 1 downTo 0) {
                        if (sb[i] == ')') {
                            count_right++
                        }
                        if (sb[i] == '(') {
                            count_left++
                        }
                    }
                    if (count_left != count_right) {
                        Toast.makeText(this@MainActivity, "请注意括号匹配！！！", Toast.LENGTH_SHORT).show()
                    }
                    if (count_left == count_right && sb[sb.length - 1] >= '0' && sb[sb.length - 1] <= '9' || sb[sb.length - 1] == ')') {
                        try {
                            textView!!.setText(InfixToSuffix.Cal(InfixToSuffix.Suffix(sb)))
                            a = 1
                            //利用类名两次调用静态方法，将后缀表达式的结果输出在屏幕上
                            sb = sb.delete(0, sb.length)
                            sb.append(textView!!.text.toString())
                        } catch (e: Exception) {
                            textView!!.text = "Error!!!"
                            sb = sb.delete(0, sb.length)
                        }

                    }
                }
            }
            else -> {
            }
        }
    }
}//如果等号前面是小数点的话，就在小数点后补0
