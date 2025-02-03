package lista_ligada;

public class ListaLigada {

	private Elemento first;
	private Elemento last;
	private int size;

	public ListaLigada() {
		this.size = 0; // quando criar a lista o tamanho é zero
	}

	public Elemento getFirst() {
		return first;
	}

	public void setFirst(Elemento first) {
		this.first = first;
	}

	public Elemento getLast() {
		return last;
	}

	public void setLast(Elemento last) {
		this.last = last;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void toAdd(String newValue) {
		Elemento newElement = new Elemento(newValue);
		if (first == null && last == null) {
			this.first = newElement;
			this.last = newElement;

		} else {
			this.last.setNext(newElement);
			this.last = newElement;

		}
		this.size++;
	}

	public void remove(String valueSought) {
		Elemento previus = null;
		Elemento current = this.first;

		for (int i = 0; i < this.getSize(); i++) {

			if (current.getValue().equalsIgnoreCase(valueSought)) {
				if (this.size == 1) {
					this.first = null;
					this.last = null;
				} else if (current == first) {

					this.first = current.getNext();
					current.setNext(null);
				} else if (current == last) {

					this.last = previus;
					previus.setNext(null);
				} else {

					previus.setNext(current.getNext());
					current = null;
				}
				this.size--;
				break;
			}
			previus = current;
			current = current.getNext();
		}

	}

	public Elemento get(int position) {

		Elemento current = this.first;
		for (int i = 0; i < position; i++) {
			if (current.getNext() != null) {
				current = current.getNext();
			}

		}
		return current;
	}

}
