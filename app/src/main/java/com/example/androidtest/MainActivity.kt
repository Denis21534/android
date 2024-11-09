fun main() {
    var any: Any? = null
    any = 5

    if (any is Int) {
        println(any * 2) //10
    }
}
