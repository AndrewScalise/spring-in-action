package flacostacos.tacocloud.model.dao;

import flacostacos.tacocloud.model.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
