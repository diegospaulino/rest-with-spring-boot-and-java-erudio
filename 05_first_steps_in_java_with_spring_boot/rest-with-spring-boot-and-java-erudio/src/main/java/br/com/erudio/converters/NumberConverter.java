package br.com.erudio.converters;

public class NumberConverter {

	public static Double convertToDouble(String strNumber) {
		String number = "";
		if(strNumber == null) {
			return 0D;
		}
		else {
			number = strNumber.replaceAll(",", ".");
		}
		
		if(isNumeric(number)) {
			return Double.parseDouble(number);
		}
		else {
			return 0D;
		}
	}

	public static boolean isNumeric(String strNumber) {
		String number = "";
		if(strNumber == null) {
			return Boolean.FALSE;
		}
		else {
			number = strNumber.replaceAll(",", ".");
			return number.matches("[-+]?[0-9]*\\.?[0-9]+");
		}
	}
}
