package ar.edu.unlam.singletonJava

import ar.edu.unlam.singletonJava.MonitorSingleton

class MonitorSingleton private constructor(){

    companion object {
        private var mMonitor:MonitorSingleton?=null

        fun getInstance(): MonitorSingleton? {
            if(mMonitor==null){
                mMonitor=MonitorSingleton()
            }
            return mMonitor
        }
    }
}

fun main (){
    val monitor1 = MonitorSingleton.getInstance()
    val monitor2 = MonitorSingleton.getInstance()

    println(monitor1.hashCode())
    println(monitor2.hashCode())

    println(monitor1.toString())
    println(monitor2.toString())
}