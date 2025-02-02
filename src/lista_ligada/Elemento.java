package lista_ligada;

public class Elemento {

	// elemento is node--
	private String value;
	private Elemento next;
	
	public Elemento(String newValue) {
		this.value = newValue;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Elemento getNext() {
		return next;
	}
	public void setNext(Elemento next) {
		this.next = next;
	}
	
	
}
