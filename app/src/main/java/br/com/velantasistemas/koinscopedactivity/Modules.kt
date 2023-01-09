package br.com.velantasistemas.koinscopedactivity

import org.koin.dsl.module

object Modules {
    val instance = module {
        scope<TrickyActivity> {
            scoped<MVP.Presenter> { (view: MVP.View, id: Int) -> PresenterImpl(view, id) }
        }
    }

}


