package gcd
import chisel3 . _
import chisel3 . util . _

class PE extends Module {
    val io = IO (new Bundle{
        val N = Input(SInt(32.W))
        val M = Input(SInt(32.W))
        val P = Output(SInt(32.W))
        val Q = Output(SInt(32.W))
        val R = Output(SInt(32.W))
        
    })
    val R = RegInit(0.S(32.W))

    val stallN = RegInit(0.S(32.W))
    val stallM = RegInit(0.S(32.W))

    stallM := io.M
    stallN := io.N

    io.Q := stallN
    io.P := stallM
    R := (R + (io.M*io.N))
    io.R := R


}
