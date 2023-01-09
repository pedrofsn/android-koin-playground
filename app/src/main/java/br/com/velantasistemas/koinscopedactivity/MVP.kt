package br.com.velantasistemas.koinscopedactivity

interface MVP {

    interface View {
        fun showContent(message: String)
    }

    interface Presenter {
        fun initialize()
    }
}
