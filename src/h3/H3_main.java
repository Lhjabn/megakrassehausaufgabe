package h3;

public class H3_main {
    public static void main(String[] args) {
    int[] a = {1,2,3};
    int[] b = {1,2,4};
    int[] c = {1,3,2};
    int[] d = {1,2};
    int[] e = {1,2,3};
    int[] f = {1,1,2};
    boolean ergebnis = compareArraysVal(a,c);
    System.out.println(ergebnis);
    }
    public static boolean compareArraysVal(int[] a, int[] b) {
        int wieoft1 = 0;
        int wieoft2 = 0;
        int k = 0;
        int f = 0;
        int l = 0;
        int g = 0;
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            f = a[i];


            for (k = 0; k < a.length; k++) {
                if (a[k] == f) {
                    wieoft1++;
                }
            }

            for (l = 0; l < b.length; l++) {
                if (b[l] == f) {
                    wieoft2++;
                }
            }
            if (wieoft1 != wieoft2) {
                return false;
            }

        }
        return true;
    }
    }


