package com.coderscampus.assingnment13;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

@SpringBootApplication
public class Assingnment9Application {

	 public static void main(String[] args) throws IOException {
		  SpringApplication.run(Assingnment9Application.class, args);

		  Reader in = new FileReader("recipes.txt");
		  Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
		  for (CSVRecord record : records) {
				String lastName = record.get("Last Name");
				String firstName = record.get("First Name");
		  }

	 }


}