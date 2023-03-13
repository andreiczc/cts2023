package ro.ase.cts.lab3;

public class Class1 {
    public float Compute(int t, float p, int age) {
        float result = 0;
        float value = (age > 10) ? (float) 15 / 100 : (float) age / 100;
        if (t == 1) {
            result = p;
        } else if (t == 2) {
            result = (p - (0.1f * p)) - value * (p - (0.1f * p));
        } else if (t == 3) {
            result = (p - (0.25f * p)) - value * (p - (0.25f * p));
        } else if (t == 4) {
            result = (p - (0.35f * p)) - value * (p - (0.35f * p));
        }
        return result;
    }
}
