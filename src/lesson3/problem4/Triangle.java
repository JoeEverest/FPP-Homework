package lesson3.problem4;

public record Triangle(double length, double width) {
    public double computeArea(){
        return 0.5 * length * width;
    }
}
