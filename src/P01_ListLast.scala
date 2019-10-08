import java.util.NoSuchElementException

object P01_LastList {

  def last[T](l:List[T]):T = {
    l.last
  }

  def execute[T](l:List[T]) {

    def last[T](l:List[T]): T = {
      l match {
        case h :: Nil => h
        case _ :: t => last(t)
        case _ => throw new NoSuchElementException
      }
    }

    // using builtin
    println(s"(builtin) Last element of list is ${l.last}")
    // using fold
    println(s"(fold) Last element of list is ${l.fold(None)((a,c) => c)}")
    // using a recursive approach
    println(s"(recursive) Last element of list is ${last(l)}")
  }
}

object S99do extends App {
  println("Executing S99 problems")
  P01_LastList.execute(List(8, 9, "a", 6, 7, 9, 23, "s1"))
}
