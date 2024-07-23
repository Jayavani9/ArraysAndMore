//https://leetcode.com/problems/design-memory-allocator/?envType=company&envId=nvidia&favoriteSlug=nvidia-three-months

class Allocator {
    int[] mem;
    public Allocator(int n) {
        mem = new int[n];
    }

    //Tc: O(n) Sc: O(1)
    public int allocate(int size, int mID) {
        int cnt = 0;
        for(int i = 0; i < mem.length; i++)
        { 
            if(mem[i] == 0) {
                cnt++;
                if(cnt == size)
                {
                    for(int j = i; j >= i-size+1; j--)
                    {
                        mem[j] = mID;
                    }
                    return i-size+1;
                }
            }
            else cnt = 0;
        }
        return -1;
    }

    //Tc: O(n) Sc: O(1) 
    public int free(int mID) {
        int cntr = 0;
        for(int i = 0; i < mem.length; i++)
        {
            if(mem[i] == mID) {
                mem[i] = 0;
                cntr++;
            }
        }
        return cntr;
    }
}

/**
 * Your Allocator object will be instantiated and called as such:
 * Allocator obj = new Allocator(n);
 * int param_1 = obj.allocate(size,mID);
 * int param_2 = obj.free(mID);
 */
