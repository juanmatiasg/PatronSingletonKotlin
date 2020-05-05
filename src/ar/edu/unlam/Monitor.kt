package ar.edu.unlam

class Monitor(valor:String){

    companion object {
        var mMonitor: Monitor? = null

        fun getMonitor(): Monitor? {
            if (mMonitor == null) {
                mMonitor == Monitor("Monitor")
            }
            return mMonitor
        }

    }




}