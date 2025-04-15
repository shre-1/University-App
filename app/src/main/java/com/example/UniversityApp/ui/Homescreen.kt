package com.example.universityapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.universityapp.R

@Composable
fun NavHostController.HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0x8FFF9800))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Dashboard",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF009688),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 38.dp)
        )

        SearchBar(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { /* Already on Home */ }
                .padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.home),
                contentDescription = "Home",
                modifier = Modifier.size(72.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Home",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3F51B5)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { this@HomeScreen.navigate("students") }
                .padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.student),
                contentDescription = "Students",
                modifier = Modifier.size(72.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Students",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3F51B5)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { this@HomeScreen.navigate("courses") }
                .padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.courses),
                contentDescription = "Courses",
                modifier = Modifier.size(72.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Courses",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3F51B5)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { this@HomeScreen.navigate("grades") }
                .padding(vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.grades),
                contentDescription = "Grades",
                modifier = Modifier.size(72.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Grades",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3F51B5)
            )
        }

        Text(
            text = "Username: Simmy",
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF3F51B5),
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "Student ID: s123456",
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF3F51B5),
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(top = 8.dp)
        )

        Text(
            text = "Welcome!",
            fontSize = 34.sp,
            fontWeight = FontWeight.Black,
            color = Color(0xFFE91E63),
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Composable
fun SearchBar(modifier: Modifier = Modifier) {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        placeholder = { Text("Search...") },
        modifier = modifier
            .background(Color(0x61009688), shape = MaterialTheme.shapes.small),
        singleLine = true
    )
}