package warmup

object Warmup {
  def filter[A](xs: List[A])(p: A => Boolean): List[A] =
    xs match {
      case Nil =>
        Nil
      case y :: ys =>
        if (p(y)) y :: filter(ys)(p) else filter(ys)(p)
    }
}
