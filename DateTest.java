
public class DateTest {

	public static void main(String[] args) {
		Date dt1 = new Date(12,12,2012);
		System.out.println("Day :"+ dt1.getDay());
		System.out.println("Month :" + dt1.getMonth());
		System.out.println("Year :" + dt1.getYear());

		Date dt2 = new Date(01,03,2003);
		System.out.println("Day :"+ dt2.getDay());
		System.out.println("Month :" + dt2.getMonth());
		System.out.println("Year :" + dt2.getYear());
	}

}
