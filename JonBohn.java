class JonBohn {
    public static void main(String[] args) {
        int temp;
        int final1 = 0;
        int final2 = 0;
        boolean theend = false;

        for (int i = 100; i > 1; i = i - 1) {
            System.out.println ("start: " + i + " ");
            temp = i;
            theend = false;
            while (!theend) {
                if (temp % 2 == 0) {
                    temp = temp / 2;
                } else {
                    temp = temp * 3 + 1;
                }
                if (temp == 4) {
                    final1 = temp;
                }
                if (temp == 2 && final1 == 4) {
                    final2 = 2;
                }
                if (temp == 1 && final1 == 4 && final2 == 2) {
                    theend = true;
                }
                System.out.print (temp + " ");
            }
            System.out.println ();
        }
    }
}