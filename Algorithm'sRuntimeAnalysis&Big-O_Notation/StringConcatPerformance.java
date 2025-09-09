
public class StringConcatPerformance {
    public static void main(String[] args) {
        int n = 100_000;

        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < n; i++) s += "a";
        System.out.println("String time: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("a");
        System.out.println("StringBuilder time: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) sbf.append("a");
        System.out.println("StringBuffer time: " + (System.nanoTime() - start) / 1_000_000.0 + " ms");
    }
}
