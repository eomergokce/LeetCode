class ContainerWithMostWater {
    public int maxArea(int[] height) {

        int max=0;
        int x=0;
        int y=height.length-1;

        while(x<y){

            int temp = 0;
            int a=height[x];
            int b=height[y];

            if(a<b){
                temp = a*(y-x);
                x++;
            }
            else{
                temp = b*(y-x);
                y--;
            }

            if(temp>max){
                max = temp;
            }

        }

        return max;
    }
}