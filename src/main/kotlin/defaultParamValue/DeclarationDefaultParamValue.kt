package defaultParamValue

class DeclarationDefaultParamValue {
    @JvmOverloads
    fun atTheEnd(number: Int, name: String = "Me"): String {
        return "$number and $name"
    }

    @JvmOverloads
    fun atTheStart(name: String = "Me", number: Int): String {
        return "$number and $name"
    }
}
