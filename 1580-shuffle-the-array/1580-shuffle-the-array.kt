class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val list = mutableListOf<Int>()
        var x = 0
        var y = n
        while(x < n){
            list.add(nums[x++])
            list.add(nums[y++])
        }
        return list.toIntArray()
    }
}