public class matrix {
    private final complex[][] mat;

    public matrix() {
        this(1, 1);
    }

    public matrix(int size_x, int size_y)throws NumberFormatException {
        if (size_x<1 | size_y<1)
            throw new NumberFormatException();
        mat = new complex[size_x][size_y];
        for (int i = 0; i < size_x; i++) {
            for (int j = 0; j < size_y; j++) {
                mat[i][j] = new complex();
            }
        }
    }

    public complex GetItem(int x, int y) throws IndexOutOfBoundsException {
        if (x < 0 | x > mat.length | y < 0 | y > mat[0].length)
            throw new IndexOutOfBoundsException();
        return new complex(mat[x][y]);
    }

    public void SetItem(int x, int y, complex item) throws IndexOutOfBoundsException {
        if (x < 0 | x > mat.length | y < 0 | y > mat[0].length)
            throw new IndexOutOfBoundsException();
        mat[x][y] = new complex(item);
    }

    public int GetSizeX() {
        return mat.length;
    }

    public int GetSizeY() {
        return mat[0].length;
    }

    public matrix add(matrix rhs) throws ArithmeticException {
        if (mat.length != rhs.mat.length | mat[0].length != rhs.mat[0].length)
            throw new ArithmeticException();
        matrix sum = new matrix(mat.length, mat[0].length);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                sum.mat[i][j] = new complex(mat[i][j].add(rhs.mat[i][j]));
            }
        }
        return sum;
    }

    public matrix mul(matrix rhs) throws ArithmeticException {
        if (mat[0].length != rhs.mat.length)
            throw new ArithmeticException();
        matrix mul = new matrix(mat.length, rhs.mat[0].length);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < rhs.mat[0].length; j++) {
                for (int k = 0; k < mat[0].length; k++) {
                    mul.mat[i][j] = mul.mat[i][j].add(mat[i][k].mul(rhs.mat[k][j]));
                }
            }
        }
        return mul;
    }

    public matrix transpose() {
        matrix t = new matrix(mat[0].length, mat.length);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                t.mat[j][i] = new complex(mat[i][j]);
            }
        }
        return t;
    }
}
