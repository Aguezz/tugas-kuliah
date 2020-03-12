class Test {
    public static void main(String[] args) {
        int[] listPrime = {2, 3, 5, 7};

        for (int i = 2; i <= 10000000; i++) {
            boolean isPrime = true;

            for (int prime : listPrime) {
                if (i % prime == 0) isPrime = false;
                if (i == prime) isPrime = true;
            }

            if (isPrime) System.out.println(i);
        }

        // for (int i = 0; i <= 10000000; i++) {
        //     if (i < 2) continue;

        //     boolean isPrime = true;

        //     for (int j = 2; j < i; j++) {
        //         if (i % j == 0) isPrime = false;
        //     }

        //     if (isPrime) System.out.println(i);
        // }
    }
}
