public enum Language {
    PI(3.14,"это число расчётное.....");

    private double value;
    private String description;

    Language(double value,String description) {
        this.value = value;
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public String getDescription(){
        return description;
    }

}
