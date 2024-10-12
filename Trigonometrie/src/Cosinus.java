public class Cosinus implements Formula {

    private float a;
    private float b;
    private float c;


    public Cosinus() {

    }

    @Override
    public float compute(float a, float b, float c) {
        return a / c;
    }

}
