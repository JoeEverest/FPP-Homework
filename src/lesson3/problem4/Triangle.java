package lesson3.problem4;

public record Triangle(double height, double base) {
    public double computeArea(){
        return 0.5 * height * base;
    }
}
