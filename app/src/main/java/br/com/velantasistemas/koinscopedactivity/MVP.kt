package br.com.velantasistemas.koinscopedactivity

interface MVP {

    interface View {
        fun showContent()
    }

    interface Presenter {
        fun initialize()
    }
}
