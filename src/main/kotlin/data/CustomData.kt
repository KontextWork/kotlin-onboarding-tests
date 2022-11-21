package data

class CustomData {
    var field1 = "test"
        set (value){
            field = value + "_suffix"
        }
    var field2 = 1
        get () { return field + 1 }
    var field3 = listOf(1,2,3)
        private set // read only public interface
}
