package br.com.velantasistemas.koinscopedactivity

interface MVP {

    interface View {
        fun toast()
    }

    interface Presenter {
        fun toast()
    }
}
