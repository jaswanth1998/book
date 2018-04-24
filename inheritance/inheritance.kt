class Example // Implicitly inherits from Any
open class Base(p: Int)

class Derived(p: Int) : Base(p)

class MyView : View {
    constructor(ctx: Context) : super(ctx)

    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}
open class Base {
    open fun v() {}
    fun nv() {}
}
class Derived() : Base() {
    override fun v() {}
}
open class AnotherDerived() : Base() {
    final override fun v() {}
}