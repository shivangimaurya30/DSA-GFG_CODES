import java.io.*;
import java.util.*;
class quadraticequationrootQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            quadEquRoots obj = new quadEquRoots();
            ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
       class quadEquRoots {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> roots = new ArrayList<Integer>();
        int root1 = 0, root2 = 0;
        // value of b^2-4ac
        int temp = (int)(Math.pow(b, 2) - 4 * a * c);

        // if b^2-4ac is less then zero then roots are imaginary
        if (temp < 0)
            roots.add(-1);
        else {
            // calculate root1 and root2 using fomula
                      root1 = (int)Math.floor((-1 * b + Math.sqrt(temp)) / (2 * a));
                      root2 = (int)Math.floor((-1 * b - Math.sqrt(temp)) / (2 * a));
            
             roots.add(Math.max(root1, root2));
            roots.add(Math.min(root1, root2));
        }
        return roots;
    }
}
