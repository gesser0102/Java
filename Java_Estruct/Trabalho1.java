import javax.swing.*;

public class Trabalho1 {

	public static void main(String[] args) {

		String A[][] = new String[3][4];
		A[0][0] = "101";
		A[0][1] = "102";
		A[0][2] = "103";
		A[0][3] = "104";

		A[1][0] = "201";
		A[1][1] = "202";
		A[1][2] = "203";
		A[1][3] = "204";

		A[2][0] = "301";
		A[2][1] = "302";
		A[2][2] = "303";
		A[2][3] = "304";

		String D[][] = new String[3][4];
		D[0][0] = "Ricardo";
		D[0][1] = "Jo�o";
		D[0][2] = "Maria";
		D[0][3] = "Jos�";

		D[1][0] = "Julia";
		D[1][1] = "Marcos";
		D[1][2] = "Paulo";
		D[1][3] = "Pedro";

		D[2][0] = "Bruno";
		D[2][1] = "Isabela";
		D[2][2] = "Rafaela";
		D[2][3] = "Gabriel";

		double E[][] = new double[3][4];
		int i, j = 0;

		/*
		 * 1) Solicite ao usu�rio a leitura de eletricidade de cada apartamento,
		 * a mensagem que aparece para o usu�rio deve seguir o seguinte modelo:
		 * 
		 * "Ol� (nome do dono do apartamento), insira a leitura do seu
		 * apartamento (n�mero do apartamento): "
		 * 
		 * Os campos entre par�nteses devem ser substitu�dos pelos respectivos
		 * nomes e n�meros.
		 */

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {

				E[i][j] = Double.parseDouble(JOptionPane
						.showInputDialog("Ola " + D[i][j] + ", insira a leitura do seu apartamento " + A[i][j] + ":"));
			}
		}

		// 2) Mostre o gasto total do pr�dio em energia el�trica.

		double gasto_total = 0.0;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {

				gasto_total = gasto_total + E[i][j];
			}
		}
		JOptionPane.showMessageDialog(null, "O gasto total do pr�dio em energia el�trica �: " + gasto_total);

		// 3) M�dia do consumo de energia el�trica do pr�dio.

		double media_consumo = 0.0;

		media_consumo = gasto_total / 12;

		JOptionPane.showMessageDialog(null, "A m�dia do consumo de energia el�trica do pr�dio �: " + media_consumo);

		/*
		 * 4) Mostre o nome do morador que mais gasta e a leitura de energia do
		 * apartamento dele.
		 */

		double maior_c = 0.0;
		String morador = null;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				if (E[i][j] > maior_c) {
					maior_c = E[i][j];
					morador = "" + D[i][j];
				}
			}
		}

		JOptionPane.showMessageDialog(null,
				"O morador que mais gasta energia � " + morador + " seu consumo �: " + maior_c);

		/*
		 * 5) Mostre o n�mero do apartamento que menos gasta e a leitura de
		 * energia deste apartamento.
		 */

		double menor_c = 999999;
		String apto = null;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				if (E[i][j] < menor_c) {
					menor_c = E[i][j];
					apto = "" + A[i][j];
				}
			}
		}

		JOptionPane.showMessageDialog(null,
				"O apartamento que menos gasta energia � o " + apto + " seu consumo �: " + menor_c);

		/*
		 * 6) Solicite que o usu�rio informe o n�mero de 1 dos apartamento,
		 * mostre o nome do dono deste apartamento.
		 */

		String apt = null;
		apt = JOptionPane.showInputDialog("Digite o numero do apartamento");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				if (A[i][j].equalsIgnoreCase(apt)) {
					A[i][j] = apt;
					JOptionPane.showMessageDialog(null, "O dono do apartamento " + apt + " � o " + D[i][j]);

				}
			}
		}

		/*
		 * 7) Mostre todas as leituras de energia el�trica ordenadas. Para isso
		 * coloque todas as leituras em um novo vetor e ordene com o BubbleSort.
		 */

		double vetor[] = new double[12];
		int x = 0;
		String vetorfim = "";
		double aux, troca;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				vetor[x] = E[i][j];
				x++;
			}
		}

		troca = 1;

		while (troca == 1) {
			troca = 0;
			for (i = 0; i < 12 - 1; i++) {
				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					troca = 1;
				}

			}

		}

		for (i = 0; i < 12; i++) {
			vetorfim = vetorfim + vetor[i] + " : ";
		}

		JOptionPane.showMessageDialog(null, "Leituras Ordenadas: \n\n" + vetorfim);

		/*
		 * 8)Mostre a porce7ntagem do n�mero de apartamento em rela��o ao
		 * total(12 apartamentos), que gastam mais energia el�trica que a m�dia
		 * do pr�dio.
		 */
		double porcentagem = 0.0;
		int cont = 0;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				if (E[i][j] > media_consumo) {
					cont++;
				}
			}
		}

		porcentagem = (cont * 100) / 12;

		JOptionPane.showMessageDialog(null, "Porcentagem de apto que gastam mais que a m�dia �: " + porcentagem + "%");

		/*
		 * 9)Mostre o nome do morador que mais gasta no segundo andar e a
		 * leitura de energia el�trica de morador.
		 */

		double maior_segundo = 0.0;
		String mor = null;

		for (i = 1; i < 2; i++) {
			for (j = 0; j < 4; j++) {
				if (E[i][j] > maior_segundo) {
					maior_segundo = E[i][j];
					mor = "" + D[i][j];
				}
			}
		}

		JOptionPane.showMessageDialog(null,
				"Morador que mais gasta no segundo andar �: " + mor + "\n Sua leitura de energia �: " + maior_segundo);

		/*
		 * 10)Considerando os apartamento com final 3 (103,203,303), mostre o
		 * nome do dono do apartamento mais econ�mico e a leitura respectiva.
		 */

		double mais_e = 99999;
		String mora = null;

		for (i = 0; i < 3; i++) {
			for (j = 2; j < 3; j++) {
				if (E[i][j] < mais_e) {
					mais_e = E[i][j];
					mora = "" + D[i][j];
				}
			}
		}

		JOptionPane.showMessageDialog(null, "Dono: " + mora + "\n Leitura: " + mais_e);
	}
}