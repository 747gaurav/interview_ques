import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
 * Question four int x, y , u, v
 * sum of two  fractions added x/y + u/v results in a/b
 * deduce a/b to indivisible form
 */
public class Solution {
    
	static String[] fractionSum(String[] str) {
		String[] ret  = new String[str.length];
		
        for(int i = 0; i < str.length; i++)
        {
        	String s = Solution.sum(str[i]);
        	ret[i] = s;
        }
        	
        return ret;
    }
	
	static String sum(String ip)
	{
		int firstDiv = ip.indexOf('/');
		int plus = ip.indexOf('+');
		int x=0, y=0, u=0, v=0;
		if(firstDiv != -1){
			if(plus != -1){
				if(firstDiv<plus)
				{
					x = Integer.parseInt(ip.substring(0, firstDiv));
					y = Integer.parseInt(ip.substring(firstDiv+1, plus));
					int secondDiv = ip.indexOf('/', plus);
					if(secondDiv != -1){
						String temp = ip.substring(plus+1, secondDiv);
						u = Integer.parseInt(temp);
						v = Integer.parseInt(ip.substring(secondDiv+1));
					}else{
						try{
							u = Integer.parseInt(ip.substring(plus+1));
						}catch(NumberFormatException e)
						{
							u=0;
						}
						v=1;
					}
				}else{
					try{
						x = Integer.parseInt(ip.substring(0,plus));
					}catch( NumberFormatException e)
					{
						x =0;
					}
					y = 1;
					u = Integer.parseInt(ip.substring(plus+1, firstDiv));
					v = Integer.parseInt(ip.substring(firstDiv+1));
				}
			}
			else{
				x= Integer.parseInt(ip);
				y=1;
				u=0;
				v=1;
			}
		}else{
			if(plus != -1){
				x= Integer.parseInt(ip.substring(0,plus));
				y=1;
				u = Integer.parseInt(ip.substring(plus+1));
				v=1;
			}else{
				x= Integer.parseInt(ip);
				y=1;
				u=0;
				v=1;
			}
		}

		//		int xv = x*v;
		//		int uy = u*y;
		int yv = y*v;
		int xvuy = (x*v)+(u*y);
		//		String  ret = xyuv+"/"+yv;
		int gcd = Solution.GCD(xvuy, yv);
		int a = xvuy/gcd;
		int b = yv/gcd;
		String ret = ""+a+"/"+b;

		return ret;
	}
	static int GCD(int a, int b)
	{
		if(b ==0)
			return a;
		return GCD(b, a%b);
	}
			
	
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
//        final String fileName = System.getenv("OUTPUT_PATH");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String[] res;
        
        int _str_size = 0;
        _str_size = Integer.parseInt(in.nextLine().trim());
        String[] _str = new String[_str_size];
        String _str_item;
        for(int _str_i = 0; _str_i < _str_size; _str_i++) {
            try {
                _str_item = in.nextLine();
            } catch (Exception e) {
                _str_item = null;
            }
            _str[_str_i] = _str_item;
        }
        
        res = fractionSum(_str);
        System.out.println(Arrays.toString(res));
/*        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }
        
        bw.close();
*/        
		
	//	System.out.println(Solution.sum("1+3/2"));
    }
}
