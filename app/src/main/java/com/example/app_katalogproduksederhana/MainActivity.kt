package com.example.app_katalogproduksederhana

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.app_katalogproduksederhana.ui.theme.AppKatalogProdukSederhanaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // Pastikan menggunakan nama Theme project Anda
            AppKatalogProdukSederhanaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Memanggil fungsi layar utama
                    CatalogScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

// ==========================================
// SCREEN UTAMA
// ==========================================

@Composable
fun CatalogScreen(modifier: Modifier = Modifier) {
    // 1. Menggunakan Column untuk susunan vertikal utama (Wajib)
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Bagian 1: Header
        CatalogHeader(
            title = "Martio's Tech Store",
            subtitle = "Katalog Gadget & Aksesoris Terbaik"
        )

        // Bagian 2: Daftar Produk (Kumpulan Card)
        Column(
            modifier = Modifier.weight(1f), // Agar mengisi ruang tengah yang tersisa
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            ProductCard(
                productName = "Laptop Gaming X-Pro",
                category = "Elektronik",
                price = "Rp 15.000.000",
                rating = 4.8
            )
            ProductCard(
                productName = "Mechanical Keyboard Z1",
                category = "Aksesoris",
                price = "Rp 850.000",
                rating = 4.5
            )
            ProductCard(
                productName = "Wireless Mouse M2",
                category = "Aksesoris",
                price = "Rp 350.000",
                rating = 4.2
            )
        }

        // Bagian 3: Footer/Aksi (Button)
        CatalogFooter()
    }
}


// ==========================================
// CUSTOM COMPOSABLE 1: HEADER
// ==========================================
@Composable
fun CatalogHeader(title: String, subtitle: String) {
    // 2. Menggunakan Box untuk header background (Wajib)
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(4.dp, RoundedCornerShape(12.dp))
            .clip(RoundedCornerShape(12.dp))
            .background(MaterialTheme.colorScheme.primaryContainer) // Styling modifier wajib
            .padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = title,
                style = MaterialTheme.typography.headlineMedium, // Material Theme Typography wajib
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = subtitle,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.8f)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppKatalogProdukSederhanaTheme {
        Greeting("Android")
    }
}