import java.util.Scanner;

public class CalculadorAreaPerimetroDoRetangulo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a medida da base do retangulo: ");
		double base = input.nextDouble();
		
		System.out.println("Digite a medida da altura do retangulo: ");
		double altura = input.nextDouble();
		
		double area = base * altura;
		double perimetro = 2 * (base + altura);
		
		System.out.println("A área do retângulo é: " + area);
		System.out.println("O perímetro do retângulo é: " + perimetro);

		input.close();
	}

}
