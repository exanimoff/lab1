public class complex {
    private double r;
    private double i;

    public complex() {
        r = 0;
        i = 0;
    }

    public complex(double r_, double i_) {
        r = r_;
        i = i_;
    }

    public complex(complex c) {
        r = c.r;
        i = c.i;
    }

    public void SetReal(double r_) {
        r = r_;
    }


    public Double GetReal() {
        return r;
    }

    public void SetImag(double i_) {
        i = i_;
    }

    public Double GetImag() {
        return i;
    }

    public double abs() {
        return Math.sqrt(Math.pow(r, 2) + Math.pow(i, 2));
    }

    public complex add(complex rhs) {
        return new complex(r + rhs.r, i + rhs.i);
    }

    public complex sub(complex rhs) {
        return new complex(r - rhs.r, i - rhs.i);
    }

    public complex mul(complex rhs) {
        double r_ = r * rhs.r - i * rhs.i;
        double i_ = i * rhs.r + r * rhs.i;
        return new complex(r_, i_);
    }

    public void print() {
        System.out.println(abs() == 0 ? abs() : abs() + "*(" + r / abs() + '+' + i / abs() + "*i)");
    }
}
