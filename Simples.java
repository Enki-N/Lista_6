class Simples{
	int inicializaArray ( int [] a , int v ){
		for (int i = 0; i < a.length; i++) a[i] = v;
		return a.length;
	}

	void imprimeArray ( int[] a ){
		for (int i = 0; i < a.length; i++) System.out.print(a[i] + "|");
		System.out.println(" ");
	}

	boolean estaNoArray ( int[] a , int v ){
		boolean resul = false;
		for(int i = 0; i < a.length; i++)
			if(a[i] == v) resul = true;
		return resul;
	}
}