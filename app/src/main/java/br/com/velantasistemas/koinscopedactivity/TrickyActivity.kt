package br.com.velantasistemas.koinscopedactivity

import android.os.Bundle
import br.com.velantasistemas.koinscopedactivity.databinding.ActivityTrickyBinding
import org.koin.androidx.scope.ScopeActivity
import org.koin.core.parameter.parametersOf

class TrickyActivity : ScopeActivity(), MVP.View {

    private lateinit var binding: ActivityTrickyBinding
    private val presenter by scope.inject<MVP.Presenter> {
        val id = intent.getIntExtra("id", -1)
        parametersOf(this@TrickyActivity, id)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTrickyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter.initialize()
    }

    override fun showContent(message: String) {
        binding.textView.text = message
    }
}
