package com.rj.headphones

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.unit.sp
import com.rj.headphones.ui.theme.HeadphonesAppTheme

class home : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HeadphonesAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    Greeting(
                        name = "World",

                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {

    }

}

@Preview(showBackground = true)
@Composable
fun Home(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 340.dp)
            .requiredHeight(height = 753.dp)
            .background(color = Color())
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(28.dp))
                .background(color = Color(0xff4f378b))
                .padding(start = 3.dp,
                    end = 3.dp,
                    top = 673.dp,
                    bottom = 4.dp)
        ) {
            var tabIndex by remember { mutableStateOf(0) }
            val tabData = listOf(
                R.drawable.headphones,
                R.drawable.home2,
                R.drawable.settings
            )

            TabRow(
                selectedTabIndex = tabIndex,
                contentColor = Color(0xffeaddff)
            ) {
                for ((index, icon) in tabData.withIndex()) {
                    Tab(
                        selected = tabIndex == index,
                        onClick = { tabIndex = index },
                        icon = {
                            Icon(
                                painter = painterResource(id = icon),
                                contentDescription = null)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .requiredHeight(height = 48.dp))
                }

            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(bottomStart = 28.dp, bottomEnd = 28.dp))
                .background(color = Color(0xff4f378b))
                .padding(start = 3.dp,
                    end = 3.dp,
                    bottom = 660.dp)
        ) {
            Text(
                text = "Home",
                color = Color(0xffeaddff),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Image(
                painter = painterResource(id = R.drawable.home5),
                contentDescription = "Home 5",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 32.48493194580078.dp,
                        end = 261.2520561218262.dp,
                        top = 26.040000915527344.dp,
                        bottom = 26.040000915527344.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 295.dp,
                        y = 32.dp)
                    .requiredSize(size = 24.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.moon02),
                    contentDescription = "Moon 02",
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 295.dp,
                            end = -295.dp,
                            top = 32.dp,
                            bottom = -32.dp))
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(16.dp))
                .background(color = Color.White))
        Image(
            painter = painterResource(id = R.drawable.airpods),
            contentDescription = "Airpods",
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 35.dp,
                    end = 239.dp,
                    top = 147.dp,
                    bottom = 540.dp))
        Text(
            text = "Last used device name",
            color = Color(0xffeaddff),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .fillMaxSize()
                .wrapContentHeight(align = Alignment.CenterVertically))
    }
}

@Preview(widthDp = 340, heightDp = 753)
@Composable
private fun HomePreview() {
    Home(Modifier)
}