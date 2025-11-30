package h2;

public class H2_main {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2,4};
        int[] c = {1,3,2};
        int[] d = {1,2};
        int[] e = {1,2,3};
        boolean ergebnis = compareArrays(d,a);
        System.out.println(ergebnis);

    }
    public static boolean compareArrays(int[] a, int[] b) {
        int i = 0;
        if(a.length==b.length){
            while(i<a.length) {
                if(a[i]!=b[i]) {
                    return false;
                }
                return true;
            }
        }
        else {
            return false;
        }
    return false;
    }

}
