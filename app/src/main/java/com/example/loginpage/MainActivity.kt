package com.example.loginpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginpage.R.drawable.your_decorative_image
import com.example.loginpage.ui.theme.Black10
import com.example.loginpage.ui.theme.LoginPageTheme
import com.example.loginpage.ui.theme.Purple40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface (
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .padding(28.dp)
            ){

                Column(
                    modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Headingtext(value = stringResource(id = R.string.hello))
                    Spacer(modifier = Modifier.height(20.dp))
                    MyTextFeild1(labelValue = stringResource(id = R.string.firstname))
                    MyTextFeild(labelValue = stringResource(id = R.string.password))

                    Row() {
                        Simplebutton2()
                        Simplebutton1()


                    }

                }

            }
        }
    }
}


@Composable
fun Simplebutton1(){
    Button(modifier = Modifier.padding(16.dp),onClick = { /*TODO*/ }) {
        Text(text = "Sign up")
    }
}
@Composable
fun Simplebutton2(){
    Button(modifier = Modifier.padding(16.dp),onClick = { /*TODO*/ }) {
        Text(text = "Sign in")
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleTextField1() {
    var text by remember { mutableStateOf("") }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(16.dp)
    ) {
        Icon(imageVector = Icons.Default.Person, contentDescription = null)
        Spacer(modifier = Modifier.width(10.dp))
        TextField(
            value = text,
            onValueChange = { it -> text = it },
            label = { Text(text = "User Name") }
        )
    }
}





@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextFeild(labelValue:String){
    val textValue= remember{
        mutableStateOf("")
    }
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .clip(componentShapes.small)
        , // Set background color here
        label = { Text(text = labelValue) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Purple40,
            focusedLabelColor = Purple40,
            cursorColor = Purple40,

            ),
        keyboardOptions = KeyboardOptions.Default ,
        value =textValue.value,
        onValueChange ={
            textValue.value=it
        },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Lock, contentDescription = null)
        }
    )

}
@Composable
fun Headingtext(value:String){

    Text(
        text =value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(),
        style = TextStyle(
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic
        ),
        color= Black10,
        textAlign = TextAlign.Center


    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextFeild1(labelValue:String){
    val textValue= remember{
        mutableStateOf("")
    }
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .clip(componentShapes.small)
        , // Set background color here
        label = { Text(text = labelValue) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Purple40,
            focusedLabelColor = Purple40,
            cursorColor = Purple40,

            ),
        keyboardOptions = KeyboardOptions.Default ,
        value =textValue.value,
        onValueChange ={
            textValue.value=it
        },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Person, contentDescription = null)
        }
    )

}








