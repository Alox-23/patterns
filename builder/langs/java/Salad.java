import java.util.Arrays;

public class Salad
{
    private String[] ingredients;
    public Salad add_meat()
    {
        this.ingredients = Arrays.copyOf(this.ingredients, this.ingredients.length + 1);
        this.ingredients[this.ingredients.length - 1] = "Meat";
        return this;
    }

    public Salad add_cat()
    {
        this.ingredients = Arrays.copyOf(this.ingredients, this.ingredients.length + 1);
        this.ingredients[this.ingredients.length - 1] = "Fried cat";
        return this;
    }

    public Salad add_rock()
    {
        this.ingredients = Arrays.copyOf(this.ingredients, this.ingredients.length + 1);
        this.ingredients[this.ingredients.length - 1] = "Rock";
        return this;
    }    

    public void eat()
    {
        for (int i = 0; i < this.ingredients.length; i += 1)
        {
            System.out.println("I have eaten: " + this.ingredients[i]);
        }
         
        System.out.println("I have eaten the salad!!");
    }
}
