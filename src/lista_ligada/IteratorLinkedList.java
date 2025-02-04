package lista_ligada;

public class IteratorLinkedList<TIPO> {
	private Elemento<TIPO> element;
	
	public IteratorLinkedList(Elemento<TIPO> current) {
		this.element = current;
	}

	public boolean asNext() {

		if (element.getNext() == null) {

			return false;
		} else {
			return true;
		}
	}
      public Elemento<TIPO>  getNext(){
    	  element = element.getNext();
    	  return element;
      }
}
