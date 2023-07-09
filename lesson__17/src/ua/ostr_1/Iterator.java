package ua.ostr_1;

public interface Iterator {
	boolean hasNext();

	Integer next();
}

class Collection {
	private static Integer[] array;

	Collection(Integer[] array) {
		Collection.array = array;
	}

	public class ForwardIterator implements Iterator {

		private int i = 0;

		@Override
		public boolean hasNext() {
			return i < array.length;
		}

		@Override
		public Integer next() {
			return array[i++];
		}
	}

	public ForwardIterator createForwardIterator() {
		return new ForwardIterator();
	}

	public class BackwardIterator implements Iterator {

		private int i = array.length - 1;

		@Override
		public boolean hasNext() {
			return i >= 0;
		}

		@Override
		public Integer next() {
			i = i - 2;
			return array[i + 2];
		}
	}

	public BackwardIterator createBackwardIterator() {
		return new BackwardIterator();
	}
}
