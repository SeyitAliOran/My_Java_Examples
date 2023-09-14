package dersler.gun62_OopReview.ClassRelationShip.Aggregation;

public class Engine {
    private EnumEngine engineType;
    private int horsePower;

    public Engine(EnumEngine engineType, int horsePower) {
        this.engineType = engineType;
        this.horsePower = horsePower;
    }

    public EnumEngine getEngineType() {
        return engineType;
    }

    public void setEngineType(EnumEngine engineType) {
        this.engineType = engineType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineType=" + engineType +
                ", horsePower=" + horsePower +
                '}';
    }
}
