public abstract class PizzaChain {
    private final String chainName;
    //kind of a factory method pattern
    public PizzaChain(String chainName) {
        this.chainName = chainName;
    }

    public String getChainName() {
        return chainName;
    }

    public PizzaBuilder getPizzaBuilder() {
        return new PizzaBuilder(chainName);
    }
}