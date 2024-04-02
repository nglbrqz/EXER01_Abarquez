package MyLib.LotFactory;

import MyLib.LotFactory.ILotStatus;

/**
 *
 * @author Angela
 */
public class PendingReservations implements ILotStatus{

    @Override
    public String generateStatus() {
        return "Pending Reservation";
    }
    
}
