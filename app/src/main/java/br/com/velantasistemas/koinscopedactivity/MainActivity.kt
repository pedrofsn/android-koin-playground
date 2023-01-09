package br.com.velantasistemas.koinscopedactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.velantasistemas.koinscopedactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent: (Int) -> Intent = { id ->
                Intent(this, TrickyActivity::class.java).apply {
                    putExtra("id", id)
                }
            }
            startActivity(intent(1))
            startActivity(intent(2))
        }
    }
}
