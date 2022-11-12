package com.mediscreen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClients;

@SpringBootApplication
@ComponentScan(basePackages = "com.mediscreen")
public class NotesApplication {

	public static void main(String[] args) {
		ConnectionString connectionString = new ConnectionString("mongodb+srv://root:root@cluster0.3phmfu3.mongodb.net/?retryWrites=true&w=majority");
		MongoClientSettings settings = MongoClientSettings.builder()
		        .applyConnectionString(connectionString)
		        .serverApi(ServerApi.builder()
		            .version(ServerApiVersion.V1)
		            .build())
		        .build();
		MongoClients.create(settings);
		SpringApplication.run(NotesApplication.class, args);
	}

}
