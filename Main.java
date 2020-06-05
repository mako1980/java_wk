public class Main {
    public static void main(String[] args) {
        int r = 0;
        int max_day = 0;
        int w10 = 0;
        int w1  = 0;
        for (int i = 0; i < 12; i++){
            switch (i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    max_day = 31;
                case 2:
                    max_day = 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    max_day = 30;
            }
            for (int j = 1; j <= max_day; j++){
                w10 = j / 10;
                w1 = j % 10;
                if (i == w10 + w1){
                   r += 1;
                   //System.out.println(i + "月" + j + "日");
                }
            }
        }
        System.out.println(r);
    }
}
