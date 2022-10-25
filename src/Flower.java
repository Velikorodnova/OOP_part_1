public class Flower {

    private String flower;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String flower, String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }

        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

        if (cost >= 0) {
            this.cost = cost;
            if (cost <= 0) {
                this.cost = 1;
            }
        } else {
            this.cost = Math.abs(cost);
        }

        if (lifeSpan >= 0) {
            this.lifeSpan = lifeSpan;
            if (lifeSpan <= 0) {
                this.lifeSpan = 3;
            }
        } else {
            this.lifeSpan = (int) Math.abs(cost);
        }

        this.flower = flower;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = Math.abs(cost);
        }

    }

    public String toString() {
        return "Название - " + flower + ". Цвет - " + flowerColor + ". Страна происхождения - "
                + country + ". Стоимость - " + cost + ". Срок стояния - " + lifeSpan;
    }

}
