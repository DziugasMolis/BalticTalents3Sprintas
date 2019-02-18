package java17.Butai;

public class Kriterijai {
    private Integer minKambariuSkaicius;
    private Integer maxKambariuSkaicius;
    private Double minKvadratai;
    private Double maxKvadratai;
    private Double minKaina;
    private Double maxKaina;

    public Kriterijai(Integer minKambariuSkaicius, Integer maxKambariuSkaicius, Double minKvadratai, Double maxKvadratai, Double minKaina, Double maxKaina) {
        this.minKambariuSkaicius = minKambariuSkaicius;
        this.maxKambariuSkaicius = maxKambariuSkaicius;
        this.minKvadratai = minKvadratai;
        this.maxKvadratai = maxKvadratai;
        this.minKaina = minKaina;
        this.maxKaina = maxKaina;
    }

    public Integer getMinKambariuSkaicius() {
        return minKambariuSkaicius;
    }

    public void setMinKambariuSkaicius(Integer minKambariuSkaicius) {
        this.minKambariuSkaicius = minKambariuSkaicius;
    }

    public Integer getMaxKambariuSkaicius() {
        return maxKambariuSkaicius;
    }

    public void setMaxKambariuSkaicius(Integer maxKambariuSkaicius) {
        this.maxKambariuSkaicius = maxKambariuSkaicius;
    }

    public Double getMinKvadratai() {
        return minKvadratai;
    }

    public void setMinKvadratai(Double minKvadratai) {
        this.minKvadratai = minKvadratai;
    }

    public Double getMaxKvadratai() {
        return maxKvadratai;
    }

    public void setMaxKvadratai(Double maxKvadratai) {
        this.maxKvadratai = maxKvadratai;
    }

    public Double getMinKaina() {
        return minKaina;
    }

    public void setMinKaina(Double minKaina) {
        this.minKaina = minKaina;
    }

    public Double getMaxKaina() {
        return maxKaina;
    }

    public void setMaxKaina(Double maxKaina) {
        this.maxKaina = maxKaina;
    }
}

