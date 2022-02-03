
import java.text.NumberFormat;
import java.util.Locale;

public class StringToInt {

	public static void main(String[] args) {
		Locale usa = new Locale("en", "US");

		System.out.println("Exemples of convert of variables in java language");
		System.out.println();

		String PrimitveValue = "100";
		Integer intValue = Integer.valueOf(PrimitveValue);

		int StringConvert = 100;
		String StringValue = String.valueOf(StringConvert);
		String other = NumberFormat.getInstance().format(StringConvert);

		String StringToDouble = "100.0";
		Double DoubleValue = Double.valueOf(StringToDouble);
		String other2 = NumberFormat.getInstance().format(DoubleValue);

		Long convert = 7725642631256l;
		String ConvertResult = "Texts Exemples" + " _ " + NumberFormat.getInstance(usa).format(convert);

		String TextTXT = "Long Number";
		String convertTl = NumberFormat.getInstance().format(convert);

		String[] stringList = new String[] { PrimitveValue, StringToDouble, TextTXT, ConvertResult, convertTl,
				StringToDouble, other2 };
		for (int i = 0; i < stringList.length; i++) {
			System.out.println("String literal array list: " + i + " _ " + stringList[i]);
		}

		int[] intList = new int[] { intValue, StringConvert };
		for (int i = 0; i < intList.length; i++) {
			System.out.println("Integer literal array list: " + i + " _ " + intList[i]);
		}

		System.out.println("Convert String to integer primitve value: " + intValue);
		System.out.println("Convert integer primitive value to string: " + StringValue);
		System.out.println("Convert double to string with 'NumberFormat': " + other);
		System.out.println("Convert String to double primitve value: " + DoubleValue);
		System.out.println("Convert Double wrapper class to string with 'NumberFormat': " + other2);
		System.out.println("Convert String to Long: " + ConvertResult);
		System.out.println("Convert String to Long: " + convertTl);
		System.out.println("With literal formatation: " + TextTXT + " _ " + convert);

	}

}
