package br.com.alura.aluvery.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.alura.aluvery.model.Product
import br.com.alura.aluvery.ui.components.ProductItem

@Composable
fun AllProductsScreen(allProducts: List<Product>) {
    Column {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 16.dp)
        ) {
            item(
                span = { GridItemSpan(maxCurrentLineSpan)}
            ) {
                Text(
                    text = "Todos produtos",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            items(allProducts) { p ->
                ProductItem(product = p)
            }
        }
    }
}