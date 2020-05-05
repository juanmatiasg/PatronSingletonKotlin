package ar.edu.unlam

class Main {
    fun main(args: Array<String>) {
        val monitor1 = Monitor.getMonitor()
        val monitor2 = Monitor.getMonitor()

        println(monitor1.hashCode())
        println(monitor2.hashCode())
    }
}