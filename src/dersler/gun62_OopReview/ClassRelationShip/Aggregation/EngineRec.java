package dersler.gun62_OopReview.ClassRelationShip.Aggregation;

public record EngineRec(EnumEngine type,int horsepower) {
    public EngineRec(EnumEngine type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "EngineRec{" +
                "type=" + type +
                ", horsepower=" + horsepower +
                '}';
    }
}
