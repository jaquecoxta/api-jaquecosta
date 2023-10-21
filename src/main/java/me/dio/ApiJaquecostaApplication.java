package me.dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiJaquecostaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiJaquecostaApplication.class, args);

		// JSON fornecido
		String json = "{" +
				"\"name\": \"Jaqueline\"," +
				"\"account\": {" +
				"\"number\": \"00000-0\"," +
				"\"agency\": \"0000\"," +
				"\"balance\": 1324.64," +
				"\"limit\": 1000.00" +
				"}," +
				"\"features\": [" +
				"{" +
				"\"icon\": \"URL\"," +
				"\"description\": \"Descrição da Feature\"" +
				"}" +
				"]," +
				"\"card\": {" +
				"\"number\": \"xxxx xxxx xxxx 0000\"," +
				"\"limit\": 1000.00" +
				"}," +
				"\"news\": [" +
				"{" +
				"\"icon\": \"URL\"," +
				"\"description\": \"Descrição da Novidade\"" +
				"}" +
				"]" +
				"}";

		// Imprimir o JSON
		System.out.println(json);
	}
}
