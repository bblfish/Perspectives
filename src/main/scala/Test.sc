
import pov._
import pov.Semantics.{reza, _}

val prop = for {
  h <- Hesperus;
  p <- Phosphorus
} yield is(h,p)

val rb = believe(reza)(prop).map(not _)

rb.inter(octopus)

val wrong = for {
  h <- Hesperus
  p <- Phosphorus
  belief <- believe(reza)(PoV(is(h,p)))
} yield not(belief)

wrong.inter(octopus)