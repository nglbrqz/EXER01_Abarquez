package MyLib.LotFactory;

/**
 *
 * @author Angela
 */
public abstract class IFactory {
    public abstract ILotStatus setLotStatus(int choice);
    
    public ILotStatus doSomething(int ch)
    {
        ILotStatus lotStatus = setLotStatus(ch);
        return lotStatus;
    }
}
