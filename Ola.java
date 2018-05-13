class Ola{
	int op;
	void cumprimentar(int op){
		switch(op){
			case 1:
				System.out.println("Olá!!");
				this.op = 0;
				break;
			case 2:
				System.out.println("Oii!!");
				this.op = 0;
				break;
			case 3:
				System.out.println("Tudo bem?");
				this.op = 0;
				break;
			default:
				System.out.println("O valor recebido não é valido!");
				this.op = 0;

		}
	}
}