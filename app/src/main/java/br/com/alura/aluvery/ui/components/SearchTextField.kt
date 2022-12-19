package br.com.alura.aluvery.ui.components

import android.util.Log
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SearchTextField(searchText: String) {
    var text by remember { mutableStateOf(searchText) }

    OutlinedTextField(
        value = text,
        onValueChange = { newValue ->
            text = newValue
            Log.i("HomeScreen", "TextField $newValue")
            Log.i("HomeScreen", "state $newValue")
        },
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(percent = 100),
        leadingIcon = {
            Icon(Icons.Default.Search, contentDescription = "Lupa de busca")
        },
        label = {
            Text(text = "Produto")
        },
        placeholder = {
            Text(text = "O que você procura?")
        }
    )
}