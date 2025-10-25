public enum Dandeh {
    MANUAL("Dasti"),
    AUTOMATIC("otomatic");

    private final String toPersian;

    Dandeh (String toPersian) {
        this.toPersian = toPersian;
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
            System.out.println(value);
        }
    }

    public String getToPersian () {
        return toPersian;
    }

}
