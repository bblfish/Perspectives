package pov

/**
 * The Reader monad specialised on Persons. (We thereby simplify away
 * the κ from the article Perspectives by Ash Asudeh, Gianluca Giorgolo
 * https://semprag.org/article/view/sp.9.21
 *
 * @param inter
 * @tparam A
 */
case class PoV[A](inter: Person => A) {
  def map[B](f: A => B): PoV[B] = PoV(inter andThen f)
  def flatMap[B](f: A=>PoV[B]): PoV[B] = PoV{(i: Person) =>
    f(inter(i)).inter(i)
  }
}

object PoV {
  def apply[A](a: A): PoV[A] = PoV(_ => a)
}

case class Person(name: String)
case class Planet(name: String)

object Semantics {
  val reza = Person("Reza")
  val kim = Person("Kim")
  val octopus = Person("Octopus")
  val mj = Person("Mary Jane")
  val pp = Person("Peter Parker")
  val venus = Planet("Venus")
  val ms = Planet("Morning Star")
  val es = Planet("Evening Star")

  val Hesperus = PoV[Planet]{(p: Person) =>
    if (p == reza) es
    else venus
  }

  val Phosphorus = PoV[Planet]{ (p: Person) =>
    if (p == reza) ms
    else venus
  }


  def not(b: Boolean):Boolean = !b
  def but(p: Boolean, q: Boolean): Boolean = p && q
  def is[T](a: T, b: T): Boolean = a == b

  def punch(s: Person, o: Person): Boolean =
     (s==octopus && o == pp)

  def believe(s: Person)(pov: PoV[Boolean]): PoV[Boolean] = PoV(_ => pov.inter(s))


}