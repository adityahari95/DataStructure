class Solution {
    public int reverse(int x) {
        long rev  = 0;
	    while(x != 0) {
		    rev *= 10;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            } 
            rev += x % 10; 
            x /= 10;
	    }
	    return (int) rev;
    }
}