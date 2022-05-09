package com.codercampus.ingaassignment9.web;

import com.codercampus.ingaassignment9.domain.Recipe;
import com.codercampus.ingaassignment9.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class FileController {

	 @Autowired
	 private RecipeService recipeService;

	 @GetMapping("/gluten-free")
	 public List<Recipe> readFileGlutenFree() throws IOException {
		  return recipeService.getGlutenFree();
	 }

	 @GetMapping("/vegan")
	 public List<Recipe> readFileVegan() throws IOException {
		  return recipeService.getVegan();
	 }

	 @GetMapping("/vegan-and-gluten-free")
	 public List<Recipe> readFileVeganGluten() throws IOException {
		  return recipeService.getVeganAndGlutenFree();
	 }

	 @GetMapping("/vegetarian")
	 public List<Recipe> readFileVegetarian() throws IOException {
		  return recipeService.getVegetarian();

	 }

	 @GetMapping("/all-recipes")
	 public List<Recipe> readFile() throws IOException {
		  return recipeService.getAllRecipes();
	 }
}

