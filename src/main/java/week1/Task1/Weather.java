package week1.Task1;

public class Weather {
    private boolean isRaining;

    public Weather(boolean isRaining) {
        this.isRaining = isRaining;
    }

    public boolean isRaining() {
        return isRaining;
    }

    public void setRaining(boolean raining) {
        isRaining = raining;
    }
}