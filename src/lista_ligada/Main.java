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

		

	}

}
