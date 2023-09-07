class Dollar extends Money {
    private int amount = 10;

    Dollar(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }

}
