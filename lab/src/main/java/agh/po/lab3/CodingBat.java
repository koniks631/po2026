package agh.po.lab3;

public class CodingBat {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation) {
            return true;
        }

        return false;
    }

    public boolean loneTeen(int a, int b) {
        if((a<=19 && a>=13) || (b<=19 && b>=13)){
            if((a<=19 && a>=13) && (b<=19 && b>=13)){
                return false;
            }
            return true;
        }
        return false;
    }

    public int sum13(int[] nums) {
        int a=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==13){
                i++;
                continue;
            }
            else {
                a = a+nums[i];
            }
        }
        return a;
    }


    public static void main(String[] args) {
        CodingBat cb=new CodingBat();
        cb.sleepIn(false, true);
        cb.loneTeen(1,2);
        int[] a = {1,2,13,1,1};
        cb.sum13(a);
    }

}
