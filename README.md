# android-sample-KoinScopedActivity

## Library
- https://github.com/InsertKoinIO/koin

## Problem description (high level)
1. An activity class to see users profile, like ActivityProfile;
2. ActivityProfile has a module tied to it and this activity load and unload this module;
3. Using the app, ActivityProfile is called twice with distinct parameters like userIDs (so it's an expected behaviour);
4. ActivityProfile#1 is in navigation stack and ActivityProfile#2 is in top (user is looking for it);
5. User destroy the activity using back button so ActivityProfile#2 calls onDestroy. When this activity is closed user start to look to ActivityProfile#1;
6. ActivityProfile#1 try to access Koin dependencies and crash with `NoBeanDefFoundException`!

## Is it a real scenario?
Yes, if you get this combination:
1. Handling load/unload module manually because you haven't access to Application class ;
2. Can have multiple instances from same activity running;
3. Have a tied scope to this activity.

Applicability: when you`re working with SDK or feature modularized outside of monolithic app.

## Sample
With this sample you can reproduce this scenario.

## Sample in video
https://user-images.githubusercontent.com/3484814/211393320-90e97a05-226c-4708-8e45-02ef20914d21.mov
