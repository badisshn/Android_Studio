// ResultActivity.kt
package easy.tuto.myquizapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val resultTitleTextView: TextView = findViewById(R.id.resultTitleTextView)
        val playerNameResultTextView: TextView = findViewById(R.id.playerNameResultTextView)
        val scoreResultTextView: TextView = findViewById(R.id.scoreResultTextView)
        val returnButton: Button = findViewById(R.id.returnButton)

        val playerName = intent.getStringExtra("PLAYER_NAME")
        val score = intent.getIntExtra("SCORE", 0)

        playerNameResultTextView.text = "Nom de l'utilisateur: $playerName"
        scoreResultTextView.text = "Score: $score"

        // Set text color based on the score
        if (score >= 10) {
            scoreResultTextView.setTextColor(resources.getColor(R.color.green)) // Use the actual color value
        } else {
            scoreResultTextView.setTextColor(resources.getColor(R.color.red)) // Use the actual color value
        }

        returnButton.setOnClickListener {
        }
    }
}
