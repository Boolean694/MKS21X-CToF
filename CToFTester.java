public class CtoFTester {
	public double celsiusToFahrenheit(double deg) {
		return (deg * 9) / 5 + 32;
	}
	public double fahrenheitToCelsius(double deg) {
		return (deg - 32) * 5 / 9;
	}
	public static void main(String args[]) {
		System.out.println(fahrenheitToCelsius(86.0));
		System.out.println(celsiusToFahrenheit(30.0));
	}
}