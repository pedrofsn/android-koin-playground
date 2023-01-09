package br.com.velantasistemas.koinscopedactivity

import android.os.Bundle
import br.com.velantasistemas.koinscopedactivity.databinding.ActivityTrickyBinding
import java.util.Calendar
import org.koin.android.ext.android.get
import org.koin.androidx.scope.ScopeActivity
import org.koin.core.parameter.parametersOf

class TrickyActivity : ScopeActivity(), MVP.View {

    private lateinit var binding: ActivityTrickyBinding
    private val presenter by lazy { get<MVP.Presenter> { parametersOf(this@TrickyActivity) } }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTrickyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter.initialize()
    }

    override fun showContent() {
        val id = intent.getIntExtra("id", -1)
        val text = "TrickyActivity#${id}\n${Calendar.getInstance()}"
        binding.textView.text = text
    }
}
