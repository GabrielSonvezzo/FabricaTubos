package com.example.fabricatubos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import com.example.fabricatubos.ui.theme.FabricaTubosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FabricaTubosTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    NavegacaoPrincipal()
                }
            }
        }
    }
}

@Composable
fun NavegacaoPrincipal() {
    var tela by remember { mutableStateOf("Login") }

    when (tela) {
        "Login" -> TelaLogin(aoEntrar = { tela = "Menu" })
        "Menu" -> TelaMenu(
            irPPCP = { tela = "PPCP" },
            irQualidade = { tela = "Qualidade" },
            irComercial = { tela = "Comercial" },
            sair = { tela = "Login" }
        )
        "PPCP" -> TelaPPCP(voltar = { tela = "Menu" })
        "Qualidade" -> TelaQualidade(voltar = { tela = "Menu" })
        "Comercial" -> TelaComercial(voltar = { tela = "Menu" })
    }
}
