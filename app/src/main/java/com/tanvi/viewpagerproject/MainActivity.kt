package com.tanvi.viewpagerproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager2.widget.ViewPager2
        class MainActivity : AppCompatActivity() {
            private lateinit var iv1: ImageView
            private lateinit var iv2: ImageView
            private lateinit var iv3: ImageView
            private lateinit var iv4: ImageView
            private lateinit var iv5: ImageView
            private lateinit var iv6: ImageView
            private lateinit var viewPager2: ViewPager2

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
                iv1 = findViewById(R.id.iv1)
                iv2 = findViewById(R.id.iv2)
                iv3 = findViewById(R.id.iv3)
                iv4 = findViewById(R.id.iv4)
                iv5 = findViewById(R.id.iv5)
                iv6 = findViewById(R.id.iv6)
                viewPager2 = findViewById(R.id.view_pager2)

                val images = listOf(R.drawable.iv11, R.drawable.iv13, R.drawable.iv14,R.drawable.iv17,R.drawable.iv10,R.drawable.iv15)
                val adapterClass = AdapterClass(images)
                viewPager2.adapter = adapterClass
                viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {

                    override fun onPageScrollStateChanged(state: Int) {
                        changeColor()
                        super.onPageScrollStateChanged(state)
                    }

                    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int
                    ) {
                        super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                        changeColor()
                    }

                    override fun onPageSelected(position: Int) {
                        super.onPageSelected(position)
                    }
                })
            }

            fun changeColor()
            {
                when (viewPager2.currentItem) {
                    0->
                    {
                        iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.teal_700))
                        iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv4.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv5.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv6.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                    }
                    1->
                    {    // kro lo kam byrok byee
                        iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.teal_700))
                        iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv4.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv5.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv6.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                    }
                    2->
                    {
                        iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.teal_700))
                        iv4.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv5.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv6.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                    }
                    3->
                    {
                        iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv4.setBackgroundColor(applicationContext.resources.getColor(R.color.teal_700))
                        iv5.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv6.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                    }
                    4->
                    {
                        iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv4.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv5.setBackgroundColor(applicationContext.resources.getColor(R.color.teal_700))
                        iv6.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                    }
                    5->
                    {
                        iv1.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv2.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv3.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv4.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv5.setBackgroundColor(applicationContext.resources.getColor(R.color.purple_200))
                        iv6.setBackgroundColor(applicationContext.resources.getColor(R.color.teal_700))
                    }
                }
            }
        }
