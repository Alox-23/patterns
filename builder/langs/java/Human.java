public class Human
{
    private String name;

    private Human(Builder builder)
    {
        this.name = builder.name;
    }

    public void sayHi()
    {
        System.out.println("Hello!! My name is " + this.name);
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static class Builder
    {
        private String name;

        public Builder name (String name)
        {
            this.name = name;
            return this;
        }

        public Human build()
        {
            return new Human(this);
        }
    }
}
