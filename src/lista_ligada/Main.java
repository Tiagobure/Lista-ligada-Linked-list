package lista_ligada;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaLigada<Integer> list = new ListaLigada<Integer>();
		list.toAdd(1);
		list.toAdd(2);
		list.toAdd(3);
		list.toAdd(4);
		System.out.println("Size: " + list.getSize());
		System.out.println("first: " + list.getFirst().getValue());
		System.out.println("Last: "  + list.getLast().getValue());
		for (int i = 0; i < list.getSize(); i++) {
			System.out.println(list.get(i).getValue());
		}

		list.remove(4);
		System.out.println("Removed 4");
		list.toAdd(5);
		System.out.println("to add 5");
		list.remove(1);
		list.remove(2);
		list.remove(3);
		list.remove(5);
		list.toAdd(6);

		System.out.println("Size: " + list.getSize());
		
		for (int i = 0; i < list.getSize(); i++) {
			System.out.println(list.get(i).getValue());
		}

	}

}
