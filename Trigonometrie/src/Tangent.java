public class Tangent implements Formula {

    private float a;
    private float b;
    private float c;

    public Tangent() {
    }

    public float compute(float a, float b, float c) {
        return b / a;
    }

}
