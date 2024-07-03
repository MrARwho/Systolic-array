package gcd
import chisel3 . _
import chisel3 . util . _

class and extends Module{
    val io = IO(new Bundle{
        val in1 = Input(UInt(32.W))
        val in2 = Input(UInt(32.W))
        val Out = Output(UInt(32.W))
    }
    )

    io.Out := io.in1 & io.in2
}