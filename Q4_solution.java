class Solution {
    Random rand;
    TreeMap<Integer, Integer> map;
    int area;
    int rect[][];

    public Solution(int[][] rects) {
        this.rect = rects;
        rand = new Random();
        area = 0;
        map = new TreeMap<>();
        for(int i=0; i<rect.length; i++){
            area += (rect[i][2] - rect[i][0]+1)*(rect[i][3] - rect[i][1]+1);
            map.put(area, i);
        }
    }
    
    public int[] pick() {
        int randVal = rand.nextInt(area);
        int key = map.higherKey(randVal);
        int rects[] = rect[map.get(key)];
        int offset = key - randVal -1;
        int width = rects[2] - rects[0] + 1;
        int x = offset%(width)+rects[0];
        int y = offset / (width) + rects[1];
        return new int[]{x,y};
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(rects);
 * int[] param_1 = obj.pick();
 */
