package lista_ligada;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaLigada list = new ListaLigada();
		list.toAdd("AC");
		list.toAdd("BA");
		list.toAdd("CE");
		list.toAdd("DF");
		System.out.println("Size: " + list.getSize());
		System.out.println("first: " + list.getFirst().getValue());
		System.out.println(list.get(0).getValue());
		System.out.println(list.get(1).getValue());
		System.out.println(list.get(2).getValue());
		System.out.println(list.get(3).getValue());

		for (int i = 0; i < list.getSize(); i++) {
			System.out.println(list.get(i).getValue());
		}

		list.remove("DF");
		System.out.println("Removed DF");
		list.toAdd("SP");
		System.out.println("to add SP");
		list.remove("BA");
		list.remove("CE");
		list.remove("AC");
		list.remove("SP");

		System.out.println("Tamanho: " + list.getSize());
		
		for (int i = 0; i < list.getSize(); i++) {
			System.out.println(list.get(i).getValue());
		}

	}

}
