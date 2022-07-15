package com.example.foodapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodapp.ui.theme.FoodAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodAppTheme {
              Column(modifier = Modifier.fillMaxSize()) {
                  TopAppBar(title = {
                      Text(text = "FoodApp")
                  })

                  showFoodList(foodList)



              }
            }
        }
    }
}

@Composable
fun showFoodList(foodLst: List<Food>){
    LazyColumn{
        items(foodLst){
            FoodCard(it, Modifier.padding(16.dp))

        }
    }

}

@Composable
fun FoodCard(food: Food, modifier: Modifier){

  Surface(shape = RoundedCornerShape(8.dp), elevation = 8.dp, modifier = modifier) {
      Column(modifier = Modifier.fillMaxWidth()) {
          Image(painter = painterResource(id = food.imgResource), contentDescription = "food",
          contentScale = ContentScale.Crop,
          modifier = Modifier
              .fillMaxWidth()
              .height(144.dp))

          Column(modifier = Modifier.padding(16.dp)) {
              Text(text = food.title, style = MaterialTheme.typography.h5,
                  modifier = Modifier.padding(bottom = 4.dp))

              Text(text = food.desc, style = MaterialTheme.typography.body1,
                  modifier = Modifier.padding(bottom = 4.dp))
          }

      }
  }

}

















