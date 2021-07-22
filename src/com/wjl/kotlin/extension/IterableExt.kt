package com.wjl.kotlin.extension

fun <T> Iterable<T>.randomTake(): T = this.shuffled().first()