package printingnumbers;
import java.lang.*;
import java.math.BigDecimal;
public class Primitiva4 {

	public static void main(String[] args) {
        float x = 471.6956412f;
        BigDecimal result;
		int decimal_place = 5;
		BigDecimal bd_num = new BigDecimal(Float.toString(x));
        bd_num = bd_num.setScale(decimal_place, BigDecimal.ROUND_HALF_UP); 
		System.out.printf("Original number: %.7f\n",x);
        System.out.println("Rounded upto 4 decimal: "+bd_num);
  }


	}

