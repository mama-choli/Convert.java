package com.company;
/*конвертация из арабского числа в римское*/
public class Convert {
    int arab ;

// конструктор
    public Convert (int sum){
        arab = sum;
        String s = convert_nub(sum);
        System.out.println(s);
    }



    public static String convert_nub(int in) {
            StringBuffer a = new StringBuffer("");
            if (in == 100) {
                return "C";
            } else {

                if (in >= 50) {
                    int l1 = in / 10;
                    a.append(L(l1));
                    int l2 = in % 50;
                    int x1 = l2 / 10;
                    a.append(X(x1));
                    int x2 = l2 % 10;
                    a.append(basic(x2));
                } else {
                    int l1 = in % 50;
                    int l2 = l1 / 10;
                    a.append(XL(l2));
                    int x1 = l1 % 10;
                    a.append(basic(x1));
                }

                return a.toString();
            }
        }

        private static String X(int in) {
            if (in != 0 && in < 4) {
                StringBuffer a = new StringBuffer("");

                for (int i = 0; i < in; ++i) {
                    a.append("X");
                }

                return a.toString();
            } else {
                return "";
            }
        }

        private static String XL(int in) {
            if (in == 4) {
                return "XL";
            } else if (in != 0 && in < 4) {
                StringBuffer a = new StringBuffer("");

                for (int i = 0; i < in; ++i) {
                    a.append("X");
                }

                return a.toString();
            } else {
                return "";
            }
        }

        private static String L(int in) {
            if (in == 9) {
                return "XC";
            } else if (in != 0 && in < 9) {
                StringBuffer a = new StringBuffer("");
                a.append("L");
                return a.toString();
            } else {
                return "";
            }
        }

        private static String basic(int in) {
            String[] a = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
            return a[in];
        }

    }

