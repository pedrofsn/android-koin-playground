package br.com.velantasistemas.koinscopedactivity

import java.util.Calendar

class PresenterImpl(
    private val view: MVP.View?,
    private val id: Int
) : MVP.Presenter {

    override fun initialize() {
        val message = "TrickyActivity#${id}\n${Calendar.getInstance()}"
        view?.showContent(message)
    }

}
