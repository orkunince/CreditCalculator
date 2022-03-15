
public class NeedCredit implements Credit {

	@Override
	public void calculate(int year, double price) {
		double total = 0;

		if (year == 1) {
			total = price * 1.21;
		} else if (year == 2) {
			total = price * 1.41;
		} else {
			System.out.println("Kredi sadece 1 veya 2 y�l olarak girilebilir.");
			return;
		}

		System.out.println("�htiya� kredisi " + year + " y�l i�in toplam �deme: " + total + " bin TL");

	}

}
