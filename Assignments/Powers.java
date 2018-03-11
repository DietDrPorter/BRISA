 class Powers {
    public static final int n = 32;
    public static int base = 2;

    public static void main(String[] args) {
        for(int i = 0; i <= n; i++) {
            System.out.println(double powers());
        }
    }

    public static void powers(double power) {
        return Math.pow(base, n);
    }
}
