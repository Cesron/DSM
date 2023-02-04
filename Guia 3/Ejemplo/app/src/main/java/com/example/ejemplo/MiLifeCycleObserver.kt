package com.example.ejemplo

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MiLifeCycleObserver: DefaultLifecycleObserver {
    override fun onCreate(lifecycler: LifecycleOwner) {
        super.onCreate(lifecycler)
        Log.d("miLifeCycleObserver", "OnCreate")
    }

    override fun onStart(lifecycler: LifecycleOwner) {
        super.onStart(lifecycler)
        Log.d("MiLifeCycleObserver", "onStart")
    }

    override fun onPause(lifecycler: LifecycleOwner) {
        super.onStop(lifecycler)
        Log.d("MiLifeCycleObserver", "onPause")
    }

    override fun onResume(lifecycler: LifecycleOwner) {
        super.onStop(lifecycler)
        Log.d("MiLifeCycleObserver", "onResume")
    }

    override fun onStop(lifecycler: LifecycleOwner) {
        super.onStop(lifecycler)
        Log.d("MiLifeCycleObserver", "onPause")
    }

    override fun onDestroy(lifecycler: LifecycleOwner) {
        super.onStop(lifecycler)
        Log.d("MiLifeCycleObserver", "onDestroy")
    }
}