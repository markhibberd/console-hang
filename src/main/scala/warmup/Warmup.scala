package warmup

object Warmup {
  def filtering[A](xs: List[A])(p: A => Boolean): List[A] =
    xs match {
      case Nil =>
        Nil
      case y :: ys =>
        if (p(y)) y :: filtering(ys)(p) else filtering(ys)(p)
    }
}
