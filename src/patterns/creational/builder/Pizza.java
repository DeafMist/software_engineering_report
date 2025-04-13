package patterns.creational.builder;

class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    public void setDough(String dough) { this.dough = dough; }
    public void setSauce(String sauce) { this.sauce = sauce; }
    public void setTopping(String topping) { this.topping = topping; }

    public String toString() {
        return "Pizza with " + dough + " dough, " + sauce + " sauce and " + topping;
    }

    static class PizzaBuilder {
        private final Pizza pizza = new Pizza();

        public PizzaBuilder withDough(String dough) {
            pizza.setDough(dough);
            return this;
        }

        public PizzaBuilder withSauce(String sauce) {
            pizza.setSauce(sauce);
            return this;
        }

        public PizzaBuilder withTopping(String topping) {
            pizza.setTopping(topping);
            return this;
        }

        public Pizza build() {
            return pizza;
        }
    }
}

class Main {
    public static void main(String[] args) {
        /*
        Вместо
        Pizza pizza = new Pizza();
        pizza.setDough("thin");
        pizza.setSauce("tomato");
        pizza.setTopping("cheese");
         */
        Pizza pizza = new Pizza.PizzaBuilder()
            .withDough("thin")
            .withSauce("tomato")
            .withTopping("cheese")
            .build();
        System.out.println(pizza);
    }
}
