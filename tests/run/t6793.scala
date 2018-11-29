package a { class C1(private[a] val v0: String) }
package b { class C2(v1: String) extends a.C1(v1) { def foo = v1 } }

object Test extends dotty.runtime.LegacyApp {
  new b.C2("x")

  val c2Fields = classOf[b.C2].getDeclaredFields
  assert(c2Fields.size == 1, c2Fields.map(_.nn.getName).toList)
}
