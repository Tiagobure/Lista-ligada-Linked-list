package lista_ligada;

import java.util.ArrayList;

public class Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaLigada<Integer> list = new ListaLigada<Integer>();

		ArrayList<Integer> vector = new ArrayList<Integer>();

		// Adicionar elementos
		int limite = 10000;
		long tempoInicial = System.currentTimeMillis();
		long tempoFinal;
		for (int i = 0; i < limite; i++) {
			vector.add(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("Adicionou " + limite + " elementos no vetor");
		System.out.println(tempoFinal - tempoInicial);

		tempoInicial = System.currentTimeMillis();
		for (int i = 0; i < limite; i++) {
			list.toAdd(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("\n\nAdicionou " + limite + " elementos na lista");
		System.out.println(tempoFinal - tempoInicial);

		// ler valores
		tempoInicial = System.currentTimeMillis();
		for (int i = 0; i < vector.size(); i++) {
			vector.get(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("\n\nTempo de leitura do vetor");
		System.out.println(tempoFinal - tempoInicial);

		tempoInicial = System.currentTimeMillis();
		IteratorLinkedList<Integer> iterator = list.getIterator();
		while (iterator.asNext()) {
			iterator.getNext();
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("\n\nTempo de leitura da lista");
		System.out.println(tempoFinal - tempoInicial);

	}

}
