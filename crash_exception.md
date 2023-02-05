```

E/AndroidRuntime: FATAL EXCEPTION: main
    Process: br.com.velantasistemas.koinscopedactivity, PID: 16162
    java.lang.RuntimeException: java.lang.reflect.InvocationTargetException
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:558)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1003)
     Caused by: java.lang.reflect.InvocationTargetException
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:548)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1003) 
     Caused by: org.koin.core.error.NoBeanDefFoundException: No definition found for class:'br.com.velantasistemas.koinscopedactivity.MVP$Presenter' q:''. Check your definitions!
        at org.koin.core.scope.Scope.throwDefinitionNotFound(Scope.kt:298)
        at org.koin.core.scope.Scope.resolveValue(Scope.kt:268)
        at org.koin.core.scope.Scope.resolveInstance(Scope.kt:231)
        at org.koin.core.scope.Scope.get(Scope.kt:210)
        at br.com.velantasistemas.koinscopedactivity.TrickyActivity.loadContent(TrickyActivity.kt:46)
        at br.com.velantasistemas.koinscopedactivity.TrickyActivity.onCreate$lambda-0(TrickyActivity.kt:21)
        at br.com.velantasistemas.koinscopedactivity.TrickyActivity.$r8$lambda$EpzWUtygs7IJBCcvIjAqBtuU9XM(Unknown Source:0)
        at br.com.velantasistemas.koinscopedactivity.TrickyActivity$$ExternalSyntheticLambda0.onClick(Unknown Source:2)
        at android.view.View.performClick(View.java:7455)
        at com.google.android.material.button.MaterialButton.performClick(MaterialButton.java:1219)
        at android.view.View.performClickInternal(View.java:7432)
        at android.view.View.access$3700(View.java:835)
        at android.view.View$PerformClick.run(View.java:28810)
        at android.os.Handler.handleCallback(Handler.java:938)
        at android.os.Handler.dispatchMessage(Handler.java:99)
        at android.os.Looper.loopOnce(Looper.java:201)
        at android.os.Looper.loop(Looper.java:288)
        at android.app.ActivityThread.main(ActivityThread.java:7842)
        at java.lang.reflect.Method.invoke(Native Method) 
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:548) 
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1003)
```
