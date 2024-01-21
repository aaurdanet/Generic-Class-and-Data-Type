
package cop2508;


public class GenericClassAndDataType {

	public static void main(String[] args) {
		String[] colors = { "Red", "Green", "Blue" };
		Integer[] numbers = { 1, 2, 3 };
		Double[] circleRadius = { 3.0, 5.9, 2.9 };
System.out.println("The min elemnt is :" + min(colors));
System.out.println("The min elemnt is :" + min(numbers));
System.out.println("The min elemnt is :" + min(circleRadius));
	}

	public static <E extends Comparable<E>> E min(E[] list) {// generic method
		E minElement = list[0];

		for (int i = 0; i < list.length; i++) {
			if (list[i].compareTo(minElement) < 0) {
				minElement = list[i];
			}

		}

		return minElement;
	}

}
