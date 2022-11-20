package sam

class DoerConsumer {
    fun giveMeDoerNoArg(callback: DoerNoArg) {
        callback.doThat()
    }
}
