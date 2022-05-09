package com.codercampus.ingaassignment9.repository;

import com.codercampus.ingaassignment9.domain.Recipe;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Repository;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RecipeRepository {
	 public List<Recipe> readFile(String fileName) throws IOException {
	 	 List<Recipe> recipeList = new ArrayList<>();
		  Reader in = new FileReader(fileName);
		  Iterable<CSVRecord> records = CSVFormat.DEFAULT
				  .withIgnoreSurroundingSpaces()
				  .withHeader()
				  .withSkipHeaderRecord()
				  .parse(in);
		  for (CSVRecord record : records) {
				int cookingMinutes = Integer.parseInt(record.get("Cooking Minutes"));
				boolean dairyFree = Boolean.parseBoolean(record.get("Dairy Free"));
				boolean glutenFree = Boolean.parseBoolean(record.get("Gluten Free"));
				String instructions = record.get("Instructions");
				double preparationMinutes = Double.parseDouble(record.get("Preparation Minutes"));
				double pricePerServing = Double.parseDouble(record.get("Price Per Serving"));
				int readyInMinutes = Integer.parseInt(record.get("Ready In Minutes"));
				int servings = Integer.parseInt(record.get("Servings"));
				double spoonacularScore = Double.parseDouble(record.get("Spoonacular Score"));
				String title = record.get("Title");
				boolean vegan = Boolean.parseBoolean(record.get("Vegan"));
				boolean vegetarian = Boolean.parseBoolean(record.get("Vegetarian"));
				Recipe recipe = new Recipe();
				recipe.setCookingMinutes(cookingMinutes);
				recipe.setDairyFree(dairyFree);
				recipe.setGlutenFree(glutenFree);
				recipe.setInstructions(instructions);
				recipe.setPreparationMinutes(preparationMinutes);
				recipe.setPricePerServing(pricePerServing);
				recipe.setReadyInMinutes(readyInMinutes);
				recipe.setServings(servings);
				recipe.setSpoonacularScore(spoonacularScore);
				recipe.setTitle(title);
				recipe.setVegan(vegan);
				recipe.setVegetarian(vegetarian);
				recipeList.add(recipe);
		  }
		  return recipeList;
	 }
}
