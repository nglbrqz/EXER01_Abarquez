package MyLib.LotFactory;

import MyLib.LotFactory.ILotStatus;

/**
 *
 * @author Angela
 */
public class BuyLot implements ILotStatus{

    @Override
    public String generateStatus() {
        return "Pending Payment";
    }
    
}
