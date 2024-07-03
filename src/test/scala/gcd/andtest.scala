package gcd
import chisel3._
import chisel3.util._
import chiseltest._ 
import org.scalatest.freespec.AnyFreeSpec

class andtest extends AnyFreeSpec with ChiselScalatestTester {
  "And Test" in {
    test(new and()) { c =>
        //val check = Seq(0,1)
        val num1 = Seq(0,6,4)
        val num2 = Seq(0,2,3)

        c.io.in1.poke(num1(0))
        c.io.in2.poke(num2(0))

        c.clock.step(1)
        c.io.in1.poke(num1(1))
        c.io.in2.poke(num2(1))

        c.clock.step(1)
        c.io.in1.poke(num1(2))
        c.io.in2.poke(num2(2))

        c.clock.step(1)


    }
}
}