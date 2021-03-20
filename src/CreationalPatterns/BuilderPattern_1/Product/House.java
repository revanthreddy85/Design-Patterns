package CreationalPatterns.BuilderPattern_1.Product;

public class House {
    private String basement;
    private String interior;
    private String structure;
    private String roof;

    public void setBasement(String basement) {
        this.basement = basement;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "basement='" + basement + '\'' +
                ", interior='" + interior + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
