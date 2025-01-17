package com.adriangl.pokeapi_mvvm.utils.mini.viewmodel

import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModel
import mini.rx.DefaultSubscriptionTracker
import mini.rx.SubscriptionTracker

abstract class RxViewModel : ViewModel(),
    SubscriptionTracker by DefaultSubscriptionTracker() {

    @CallSuper
    override fun onCleared() {
        super.onCleared()
        clearSubscriptions()
    }
}