package br.com.velantasistemas.koinscopedactivity

import android.os.Bundle
import br.com.velantasistemas.koinscopedactivity.databinding.ActivityTrickyBinding
import org.koin.androidx.scope.ScopeActivity
import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules
import org.koin.core.parameter.parametersOf

class TrickyActivity : ScopeActivity(), MVP.View {

    private lateinit var binding: ActivityTrickyBinding

    private val presenter by lazy {
        scope.get<MVP.Presenter> {
            val id = intent.getIntExtra("id", -1)
            parametersOf(this@TrickyActivity, id)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        loadKoinModules(Modules.instance)
        super.onCreate(savedInstanceState)

        /**
         * What the hell is that?
         * It's just to trigger kotlin lazy initialization once.
         * **/
        presenter.toString()

        binding = ActivityTrickyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener { loadContent() }
    }

    override fun loadContent() {
        presenter.initialize()
    }

    override fun showContent(message: String) {
        binding.textView.text = message
    }

    override fun onDestroy() {
        super.onDestroy()
        unloadKoinModules(Modules.instance)
    }
}
