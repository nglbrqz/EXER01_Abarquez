package MyLib.LotFactory;

import MyLib.LotFactory.IFactory;

/**
 *
 * @author Angela
 */
public class ConcreteFactory extends IFactory{
    private ILotStatus lotStatus;
    
    @Override
    public ILotStatus setLotStatus(int choice) {
        switch (choice) {
            case 0:
                lotStatus = new AvailableLot();
                break;
            case 1:
                lotStatus = new PendingReservations();
                break;
            case 2:
                lotStatus = new BuyLot();
                break;
            case 3:
                lotStatus = new ConfirmReservations();
                break;
            case 4:
                lotStatus = new ConfirmPayments();
                break;
        }
        return lotStatus;
    }
}
