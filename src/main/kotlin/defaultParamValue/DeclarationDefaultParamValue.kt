package defaultParamValue

class DeclarationDefaultParamValue {
    @JvmOverloads // important so that java-interop includes overloads
    fun atTheEnd(number: Int, name: String = "Me"): String {
        return "$number and $name"
    }

    @JvmOverloads // important so that java-interop includes overloads
    fun atTheStart(name: String = "Me", number: Int): String {
        return "$number and $name"
    }
}
