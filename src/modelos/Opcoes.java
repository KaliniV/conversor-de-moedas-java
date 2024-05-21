package modelos;

public class Opcoes {
	public Opcoes() {
		// TODO Stub de construtor gerado automaticamente
	}

	public void menu() {

		System.out.println("Seja bem vindo/a ao conversor de moedas! ");
		System.out.print(
				"|---------------------------------------------------------------------------------------------------------------|\n");
		System.out.print(
				"| 1)  Dólar americano(USD) ->> Peso Argentino(ARS)       2)  Dólar americano(USD) ->> Peso Colombiano(COP)       \n");
		System.out.print(
				"| 3)  Dólar americano(USD) ->> Peso Chileno(CLP)         4)  Dólar americano(USD) ->> Euro (EUR)      		 \n");
		System.out.print(
				"| 5)  Dólar americano(USD) ->> Real Brasileiro(BRL)      6)  Peso Argentino(ARS) ->> Dólar americano(USD) \n");

		System.out.print(
				"| 7)  Peso Argentino(ARS) ->> Peso Colombiano(COP)       8)  Peso Argentino(ARS) ->> Peso Chileno(CLP)  \n");
		System.out.print(
				"| 9)  Peso Argentino(ARS) ->> Euro (EUR)       	        10) Peso Argentino(ARS) ->> Real Brasileiro(BRL) \n");

		System.out.print(
				"| 11) Peso Colombiano(COP)  ->> Dólar americano(USD) 	12) Peso Colombiano(COP)  ->> Peso Argentino(ARS)\n");
		System.out.print(
				"| 13) Peso Colombiano(COP)  ->> Peso Chileno(CLP)       14) Peso Colombiano(COP)  ->> Euro (EUR) \n");
		System.out.print(
				"| 15) Peso Colombiano(COP)  ->> Real Brasileiro(BRL)    16) Peso Chileno(CLP) ->> Dólar americano(USD)\n");

		System.out.print(
				"| 17) Peso Chileno(CLP) ->> Peso Argentino(ARS)         18) Peso Chileno(CLP) ->> Peso Colombiano(COP) \n");
		System.out.print(
				"| 19) Peso Chileno(CLP) ->> Euro (EUR)                  20) Peso Chileno(CLP) ->> Real Brasileiro(BRL) \n");

		System.out.print(
				"| 21) Euro (EUR) ->> Dólar americano(USD)    		22) Euro (EUR) ->> Peso Argentino(ARS)   \n");
		System.out
				.print("| 23) Euro (EUR) ->> Peso Colombiano(COP)  	        24) Euro (EUR) ->> Peso Chileno(CLP) \n");
		System.out.print(
				"| 25) Euro (EUR) ->> Real Brasileiro(BRL)    	        26) Real Brasileiro(BRL) =>> Dólar americano(USD)       \n");

		System.out.print(
				"| 27) Real Brasileiro(BRL) =>> Peso Argentino(ARS)      28) Real Brasileiro(BRL) =>> Peso Colombiano(COP)\n");
		System.out.print(
				"| 29) Real Brasileiro(BRL) =>> Peso Chileno(CLP)        30) Real Brasileiro(BRL) =>> Euro (EUR) \n");
		System.out.println("| 0) Sair!       	 ");
		System.out.print(
				"|---------------------------------------------------------------------------------------------------------------|\n");

	}

	public Opcoes(int opcao, double valor) {
		Consulta consulta = new Consulta();
		// USD
		if (opcao == 1) {
			String primeiro = "USD";
			String segundo = "ARS";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {USD} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {ARS}");
		}

		else if (opcao == 2) {
			String primeiro = "USD";
			String segundo = "COP";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {USD} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {COP}");
		}

		else if (opcao == 3) {
			String primeiro = "USD";
			String segundo = "CLP";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {USD} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {CLP}");
		}

		else if (opcao == 4) {
			String primeiro = "USD";
			String segundo = "EUR";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {USD} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {EUR}");
		} else if (opcao == 5) {
			String primeiro = "USD";
			String segundo = "BRL";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {USD} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {BRL}");
		}
		// ARS
		if (opcao == 6) {
			String primeiro = "ARS";
			String segundo = "USD";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {ARS} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {USD}");
		}

		else if (opcao == 7) {
			String primeiro = "ARS";
			String segundo = "COP";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {ARS} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {COP}");
		}

		else if (opcao == 8) {
			String primeiro = "ARS";
			String segundo = "CLP";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);
			System.out.println("Valor " + valor + " {ARS} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {CLP}");
		}

		else if (opcao == 9) {
			String primeiro = "ARS";
			String segundo = "EUR";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);
			System.out.println("Valor " + valor + " {ARS} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {EUR}");

		} else if (opcao == 10) {
			String primeiro = "ARS";
			String segundo = "BRL";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);
			System.out.println("Valor " + valor + " {ARS} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {BRL}");
		}
		// COP
		if (opcao == 11) {
			String primeiro = "COP";
			String segundo = "USD";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {COP} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {USD}");
		}

		else if (opcao == 12) {
			String primeiro = "COP";
			String segundo = "ARS";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {COP} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {ARS}");
		}

		else if (opcao == 13) {
			String primeiro = "COP";
			String segundo = "CLP";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {COP} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {CLP}");
		}

		else if (opcao == 14) {
			String primeiro = "COP";
			String segundo = "EUR";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {COP} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {EUR}");
		} else if (opcao == 15) {
			String primeiro = "COP";
			String segundo = "BRL";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {ARS} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {BRL}");
		}
		// CLP
		if (opcao == 16) {
			String primeiro = "CLP";
			String segundo = "USD";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {CLP} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {USD}");
		}

		else if (opcao == 17) {
			String primeiro = "CLP";
			String segundo = "ARS";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {CLP} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {ARS}");
		}

		else if (opcao == 18) {
			String primeiro = "CLP";
			String segundo = "COP";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {CLP} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {COP}");
		}

		else if (opcao == 19) {
			String primeiro = "CLP";
			String segundo = "EUR";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {CLP} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {EUR}");

		} else if (opcao == 20) {
			String primeiro = "CLP";
			String segundo = "BRL";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {CLP} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {BRL}");
		}

		// EUR
		if (opcao == 21) {
			String primeiro = "BRL";
			String segundo = "USD";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {BRL} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {USD}");
		}

		else if (opcao == 22) {
			String primeiro = "BRL";
			String segundo = "ARS";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {BRL} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {ARS}");
		}

		else if (opcao == 23) {
			String primeiro = "BRL";
			String segundo = "COP";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {BRL} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {COP}");
		}

		else if (opcao == 24) {
			String primeiro = "EUR";
			String segundo = "CLP";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {EUR} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {CLP}");

		} else if (opcao == 25) {
			String primeiro = "EUR";
			String segundo = "BRL";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {EUR} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {BRL}");
		}
		// BRL
		if (opcao == 26) {
			String primeiro = "BRL";
			String segundo = "USD";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {BRL} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {USD}");
		}

		else if (opcao == 27) {
			String primeiro = "BRL";
			String segundo = "ARS";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {BRL} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {ARS}");
		}

		else if (opcao == 28) {
			String primeiro = "BRL";
			String segundo = "COP";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {BRL} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {COP}");
		}

		else if (opcao == 29) {
			String primeiro = "BRL";
			String segundo = "CLP";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {BRL} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {CLP}");

		} else if (opcao == 30) {
			String primeiro = "BRL";
			String segundo = "EUR";
			Resultado resultado = consulta.moeda(primeiro, segundo, valor);

			System.out.println("Valor " + valor + " {BRL} " + "Corresponde ao valor final de ->> "
					+ resultado.conversion_result() + " {EUR}");
		}
	
	}
}
