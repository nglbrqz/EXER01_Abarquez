package MyLib.LotFactory;

import MyLib.LotFactory.ILotStatus;

/**
 *
 * @author Angela
 */
public class ConfirmReservations implements ILotStatus{

    @Override
    public String generateStatus() {
        return "Reserved";
    }
    
}
