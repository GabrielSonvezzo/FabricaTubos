package com.example.fabricatubos

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TelaMenu(irPPCP: () -> Unit, irQualidade: () -> Unit, irComercial: () -> Unit, sair: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Painel de Controle", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(32.dp))

        Button(onClick = irPPCP, modifier = Modifier.fillMaxWidth()) {
            Text("Setor: PPCP")
        }
        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = irQualidade, modifier = Modifier.fillMaxWidth()) {
            Text("Setor: Qualidade")
        }
        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = irComercial, modifier = Modifier.fillMaxWidth()) {
            Text("Setor: Comercial")
        }
        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = { }, modifier = Modifier.fillMaxWidth()) {
            Text("Meu Perfil")
        }
        Spacer(modifier = Modifier.height(32.dp))

        OutlinedButton(onClick = sair, modifier = Modifier.fillMaxWidth()) {
            Text("Sair")
        }
    }
}
