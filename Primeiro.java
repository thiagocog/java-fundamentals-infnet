public class Primeiro {

	private static String name;
	private static String sobrenome;
	private static int idade;
	private static float income;
	private static boolean isJava;
	private static int tempoDeTrabalho;

	private static boolean validar(int arg) {
		boolean isValid = arg == 6;
  		return isValid;
	}

	private static int calcAnoDeNascimento(int idade) {
		int anoDeNascimento = 2022 - idade;
		return anoDeNascimento;
	}
	
	private static float calcTotalRecebido(float income, int tempoDeTrabalho) {
		float valorTotal = income * tempoDeTrabalho;
		return valorTotal;
	}
	
	private static String getEmployeeLevel(int idade) {
		String level = idade > 50 ? "Veterano" : "Iniciante";
		return level;
	}
	
	private static String getStatus(float income) {
		String status = income > 1000 ? "Estavel" : "Instavel";
		return status;
	}
	
	private static void tratarParametros(String[] parametros) {
		name = parametros[0];
		sobrenome = parametros[1];
		idade = Integer.valueOf(parametros[2]);
		income = Float.valueOf(parametros[3]);
		isJava = Boolean.valueOf(parametros[4]);
		tempoDeTrabalho = Integer.valueOf(parametros[5]);
	}

	private static void imprimirNoConsole() {		
		System.out.println("Name: " + name);
		System.out.println("Lastname: " + sobrenome);
		System.out.println("Age: " + idade);
		System.out.println("Ano de nascimento: " + calcAnoDeNascimento(idade));
		System.out.println("Nivel: " + getEmployeeLevel(idade));
		System.out.println("Income: " + income + " euros");
		System.out.println("Valor total: " + calcTotalRecebido(income, tempoDeTrabalho) + " euros");
		System.out.println("Java dev: " + isJava);
		System.out.println("Status: " + getStatus(income));
	}
	
	public static void main(String[] args) {
		
		int qntArgs = args.length;
		
		if(validar(qntArgs)) {

			// entrada
			tratarParametros(args);
			
			// saída
			imprimirNoConsole();

		} else {
			
			System.out.println("Quantidade de argumentos(" + qntArgs + ") incorreta");
			
		}
		
	}
}