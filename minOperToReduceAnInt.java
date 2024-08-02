//https://leetcode.com/problems/minimum-operations-to-reduce-an-integer-to-0/

class Solution {
    public int minOperations(int n) {
        //Tc: O(nlogn)  Sc: O(n)
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        queue.add(n);
        visited.add(n);
        
        int operations = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                
                if (current == 0) {
                    return operations;
                }
                
                int power = 1;
                while (power <= current) {
                    int nextAdd = current + power;
                    int nextSubtract = current - power;
                    
                    if (!visited.contains(nextAdd)) {
                        queue.add(nextAdd);
                        visited.add(nextAdd);
                    }
                    
                    if (!visited.contains(nextSubtract)) {
                        queue.add(nextSubtract);
                        visited.add(nextSubtract);
                    }
                    
                    power *= 2;
                }
            }
            operations++;
        }
        
        return operations;
    }
}
