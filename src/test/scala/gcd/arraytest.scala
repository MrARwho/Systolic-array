package gcd
import chisel3._
import chisel3.util._
import chiseltest._ 
import org.scalatest.freespec.AnyFreeSpec

class arraytest extends AnyFreeSpec with ChiselScalatestTester {
  "Array Test" in {
    test(new array) { c =>
      val a1 = Seq(2,3)
      val a2 = Seq(4,0)
      val b1 = Seq(1,5)
      val b2 = Seq (6,4)
      
      c.io.veca(0).poke(2)
      c.io.veca(1).poke(0)
      c.io.vecb(0).poke(1)
      c.io.vecb(1).poke(0)

      c.clock.step(1)
      c.io.veca(0).poke(3)
      c.io.veca(1).poke(4)
      c.io.vecb(0).poke(6)
      c.io.vecb(1).poke(5)

      c.clock.step(1)
      c.io.veca(0).poke(0)
      c.io.veca(1).poke(0)
      c.io.vecb(0).poke(0)
      c.io.vecb(1).poke(4)

      c.clock.step(1)


    }
  }
}