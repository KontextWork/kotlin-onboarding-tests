package unit

class DeclarationUnit {
    var i: Int = 0;

    fun returnImplicitUnit() {
        this.i = 1;
    }

    fun returnUnit(): Unit {
        this.i = 1;
    }
}
