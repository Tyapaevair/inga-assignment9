package com.codercampus.ingaassignment9.domain;

public class Recipe {

	 private int cookingMinutes;

	 private boolean dairyFree;

	 private boolean glutenFree;

	 private String instructions;

	 private double preparationMinutes;

	 private double pricePerServing;

	 private int readyInMinutes;

	 private Integer servings;

	 private double spoonacularScore;

	 private String title;

	 private boolean vegan;

	 private boolean vegetarian;

	 public int getCookingMinutes() {
		  return cookingMinutes;
	 }

	 public void setCookingMinutes(int cookingMinutes) {
		  this.cookingMinutes = cookingMinutes;
	 }

	 public boolean isDairyFree() {
		  return dairyFree;
	 }

	 public void setDairyFree(boolean dairyFree) {
		  this.dairyFree = dairyFree;
	 }

	 public boolean isGlutenFree() {
		  return glutenFree;
	 }

	 public void setGlutenFree(boolean glutenFree) {
		  this.glutenFree = glutenFree;
	 }

	 public String getInstructions() {
		  return instructions;
	 }

	 public void setInstructions(String instructions) {
		  this.instructions = instructions;
	 }

	 public double getPreparationMinutes() {
		  return preparationMinutes;
	 }

	 public void setPreparationMinutes(double preparationMinutes) {
		  this.preparationMinutes = preparationMinutes;
	 }

	 public double getPricePerServing() {
		  return pricePerServing;
	 }

	 public void setPricePerServing(double pricePerServing) {
		  this.pricePerServing = pricePerServing;
	 }

	 public int getReadyInMinutes() {
		  return readyInMinutes;
	 }

	 public void setReadyInMinutes(int readyInMinutes) {
		  this.readyInMinutes = readyInMinutes;
	 }

	 public Integer getServings() {
		  return servings;
	 }

	 public void setServings(Integer servings) {
		  this.servings = servings;
	 }

	 public double getSpoonacularScore() {
		  return spoonacularScore;
	 }

	 public void setSpoonacularScore(double spoonacularScore) {
		  this.spoonacularScore = spoonacularScore;
	 }

	 public String getTitle() {
		  return title;
	 }

	 public void setTitle(String title) {
		  this.title = title;
	 }

	 public boolean isVegan() {
		  return vegan;
	 }

	 public void setVegan(boolean vegan) {
		  this.vegan = vegan;
	 }

	 public boolean isVegetarian() {
		  return vegetarian;
	 }

	 public void setVegetarian(boolean vegetarian) {
		  this.vegetarian = vegetarian;
	 }
}