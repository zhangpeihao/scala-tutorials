/**
  * Created by zhangpeihao on 16/11/11.
  */

/*
The superclass of all classes scala.Any has two direct subclasses scala.AnyVal and scala.AnyRef representing two
different class worlds: value classes and reference classes. All value classes are predefined; they correspond to the
primitive types of Java-like languages. All other classes define reference types. User-defined classes define reference
types by default; i.e. they always (indirectly) subclass scala.AnyRef. Every user-defined class in Scala implicitly
extends the trait scala.ScalaObject. Classes from the infrastructure on which Scala is running (e.g. the Java runtime
environment) do not extend scala.ScalaObject. If Scala is used in the context of a Java runtime environment, then
scala.AnyRef corresponds to java.lang.Object. Please note that the diagram above also shows implicit conversions between
the value classes. Here is an example that demonstrates that both numbers, characters, boolean values, and functions
are objects just like every other object:
 */
object App {
  def main(args: Array[String]): Unit = {
    val set = new scala.collection.mutable.LinkedHashSet[Any]
    set += "This is a string"  // add a string
    set += 732                 // add a number
    set += 'c'                 // add a character
    set += true                // add a boolean value
    set += main _              // add the main function
    val iter: Iterator[Any] = set.iterator
    while (iter.hasNext) {
      println(iter.next.toString())
    }
  }
}
