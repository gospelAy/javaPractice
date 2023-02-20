package Chapter4;

public class TabularOutPut {
    public static void main(String[] args) {
        System.out.println("N N2 N3 N4");
        for (int i = 1; i < 2; i++) {
            for (int j = 2; j <= 2; j++) {
                for (int k = 3; k <= 3; k++) {
                    for (int l = 4; l <= 4; l++) {
                        for (int m = 5; m <= 5; m++) {
                            System.out.println(i + " " + i + " " + i + " " + i);
                            System.out.println(j + " " + j * j + " " + j * j * j + " " + j * j * j * j);
                            System.out.println(k + " " + k * k + " " + k * k * k + " " + k * k * k * k);
                            System.out.println(l + " " + l * l + " " + l * l * l + " " + l * l * l * l);
                            System.out.println(m + " " + m * m + " " + m * m * m + " " + m * m * m * m);
                        }
                    }
                }
            }
        }
    }
}

