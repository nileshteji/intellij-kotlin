// "Import" "false"
// ACTION: Convert to run
// ACTION: Convert to with
// ACTION: Introduce import alias
// ERROR: Unresolved reference: foo

package import_intention

typealias D = A


fun main() {
    <caret>D.foo()
}

class A {

}

class B {
    companion object {
        fun foo() {}
    }
}

class C {
    companion object {
        fun foo() {}
    }
}