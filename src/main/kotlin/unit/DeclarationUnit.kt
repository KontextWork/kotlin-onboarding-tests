package unit

class DeclarationUnit {
    var i: Int = 0;

    public fun returnNothing() {
        this.i = 1;
    }

    public fun returnUnit(): Unit {
        this.i = 1;
    }
}
