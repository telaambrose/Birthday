package com.example.happybirthday
import androidx.compose.foundation.Image
import android.icu.text.CaseMap.Title
import android.media.Image
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        HappyBirthdayTheme {
                        Surface ( color = MaterialTheme.colors.background ) {

                BirthdayGreetingWithImage ("Happy Birthday Dad!", "- from Tela")

            }
            }
        }
        }
    }
@Composable
fun BirthdayGreetingWithText(message: String, from: String, modifier: Modifier = Modifier){
Column(modifier = modifier) {
    Text(
        text = message,
        fontSize = 36.sp,
        fontFamily = FontFamily.Cursive,
        color = colorResource(id = R.color.purple_700)
    )
    Text(
        text = from,
        fontSize = 24.sp,
        fontFamily = FontFamily.Serif,
        color = colorResource(id = R.color.teal_700)
    )
}
}
@Composable
fun BirthdayGreetingWithImage(message: String, from: String, modifier: Modifier= Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        BirthdayGreetingWithText(message = message, from = from)
    }
}

@Preview(showBackground = false)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        BirthdayGreetingWithImage(message = "Happy Birthday Dad!", from = "- from Tela")
    }
}

