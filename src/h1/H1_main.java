package h1;

public class H1_main {
    public static void main(String[] args) {
    int[] a = {1,2,3,4};
    int[] b = {4,3,2,1};
    int[] c = {2,4,6};
    int[] d = {6,4,9};
    boolean ergebnis = isMirrorArray(b,d);
    System.out.println(ergebnis);
    }
    public static boolean isMirrorArray(int[] a, int[] b)
    {

        int i = 0;
    int e = a.length - 1;
    int z = 0;
    boolean ne = true;
    if(a.length == b.length) {
        while (i < a.length) {
            if (a[i] != b[e]) {
                ne = false;
            }
            i++;
            e--;
        }
    }
    else {
        ne = false;
        }





    if(!ne) {
        return false;
    }
    else {
        return true;
    }



    }
}
