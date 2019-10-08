val l1 = List(1, 2, 3, "e", "a", "kdjd", 10.90)

l1.fold(None)((a, c) => c)

def last[T](l:List[T]): T = {
  l match {
    case h :: Nil => h
    case h :: t => last(t)
  }
}

last(l1)

val l2 = List(1,2,3)

l2.map(_.toInt)

val map1 = Map(1 -> "one", 2 -> "two", 3 -> "three")

1 to map1.size map (map1.get) flatten

1 to map1.size flatMap (map1.get)
