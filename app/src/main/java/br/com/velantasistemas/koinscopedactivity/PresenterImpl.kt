package br.com.velantasistemas.koinscopedactivity

class PresenterImpl(private val view: MVP.View?): MVP.Presenter {
    override fun initialize() {
        view?.showContent()
    }
}
