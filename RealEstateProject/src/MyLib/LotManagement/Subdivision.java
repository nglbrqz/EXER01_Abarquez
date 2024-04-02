package MyLib.LotManagement;

import MyLib.LotManagement.Block;

/**
 *
 * @author Angela
 */
public class Subdivision {
    private Block[] blockArray;
    private static int maxBlock = 5;

    public Subdivision(Block[] blockArray) {
        this.blockArray = blockArray;
    }

    public Block[] getBlockArray() {
        return blockArray;
    }

    public void setBlockArray(Block[] blockArray) {
        this.blockArray = blockArray;
    }

    public static int getMaxBlock() {
        return maxBlock;
    }
    
}
