package warmup_challenges;

import java.util.HashMap;

public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {

        // 10 20 20 10 10 30 50 10 20

        HashMap<Integer, Integer> socks = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {

            int color = ar[i];
            if (socks.get(color) == null) {
                socks.put(color, 1); // 10, 1
            } else {
                int currentCount = socks.get(color);
                currentCount++;
                socks.put(color, currentCount);
            }
        }

        int result = 0;
        for (int count : socks.values()){
            result += count /2;
        }

        return result;



    }
}
