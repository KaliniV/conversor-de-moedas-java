package modelos;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class Consulta {
	public Resultado moeda(String base_code, String target_code, double valor) {

		URI endereco = URI.create("https://v6.exchangerate-api.com/v6/19fbaeaa7baef1941f98f307/pair/" + base_code + "/"
				+ target_code + "/" + valor);
		HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();

		try {
			HttpResponse<String> response = HttpClient.newHttpClient().send(request,
					HttpResponse.BodyHandlers.ofString());
			return new Gson().fromJson(response.body(), Resultado.class);

		} catch (Exception e) {
			throw new RuntimeException("Endereco não encontrado");

		}

	}
}
