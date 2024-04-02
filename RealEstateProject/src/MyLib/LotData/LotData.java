package MyLib.LotData;

import MyLib.LotManagement.Block;
import MyLib.LotManagement.Block;
import MyLib.LotManagement.Lot;
import MyLib.LotManagement.Lot;
import MyLib.LotManagement.Price;
import MyLib.LotManagement.Price;
import MyLib.LotManagement.Subdivision;
import MyLib.LotManagement.Subdivision;

/**
 *
 * @author Angela
 */
public class LotData {
    private static LotData instance = new LotData();
    
    private LotData (){}

    public static LotData getInstance(){
      return instance;
   }
   
    Subdivision mySub = new Subdivision(new Block[]{new Block(1,new Lot[]{new Lot(1,150,new Price(2076000)),
                                                                        new Lot(2,100,new Price(900000)),
                                                                        new Lot(3,240,new Price(3200000)),
                                                                        new Lot(4,125,new Price(1730000)),
                                                                        new Lot(5,650,new Price(9000000)),
                                                                        new Lot(6,350,new Price(4855000)),
                                                                        new Lot(7,450,new Price(6700500)),
                                                                        new Lot(8,140,new Price(1905000)),
                                                                        new Lot(9,250,new Price(3400000)),
                                                                        new Lot(10,260,new Price(3590000)),
                                                                        new Lot(11,175,new Price(2310000)),
                                                                        new Lot(12,100,new Price(1230000)),
                                                                        new Lot(13,190,new Price(2630000)),
                                                                        new Lot(14,230,new Price(2300000)),
                                                                        new Lot(15,650,new Price(9500000)),
                                                                        new Lot(16,205,new Price(2800000)),
                                                                        new Lot(17,300,new Price(4050000)),
                                                                        new Lot(18,160,new Price(1200000)),
                                                                        new Lot(19,385,new Price(4232000)),
                                                                        new Lot(20,310,new Price(4290000))}),
                                                
                                                new Block(2,new Lot[]{new Lot(1,250,new Price(3600000)),
                                                                        new Lot(2,200,new Price(2790000)),
                                                                        new Lot(3,140,new Price(1900000)),
                                                                        new Lot(4,135,new Price(1865000)),
                                                                        new Lot(5,200,new Price(2760000)),
                                                                        new Lot(6,185,new Price(2500000)),
                                                                        new Lot(7,620,new Price(3400000)),
                                                                        new Lot(8,145,new Price(1200000)),
                                                                        new Lot(9,280,new Price(3870000)),
                                                                        new Lot(10,160,new Price(2215000)),
                                                                        new Lot(11,155,new Price(1100000)),
                                                                        new Lot(12,120,new Price(1661000)),
                                                                        new Lot(13,195,new Price(3690000)),
                                                                        new Lot(14,210,new Price(2907600)),
                                                                        new Lot(15,245,new Price(3384000)),
                                                                        new Lot(16,515,new Price(3975000)),
                                                                        new Lot(17,390,new Price(4010000)),
                                                                        new Lot(18,210,new Price(4900000)),
                                                                        new Lot(19,150,new Price(2076000)),
                                                                        new Lot(20,135,new Price(1860000))}),
                                                
                                                new Block(3,new Lot[]{new Lot(1,150,new Price(2076000)),
                                                                        new Lot(2,100,new Price(1384000)),
                                                                        new Lot(3,240,new Price(3320000)),
                                                                        new Lot(4,175,new Price(2423000)),
                                                                        new Lot(5,650,new Price(9000000)),
                                                                        new Lot(6,650,new Price(9000000)),
                                                                        new Lot(7,200,new Price(2760000)),
                                                                        new Lot(8,185,new Price(2500000)),
                                                                        new Lot(9,150,new Price(2075000)),
                                                                        new Lot(10,650,new Price(9050000)),
                                                                        new Lot(11,100,new Price(1380000)),
                                                                        new Lot(12,200,new Price(4769000)),
                                                                        new Lot(13,100,new Price(1380000)),
                                                                        new Lot(14,185,new Price(7600000)),
                                                                        new Lot(15, 220,new Price(3046000)),
                                                                        new Lot(16,320,new Price(4420000)),
                                                                        new Lot(17,650,new Price(9040000)),
                                                                        new Lot(18,320,new Price(8421500)),
                                                                        new Lot(19,150,new Price(2076000)),
                                                                        new Lot(20,145,new Price(9007000))}),
                                                
                                                new Block(4,new Lot[]{new Lot(1,320,new Price(4420000)),
                                                                        new Lot(2,300,new Price(4153000)),
                                                                        new Lot(3,190,new Price(7630000)),
                                                                        new Lot(4,185,new Price(2569000)),
                                                                        new Lot(5,300,new Price(4150000)),
                                                                        new Lot(6,285,new Price(3946000)),
                                                                        new Lot(7,320,new Price(4421000)),
                                                                        new Lot(8,145,new Price(6007000)),
                                                                        new Lot(9,280,new Price(3870000)),
                                                                        new Lot(10,160,new Price(2215000)),
                                                                        new Lot(11,155,new Price(2146000)),
                                                                        new Lot(12,120,new Price(1660000)),
                                                                        new Lot(13,495,new Price(9690000)),
                                                                        new Lot(14,210,new Price(2907000)),
                                                                        new Lot(15,245,new Price(3384000)),
                                                                        new Lot(16,215,new Price(2970000)),
                                                                        new Lot(17,290,new Price(3690000)),
                                                                        new Lot(18,210,new Price(8900000)),
                                                                        new Lot(19,150,new Price(5070000)),
                                                                        new Lot(20,135,new Price(1860000))}),
                                                
                                                new Block(5,new Lot[]{new Lot(1,300,new Price(2150000)),
                                                                        new Lot(2,230,new Price(8840000)),
                                                                        new Lot(3,140,new Price(5380000)),
                                                                        new Lot(4,175,new Price(6730000)),
                                                                        new Lot(5,290,new Price(4115000)),
                                                                        new Lot(6,265,new Price(1010000)),
                                                                        new Lot(7,320,new Price(1230000)),
                                                                        new Lot(8,225,new Price(8650000)),
                                                                        new Lot(9,450,new Price(6730000)),
                                                                        new Lot(10,310,new Price(1190000)),
                                                                        new Lot(11,340,new Price(2140000)),
                                                                        new Lot(12,230,new Price(8840000)),
                                                                        new Lot(13,155,new Price(5900000)),
                                                                        new Lot(14,210,new Price(8070000)),
                                                                        new Lot(15,235,new Price(1903000)),
                                                                        new Lot(16,405,new Price(6788000)),
                                                                        new Lot(17,275,new Price(3057000)),
                                                                        new Lot(18,210,new Price(8070000)),
                                                                        new Lot(19,190,new Price(5730000)),
                                                                        new Lot(20,160,new Price(1615000))})
            });

    public Subdivision getMySub() {
        return mySub;
    }
    
}