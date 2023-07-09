package ua.ostr_1;

public class Main {

	public static void main(String[] args) {

		Integer[] array = { 22, 1, 3, 87, 33, 10, 17, -3, -7, -24 };

		Collection collection = new Collection(array);

		System.out.println("Виводимо на екран масив від початку до кінця, замінюючи непарні елементи на null:");
		Iterator iteratorForward = collection.createForwardIterator();

		while (iteratorForward.hasNext()) {
			Integer next = iteratorForward.next();

			if (next % 2 != 0) {
				System.out.println("null");
			} else
				System.out.println(next);
		}

		System.out.println();

		System.out.println("Виводимо на екран масив через один елемент від кінця до початку:");
		Iterator iteratorBackward = collection.createBackwardIterator();

		while (iteratorBackward.hasNext()) {
			Integer next = iteratorBackward.next();

			System.out.println(next);
		}

	}

}
