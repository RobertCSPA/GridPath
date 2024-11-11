public class Main{
    public static void main(String[] args){
        int[][] nums = {
            {12,3,4,13,5},
            {11,21,2,14,16},
            {7,8,9,15,0},
            {10,17,20,19,1},
            {18,22,30,25,6}
        };
        GridPath one = new GridPath(nums);
        System.out.println(one);
        System.out.println(one.getNextLoc(2,4));
        System.out.println(one.sumPath(0,0));
    }

}
