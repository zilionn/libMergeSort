package fernando.fatec.br.merge;

public class MergeSort {

	public MergeSort() {
		super();
	}
	
	public int[] mergeSort(int vet[], int ini, int fim) {
		if (ini < fim) {
			int meio = (ini + fim) / 2;
			mergeSort(vet, ini, meio);
			mergeSort(vet, meio + 1, fim);
			intercala(vet, ini, meio, fim);
		}
		return vet;
	}

	private void intercala(int[] vet, int ini, int meio, int fim) {
		int novoVetor[] = new int[vet.length];
		
		for(int i = ini ; i <= fim ; i ++) {
			novoVetor[i] = vet[i];
		}
		int esq = ini;
		int direita = meio + 1;
		
		for(int cont = ini ; cont <= fim ; cont++) {
			if (esq > meio) {
				vet[cont] = novoVetor[direita];
				direita++;
			} else if (direita > fim) {
				vet[cont] = novoVetor[esq];
				esq++;
			} else if (novoVetor[esq] < novoVetor[direita]) {
				vet[cont] = novoVetor[esq];
				esq++;
			} else {
				vet[cont] = novoVetor[direita];
				direita++;
			}
		}
		
	}

}
