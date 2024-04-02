/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib.LotManagement;

/**
 *
 * @author Angela
 */
public class Lot {
    private int lotNum;
    private final int lotSize;
    private Price price;
    private String lotStatus = "Available";
    
    public Lot(int lotNum, int lotSize, Price price) {
        this.lotNum = lotNum;
        this.lotSize = lotSize;
        this.price = price;
    }

    public int getLotNum() {
        return lotNum;
    }
    
    public int getLotSize() {
        return lotSize;
    }

    public Price getPrice() {
        return price;
    }

    public String getLotStatus() {
        return lotStatus;
    }

    public void setStatus(String lotStatus) {
        this.lotStatus = lotStatus;
    }
    
}
