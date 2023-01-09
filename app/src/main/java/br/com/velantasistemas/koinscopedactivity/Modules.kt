package br.com.velantasistemas.koinscopedactivity

import org.koin.dsl.module

object Modules {
    val instance = module {
        factory<MVP.Presenter> { (view: MVP.View) -> PresenterImpl(view) }
    }

}


