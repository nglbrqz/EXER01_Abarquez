package MyLib.LotFactory;

import MyLib.LotFactory.ILotStatus;

/**
 *
 * @author Angela
 */
public class ConfirmPayments implements ILotStatus{

    @Override
    public String generateStatus() {
        return "Sold";
    }
    
}
