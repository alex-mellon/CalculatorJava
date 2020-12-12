package com.company;

public enum RomanNumbers {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10), XL(40), L(50), XC(90), C(100);

    private int value;
    private String key;

    RomanNumbers(int value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

/*   public static List<RomanNumbers> getReverseSortedValue() {
        return Arrays.stream(values())
                .sorted(Comparator.comparing((RomanNumbers e) -> e.value).reversed())
                .collect(Collectors.toList());
    } */ // Не особо понял вот это вот всё, потом разберусь
}
