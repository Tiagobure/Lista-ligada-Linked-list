package lista_ligada;

public class Elemento<TIPO> {

	// elemento is node--
	private TIPO value;
	private Elemento<TIPO> next;
	
	public Elemento(TIPO newValue) {
		this.value = newValue;
	}
	public TIPO getValue() {
		return value;
	}
	public void setValue(TIPO value) {
		this.value = value;
	}
	public Elemento<TIPO> getNext() {
		return next;
	}
	public void setNext(Elemento<TIPO> next) {
		this.next = next;
	}
	
	
}
