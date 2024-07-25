public static void rollingHash(String s, String p)
{
    //Your code here
    
    //Please provide new line after each pattern match 
    if(p.length() > s.length()) {
        System.out.println("-1");
    } else {
        boolean flag = false;
        int hash = 0;
        for(int i = 0; i < p.length(); i++) {
            hash = hash + ((int)(p.charAt(i) - 'a') + 1);
        }
        
        int current_hash = 0;
        for(int i = 0; i < p.length(); i++) {
            current_hash = current_hash + ((int)(s.charAt(i) - 'a') + 1);
        }
        
        if(current_hash == hash) {
            System.out.println(s.substring(0, p.length()) + " " + 0);
            flag = true;
        }
        
        for(int i = 1; i + p.length() - 1 < s.length() && i < s.length(); i++) {
            current_hash = current_hash + ((int)(s.charAt(i + p.length() - 1) - 'a') + 1) - ((int)(s.charAt(i - 1) - 'a') + 1);
            
            if(current_hash == hash) {
                System.out.println(s.substring(i, i + p.length()) + " " + i);
                flag = true;
            }
        }
        
        if(!flag) {
            System.out.println(-1);
        }
    }
}
