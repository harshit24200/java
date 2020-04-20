class Gen<T extends Number> {

    T tarray[];

    Gen(T tar[]) {
        tarray = tar;
    }

    double total() {
        double total = 0;
        for (int i = 0; i < tarray.length; i++) {
            total += tarray[i].doubleValue();
        }
        return total;
    }

    void sameTotal(Gen<?> gen) {

        if (total() == gen.total()) {
            System.out.println("Totals are same");
        } else {
            System.out.println("Different totals");
        }
    }
}

 class Avg {

    public static void main(String[] args) {

        Gen<Integer> gen1 = new Gen<Integer>(new Integer[]{10, 20, 30, 40, 50});
        Gen<Integer> gen2 = new Gen<Integer>(new Integer[]{10, 20, 30, 40, 50});
        Gen<Double> gen3 = new Gen<Double>(new Double[]{1.1, 2.2, 3.3, 4.4, 5.5});
        Gen<Float> gen4 = new Gen<Float>(new Float[]{5.2f, 6.4f, 7.8f, 8.6f, 9.2f});

        System.out.print("gen1 and gen2 -> ");
        gen1.sameTotal(gen2);

        System.out.print("gen1 and gen3 -> ");
        gen1.sameTotal(gen3);

        System.out.print("gen1 and gen4 -> ");
        gen1.sameTotal(gen4);
    }
}
