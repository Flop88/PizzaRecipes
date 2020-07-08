package ru.mvlikhachev.pizzarecipes;

public class PizzaRecipeItem {

    private int imageReesource;
    private String title;
    private String description;
    private String recipe;

    public PizzaRecipeItem(int imageReesource, String title, String description, String recipe) {
        this.imageReesource = imageReesource;
        this.title = title;
        this.description = description;
        this.recipe = recipe;
    }

    public int getImageReesource() {
        return imageReesource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getRecipe() {
        return recipe;
    }
}
