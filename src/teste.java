public class teste {
    public static void main(String[] args) {
        int month = 1;
        String str;
        switch (month) {
            case  1:
                str = "January";
                break;
            case 2:
                str = "February";
                break;
            case 3:
                str = "March";
                break;
            default:
                str = "Some other month";
                break;
        }

        System.out.println("Result " + str);
    }
}


