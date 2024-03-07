package com.norm.mycustomshapescompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.norm.mycustomshapescompose.ui.theme.MyCustomShapesComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCustomShapesComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                        ) {
                            Box(
                                Modifier
                                    .size(256.dp, 128.dp)
                            ) {
                                SpeechBubbleShapePreview(
                                    text = "Hello, World!"
                                )
                            }
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                        ) {
                            Box(
                                Modifier
                                    .size(256.dp, 128.dp)
                            ) {
                                SpeechBubbleShapePreview(
                                    text = "Hello, Android!"
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun SpeechBubbleShapePreview(
    text: String = "Hello, My CustomShape!",
    boxColor: Color = MaterialTheme.colorScheme.secondaryContainer,
    textColor: Color = MaterialTheme.colorScheme.onSecondaryContainer,
) {
    MyCustomShapesComposeTheme {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(SpeechBubbleShape())
                .background(boxColor)
        ) {
            Text(
                text = text,
                modifier = Modifier
                    .offset(x = 15.dp),
                color = textColor,
                fontSize = 24.sp
            )
        }
    }
}