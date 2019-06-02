public class Goldbach {
    public static void main(String[] args) {
        //new goldbach().check();
        new Goldbach1().check(); //引用新class中的一个method
    }
}
    class Goldbach1 {

/*    public void goldbach(int m) {
        if (isEven(m)) {
            System.out.print("you win!");
            else {
                System.out.print("you are close!");
            }
        }
    }*/
    public void check() {
                for (int i = 4; i <= 10000000; i+=2) { // i += 2 注意两边空格
                    if (!checkEvenNumber(i)) {
                        System.out.print("Congratulation, you win the Fields prize");
                    break;
                    }

            if(i%10000 ==0) {
                System.out.print(("Holds <= " + i));
            }
        }
    }

    public boolean isPrime(int n) {
            /*for (int i = 1; i * i < n; i++) {
                if (n / i == 0) {
                    return false;
                } else {
                    return true;
                }
            }

    return false;
    }*/
            //整个逻辑没有问题，但是如果默认是return true，则更为简便，少一层，且i * i <= n 更为简便
            for( int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
        }
        return true;
    }

    public boolean checkEvenNumber ( int n) {
        for (int i = 2; i <= n/2; i++) {
            if (isPrime(i) && isPrime(n - i) ) {
                return true;

            }
        }
        return false;
    }
}