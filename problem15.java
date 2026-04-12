import java.util.*;

// Interface
interface MealPlan {
    String getPlanType();
}

// Subtypes
class VegetarianMeal implements MealPlan {
    public String getPlanType() {
        return "Vegetarian Meal";
    }
}

class VeganMeal implements MealPlan {
    public String getPlanType() {
        return "Vegan Meal";
    }
}

class KetoMeal implements MealPlan {
    public String getPlanType() {
        return "Keto Meal";
    }
}

class HighProteinMeal implements MealPlan {
    public String getPlanType() {
        return "High Protein Meal";
    }
}

// Generic class
class Meal<T extends MealPlan> {
    private T meal;

    void setMeal(T meal) {
        this.meal = meal;
    }

    T getMeal() {
        return meal;
    }
}

// Generic method
class MealGenerator {
    public static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println("Generated: " + meal.getPlanType());
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> m1 = new Meal<>();
        m1.setMeal(new VegetarianMeal());
        generateMeal(m1.getMeal());

        Meal<KetoMeal> m2 = new Meal<>();
        m2.setMeal(new KetoMeal());
        generateMeal(m2.getMeal());
    }
}