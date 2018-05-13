class Exer_3{
	public static void main(String[] args){
		int[] array = new int[10];

		Simples S = new Simples();

		S.inicializaArray(array, 3);
		S.imprimeArray(array);
		S.estaNoArray(array, 5);
	}
}