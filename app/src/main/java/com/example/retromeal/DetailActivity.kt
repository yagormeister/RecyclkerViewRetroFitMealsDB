package com.example.retromeal
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.retromeal.R
import com.squareup.picasso.Picasso

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val mealName = intent.getStringExtra("EXTRA_MEAL_NAME")
        val mealCategory = intent.getStringExtra("EXTRA_MEAL_CATEGORY")
        val mealArea = intent.getStringExtra("EXTRA_MEAL_AREA")
        val mealInstructions = intent.getStringExtra("EXTRA_MEAL_INSTRUCTIONS")
        val mealImage = intent.getStringExtra("EXTRA_MEAL_IMAGE")

        findViewById<TextView>(R.id.textViewMealName).text = mealName
        findViewById<TextView>(R.id.textViewCategory).text = mealCategory
        findViewById<TextView>(R.id.textViewArea).text = mealArea
        findViewById<TextView>(R.id.textViewInstructions).text = mealInstructions
        Picasso.get().load(mealImage).into(findViewById<ImageView>(R.id.imageViewDetail))
    }
}
