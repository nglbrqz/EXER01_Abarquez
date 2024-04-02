package MyLib.LotData;

/**
 *
 * @author Angela
 */
public class Log {
    
    private static Log instance = new Log();
    public int totalPendingReservations = 0;
    public int totalPendingPayments = 0;
    public int totalReserved = 0;
    public int totalSold = 0;
    
    private Log(){}

    public static Log getInstance(){
      return instance;
   }

    //for pending reservations of lots
    public void addPendingReservations(){
        totalPendingReservations += 1;
    }
    public void subPendingReservations(){
        totalPendingReservations -= 1;
    }
    
    //for reserved lots
    public void addReserved(){
        totalReserved += 1;
    }
    public void subReserved(){
        totalReserved -= 1;
    }
    
    //for pending payments of lots to be bought
    public void addPendingPayments(){
        totalPendingPayments += 1;
    }
    public void subPendingPayments(){
        totalPendingPayments -= 1;
    }
    
    //for sold lots
    public void addSold(){
        totalSold += 1;
    }   
    public void subSold(){
        totalSold -= 1;
    } 
}
