package PlayerPackage;

public class PlayerValue {
     int price;
     int weekin=0;
     int weekout=0;
     public void incWeekIn()
     {
    	 weekin++;
     }
     public void incWeekOut()
     {
    	 weekout++;
     }
     public void calcPrice()
     {
    	 int factor=(weekin-weekout)/3;
    	 price+=1*factor;
     }
     public int getPrice()
     {
    	 return price;
     }
     
     public void  setPrice(int n)
     {
    	 price=n;
     }
}
