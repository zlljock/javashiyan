package lambda;

/**
 * 苹果类
 */
public class Apple {
     private String color;
     private int wight;
    public Apple(String color, int wight) {
        this.color = color;
        this.wight = wight;
    }
    public Apple(){}
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", wight=" + wight +
                '}';
    }

}
