package utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wulixz
 * @date 1/8/20 : 11:31 AM
 * @introduction :
 */
public class Calculator {
    public static void main(String[] args) {

        Map<String, Double> goods = new HashMap<>();
        goods.put("phone",6899.00);
        goods.put("powerBank",126.00);
        goods.put("protector1",55.78);
        goods.put("protector2",27.89);
        goods.put("protector3",27.89);
        goods.put("cover1",23.58);
        goods.put("cover2",11.6);
        goods.put("cover3",9.6);
        double sum = 0;
        for (String name : goods.keySet()
             ) {
            sum += goods.get(name);
        }
        System.out.println(sum);

        double change = 6.925;

        System.out.println(sum / change);

    }
}
