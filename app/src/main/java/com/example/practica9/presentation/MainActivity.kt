package com.example.practica9.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.TimeText
import androidx.wear.tooling.preview.devices.WearDevices
import com.example.practica9.R
import com.example.practica9.presentation.theme.Practica9Theme
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var quoteTextView: TextView
    private lateinit var getQuoteButton: Button

    private val movieQuotes = listOf(
        "Que la fuerza te acompañe. - Star Wars: Episodio IV - Una nueva esperanza",
        "Siempre tendremos París. - Casablanca",
        "Houston, tenemos un problema. - Apollo 13",
        "Elemental, mi querido Watson. - Las Aventuras de Sherlock Holmes (no de película pero muy icónica)",
        "Tócala de nuevo, Sam. - Casablanca",
        "Francamente, querida, me importa un bledo. - Lo que el viento se llevó",
        "Elige la vida. Elige un trabajo. Elige una carrera. Elige una familia. - Trainspotting",
        "Al infinito y más allá. - Toy Story",
        "Hakuna Matata. - El Rey León",
        "La vida es como una caja de bombones, nunca sabes lo que te va a tocar. - Forrest Gump",
        "Voy a hacerle una oferta que no podrá rechazar. - El Padrino",
        "Aquí está, Johnny! - El Resplandor",
        "Soy el rey del mundo! - Titanic",
        "Hasta la vista, baby. - Terminator 2: El Juicio Final",
        "ET, teléfono, mi casa. - E.T., el extraterrestre"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        quoteTextView = findViewById(R.id.quoteTextView)
        getQuoteButton = findViewById(R.id.getQuoteButton)

        getQuoteButton.setOnClickListener {
            displayRandomQuote()
        }
        displayRandomQuote()
    }

    private fun displayRandomQuote() {
        val randomQuote = movieQuotes.random()
        quoteTextView.text = randomQuote
    }
}