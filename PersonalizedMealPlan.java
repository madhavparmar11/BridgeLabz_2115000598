class MealPlan {
    int planId;
    MealPlan(int planId) {
        this.planId = planId;
    }
}

class VegetarianMeal extends MealPlan {
    VegetarianMeal(int planId) {
        super(planId);
    }
}

class VeganMeal extends MealPlan {
    VeganMeal(int planId) {
        super(planId);
    }
}

class KetoMeal extends MealPlan {
    KetoMeal(int planId) {
        super(planId);
    }
}

class Meal<T extends MealPlan> {
    T mealType;
    String name;
    
    Meal(T mealType, String name) {
        this.mealType = mealType;
        this.name = name;
    }
}

class MealGenerator {
    static <T extends Meal<?>> void generateMeal(T meal) {
        System.out.println(meal.name);
    }
}

public class PersonalizedMealPlan {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal(1), "Salad");
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal(2), "Smoothie");
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal(3), "Grilled Chicken");

        MealGenerator.generateMeal(vegMeal);
        MealGenerator.generateMeal(veganMeal);
        MealGenerator.generateMeal(ketoMeal);
    }
}
