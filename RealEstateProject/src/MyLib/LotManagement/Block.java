package MyLib.LotManagement;

/**
 *
 * @author Angela
 */
public class Block {

   private int blockNum;
   private Lot[] lotArray;
   private static int maxLot = 20;

    public Block(int blockNum, Lot[] lotArray) {
        this.blockNum = blockNum;
        this.lotArray = lotArray;
    }

    public int getBlockNum() {
        return blockNum;
    }

    public Lot[] getLotArray() {
        return lotArray;
    }
    
    public static int getMaxLot() {
        return maxLot;
    }
    
}
