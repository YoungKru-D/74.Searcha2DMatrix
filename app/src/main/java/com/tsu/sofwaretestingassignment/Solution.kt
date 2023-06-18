package com.tsu.sofwaretestingassignment

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if (matrix.isEmpty()) return false

        val m = matrix.size
        val n = matrix[0].size
        var l = 0
        var r = m * n

        while (l < r) {
            val mid = (l + r) / 2
            val i = mid / n
            val j = mid % n
            if (matrix[i][j] == target) {
                return true
            }
            if (matrix[i][j] < target) {
                l = mid + 1
            } else {
                r = mid
            }
        }

        return false
    }
}