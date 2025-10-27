public enum Dandeh {
    MANUAL("Dasti", "دستی"),
    AUTOMATIC("otomatic", "اتوماتیک");

    private final String toPersian;
    private final String toPersian2;

    Dandeh (String toPersian, String toPersian2) {
        this.toPersian = toPersian;
        this.toPersian2 = toPersian2;
    }

    public static void print () {
        Dandeh[] values = Dandeh.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }

    public static void print_fa () {
        Dandeh[] values = Dandeh.values();
        for (int i = 0; i < values.length; i++) {
            Dandeh value = values[i];
            System.out.println(value.toPersian);
        }
    }

    public static void print_fa2 () {
        Dandeh[] values = Dandeh.values();
        for (int i = 0; i < values.length; i++) {
            Dandeh value = values[i];
            System.out.println(value.toPersian2);
        }
    }

    public String getToPersian () {
        return toPersian;
    }
    public String getToPersian2 () {
        return toPersian2;
    }

}
