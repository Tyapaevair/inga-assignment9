package com.codercampus.ingaassignment9.service;

import com.codercampus.ingaassignment9.domain.Recipe;
import com.codercampus.ingaassignment9.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeService {
	 @Autowired
	 private RecipeRepository recipeRepository;

	 public List<Recipe> getAllRecipes() throws IOException {

		  return recipeRepository.readFile("recipes.txt");
	 }

	 public List<Recipe> getGlutenFree() throws IOException {
		  return recipeRepository.readFile("recipes.txt").stream()
				  .filter(Recipe::isGlutenFree)
				  .collect(Collectors.toList());
	 }

	 public List<Recipe> getVegan() throws IOException {
		  return recipeRepository.readFile("recipes.txt").stream()
				  .filter(Recipe::isVegan)
				  .collect(Collectors.toList());
	 }

	 public List<Recipe> getVeganAndGlutenFree() throws IOException {
		  return recipeRepository.readFile("recipes.txt").stream()
				  .filter(Recipe::isVegan)
				  .filter(Recipe::isGlutenFree)
				  .collect(Collectors.toList());
	 }

	 public List<Recipe> getVegetarian() throws IOException {
		  return recipeRepository.readFile("recipes.txt").stream()
				  .filter(Recipe::isVegetarian)
				  .collect(Collectors.toList());
	 }
}