package gcd
import chisel3 . _
import chisel3 . util . _

class array extends Module{
    val io = IO(new Bundle{
        val veca = Input(Vec(2,SInt(32.W)))
        val vecb = Input(Vec(2,SInt(32.W)))
        val a1out = Output(SInt(32.W))
        val a2out = Output(SInt(32.W))
        val b1out = Output(SInt(32.W))
        val b2out = Output(SInt(32.W))


    })

    val PE1 = Module(new PE)
    val PE2 = Module(new PE)
    val PE3 = Module(new PE)
    val PE4 = Module(new PE)

    PE1.io.N := io.vecb(0)
    PE1.io.M := io.veca(0)
    PE2.io.N := io.vecb(1)
    PE2.io.M := PE1.io.P
    PE3.io.N := PE1.io.Q
    PE3.io.M := io.veca(1)
    PE4.io.M := PE3.io.P
    PE4.io.N := PE2.io.Q

    io.a1out := PE1.io.R
    io.a2out := PE2.io.R
    io.b1out := PE3.io.R
    io.b2out := PE4.io.R

    
}
