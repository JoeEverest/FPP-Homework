package lesson3.problem4;

public record Circle(double radius) {
    public double computeArea(){
        return Math.PI * radius * radius;
    }
}
