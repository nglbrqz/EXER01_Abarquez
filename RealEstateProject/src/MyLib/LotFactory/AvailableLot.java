package MyLib.LotFactory;

import MyLib.LotFactory.ILotStatus;

/**
 *
 * @author Angela
 */
public class AvailableLot implements ILotStatus{

    @Override
    public String generateStatus() {
        return "Available";
    }
}
