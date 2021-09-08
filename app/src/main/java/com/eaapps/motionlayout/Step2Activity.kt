package com.eaapps.motionlayout

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.RecyclerView


class Step2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step2)

        val itemRec = findViewById<RecyclerView>(R.id.items)
        val itemCate = findViewById<RecyclerView>(R.id.cate)
        val adaptersCate = Adapters(
            arrayListOf(
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
            )
        )
        itemCate.adapter = adaptersCate
        itemRec.adapter = Adapters(
            arrayListOf(
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""
            )
        )

        if (itemRec?.adapter!!.itemCount > 10){
        val scroll = findViewById<NestedScrollView>(R.id.scroll)
        scroll.viewTreeObserver.addOnScrollChangedListener {
            Handler(Looper.getMainLooper()).postDelayed({
                if (scroll.scrollY <= 2) {
                    if (!up) {
                        animationRecycler(itemCate)
                    }
                    up = true
                    adaptersCate.up()
                    animationRecycler(itemCate)
                }

                if (scroll.scrollY > 1) {
                    if (!down) {
                        animationRecycler(itemCate)
                    }
                    adaptersCate.down()
                    down = true
                }
            }, 150)
        }
    }

        itemRec.addOnScrollListener(object : RecyclerView.OnScrollListener() {

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
//
//                val topRowVerticalPosition =
//                    if (itemRec.childCount == 0) 0 else itemRec.getChildAt(0).top
//                val linearLayoutManager1 = itemRec.layoutManager as LinearLayoutManager
//                val firstVisibleItem = linearLayoutManager1.findFirstVisibleItemPosition()
//                Log.d(TAG, "onScrolled: $firstVisibleItem   $topRowVerticalPosition")
//                Handler(Looper.getMainLooper()).postDelayed({
//                    if ((firstVisibleItem == 0 || firstVisibleItem == 1) && topRowVerticalPosition >= 0) {
//                        Log.d(TAG, "onScrolled: UP")
//                        if (!up) {
//                            animationRecycler(itemCate)
//                        }
//                        up = true
//                        down = false
//                        adaptersCate.up()
//                        animationRecycler(itemCate)
//                    } else {
//                        Log.d(TAG, "onScrolled: DOWN")
//                        if (!down) {
//                            animationRecycler(itemCate)
//                        }
//                        adaptersCate.down()
//                        down = true
//                        up = false
//                    }
//                }, 150)
            }
        })

    }

    private var down = false
    private var up = false
    private var viewScrolled = 0f
    private fun animationRecycler(recyclerview: RecyclerView) {
        recyclerview.alpha = 0f
        recyclerview.animate()
            .translationY(0f)
            .setDuration(400)
            .alpha(1f)
            .setInterpolator(AccelerateDecelerateInterpolator())
            .start()
    }
}

private const val TAG = "Step2Activity"