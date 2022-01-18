import java.util.Scanner;

/**
 * @author jzh
 * @version 1.0
 * @date 2022/1/18 11 :46
 * 其实，只要数出 # 的数目算 11，数出 @的数目算的数目算2，再加上头尾各算，再加上头尾各算1$ 就计算好了。
 */
public class Main {
    public static void main(String[] args) {
        String strings =
                "|         H######              ####               |\n" +
                        "|          #                      #  #            |\n" +
                        "|          #                      #  #            |\n" +
                        "|          #     ####             #  #            |\n" +
                        "|          #     #  #             #  #            |\n" +
                        "|          ######@###             #  #            |\n" +
                        "|                #       ####     #  #            |\n" +
                        "|                #       #  #     #  #            |\n" +
                        "|            ####@#######@###     #  #            |\n" +
                        "|            #   #       #        #  #            |\n" +
                        "| T          #####       #        #  #   ##       |\n" +
                        "| #                      #      ###  ### ##       |\n" +
                        "| ################       #      #      ####       |\n" +
                        "|                #       #      #         #       |\n" +
                        "|   ##############       #######@##########       |\n" +
                        "|   #                         ###                 |\n" +
                        "|   ###########################                   |";
        int nums = 0;
        int i = strings.length() - strings.replaceAll("#", "").length();
        System.out.println("#的数量为" + i);
        nums = i * 11;
        System.out.println("#的长度为" + nums);
        int i1 = strings.length() - strings.replaceAll("@", "").length();
        System.out.println("@的数量为" + i1);
        int i2 = i1 * 2;
        System.out.println("@的长度为" + i2);
        nums = nums + i2 + 2;
        System.out.println(nums);
    }
}

