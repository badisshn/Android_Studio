// WelcomeActivity.kt
package easy.tuto.myquizapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val startQuizButton: Button = findViewById(R.id.startQuizButton)
        startQuizButton.setOnClickListener {
            // Get the entered player name
            val playerNameEditText = findViewById<EditText>(R.id.playerNameEditText)
            val playerName = playerNameEditText.text.toString()
            if (playerNameEditText != null) {
                // Your code here
            }
            // Get the selected category (Assuming you have a Spinner with ID categorySpinner)
            val categorySpinner = findViewById<Spinner>(R.id.categorySpinner)
            val selectedCategory = categorySpinner.selectedItem.toString()

            // Create an Intent to start MainActivity
            val intent = Intent(this, MainActivity::class.java)

            // Pass data (player name and selected category) to MainActivity
            intent.putExtra("PLAYER_NAME", playerName)
            intent.putExtra("SELECTED_CATEGORY", selectedCategory)

            // Start the MainActivity
            startActivity(intent)
        }
    }
}
