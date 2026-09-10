package com.example.fabricatubos

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TelaQualidade(voltar: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Controle de Qualidade", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(32.dp))
        Text("Lote Atual: Tubos Estruturais 50mm")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { }, modifier = Modifier.fillMaxWidth()) { Text("Aprovar Lote para Expedição") }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { }, modifier = Modifier.fillMaxWidth()) { Text("Registrar Falha de Espessura") }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { }, modifier = Modifier.fillMaxWidth()) { Text("Reprovar Lote") }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { }, modifier = Modifier.fillMaxWidth()) { Text("Histórico de Inspeções") }
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = voltar, modifier = Modifier.fillMaxWidth()) { Text("Voltar ao Menu") }
    }
}
