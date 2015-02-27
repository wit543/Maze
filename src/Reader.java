import java.util.ArrayList;


public class Reader {
	public String[] stringToArray(String s){
		String[] out = new String[s.length()];
		for(int i=0;i<s.length();i++)
			out[i]=String.valueOf(s.charAt(i));
		return out;
	}
}
