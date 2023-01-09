package br.com.velantasistemas.koinscopedactivity

import android.os.Bundle
import android.widget.Toast
import java.util.Calendar
import org.koin.android.ext.android.get
import org.koin.androidx.scope.ScopeActivity
import org.koin.core.parameter.parametersOf

class TrickyActivity : ScopeActivity(), MVP.View {

    private val presenter by lazy { get<MVP.Presenter> { parametersOf(this@TrickyActivity) } }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.toast()
    }

    override fun toast() {
        val id = intent.getIntExtra("id", -1)
        val text = "TrickyActivity#${id} => ${Calendar.getInstance()}"
        System.out.println(text)
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}
