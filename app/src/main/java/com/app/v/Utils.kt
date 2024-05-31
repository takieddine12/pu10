package com.app.v

import kotlinx.coroutines.flow.MutableStateFlow

object Utils {

    val airPlaneStatus : MutableStateFlow<Boolean> = MutableStateFlow(false)
}