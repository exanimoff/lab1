import java.util.Scanner;
public class Main {
    public static void main(String[] args
    ) {
        Scanner s = new Scanner(System.in);
        complex a = new complex(1, -2), b = new complex(2, 3);
        a.sub(b).print();
        matrix m = new matrix(2, 3);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                m.SetItem(i, j, new complex(s.nextDouble(), 0));
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                m.add(m).GetItem(i, j).print();
            }
        }
        System.out.println();
        matrix m1 = m.mul(m.transpose());
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m1.GetItem(i, j).print();
            }
        }
    }
}