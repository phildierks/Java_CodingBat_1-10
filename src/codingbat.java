public class codingbat {
    
    public int diff21(int n) {
        if(n<=21){
            return 21-n;
        }
        else{
            return (n-21)*2;
        }
    }


    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }


    public boolean twoAsOne(int a, int b, int c) {
        if(a + b == c){
            return true;
        }
        if(b + c == a){
            return true;
        }
        if(a + c == b){
            return true;
        }else{
            return false;

        }
    }


    public boolean firstLast6(int[] nums) {
        if(nums[0] == 6 || nums[nums.length-1] == 6){
            return true;
        }else{
            return false;
        }
    }


    public boolean array123(int[] nums) {
        for(int i = 0;i<(nums.length-2);i++){
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3){
                return true;
            }
        }
        return false;
    }


    public boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for(int i = 0;i<str.length()-2;i++){
            if(str.substring(i,i+3).equals("cat")){
                cat ++;
            }
            if(str.substring(i,i+3).equals("dog")){
                dog++;
            }
        }
        return cat == dog;
    }


    public boolean no14(int[] nums) {
        int countOne = 0;
        int countFour = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 1){
                countOne++;
            }
            if(nums[i] == 4){
                countFour++;
            }
        }
        if(countFour > 0 && countOne > 0){
            return false;
        }else{
            return true;
        }
    }


    public int blackjack(int a, int b) {
        if(a>21 && b>21){
            return 0;
        }
        if(a > 21){
            return b;
        }
        if(b>21){
            return a;
        }
        return a < b ? b : a;
    }


    public int sumDigits(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i)))
                count += Integer.parseInt(str.substring(i, i+1));
        }
        return count;
    }


    public int countClumps(int[] nums) {
        int numClumps = 0;
        for(int i = 1; i < nums.length-1; i++){
            if(nums[i] == nums[i-1] && nums[i+1] != nums[i]){
                numClumps ++;
            }
        }
        if(nums.length<=0){
            return 0;
        }
        if(nums[nums.length-1] == nums[nums.length - 2]){
            numClumps++;
        }
        return numClumps;
    }

}
