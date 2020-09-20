package Test;

public class MegaBytesConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printMegaBytesAndKiloBytes(2500);
		prefixAgain("abXYabc", 1);
		prefixAgain("abXYabc", 2);
		prefixAgain("abXYabc", 3);
		atTheRateChar("abXYabc");
		atTheRateChar("a@ab.com");
		atTheRateChar("abc@gmail@ab.com");
		getSandwich("xxbreadjambreadyy");
		sameStarChar(" ");
		sameStarChar("xy*zzz");
		sameStarChar("*xa*az");
	}

	public static void printMegaBytesAndKiloBytes(int kilobytes) {
		if(kilobytes < 0) {
			System.out.println("Invalid Value");
		}else {
			int kiloToMegaBytes = (kilobytes/1024);
			int remainderKiloBytes = (kilobytes % 1024);
			System.out.println(kilobytes + " KB = " + kiloToMegaBytes + " MB and " + remainderKiloBytes + " KB");

		}
	}
	public static boolean prefixAgain(String str, int n) {
		String substr = str.substring(n);
		String pattern = str.substring(0, n);
		System.out.println(substr + " next " + pattern);
		return substr.contains(pattern);
	}
	public static String atTheRateChar(String str) {
		String result = "";
		for (int i=0; i<str.length(); i++){
			if(str.charAt(i) == '@') {
				result =  str.substring(i, str.length());
				//result =  str.
				//result +=  str.copyValueOf(str[i],str.length()-1 , str.length());
				//result +=  str.valueOf(str[i], str.length()-1 , str.length());
				//result +=  str.charAt(i);
				System.out.println(result);
				return result;
			}
		}
		return null;
	}
	public static String getSandwich(String str) {
		int fb = str.indexOf("bread");
		int lb = str.lastIndexOf("bread");
		System.out.println(fb + " " + lb);
		String sw = new String();
		if (fb >= 0 && lb > 0 && fb != lb){
			sw = str.substring(fb + 5,lb);
		}
		return sw;
	}

	public static boolean sameStarChar(String str) {
		for (int i=1; i<str.length()-1; i++) {
			if (str.charAt(i) == '*') {
				char s1 =str.charAt(i-1); 
				char s2 =str.charAt(i+1);
				System.out.println(s1  + " " + s2);
				if (str.charAt(i-1) != str.charAt(i+1)) { return false;

				}
			}

		}System.out.println(str.length() );
		return true;
	}

}  

