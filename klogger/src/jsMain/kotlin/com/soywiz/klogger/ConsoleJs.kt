package com.soywiz.klogger

actual inline fun Console.error(vararg msg: Any?) = console.error(*msg)
actual inline fun Console.log(vararg msg: Any?) = console.log(*msg)
