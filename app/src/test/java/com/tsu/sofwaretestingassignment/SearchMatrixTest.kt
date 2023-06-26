package com.tsu.sofwaretestingassignment

import org.junit.Assert
import org.junit.Test


/**
 * Unit tests for the searchMatrix function.
 */
class SearchMatrixTest {
    /**
     * Test case description: Empty matrix, target not present.
     * Expected output: false
     */
    @Test
    fun testEmptyMatrix() {
        /*
        *Bug Report:
         Title: Incorrect Test Result for Empty Matrix

        *Description:
         The test case is not producing the expected result. The test is expected to return false when the matrix is empty
         and the target is not present. However, the actual result is not being asserted correctly, leading to incorrect
         test outcomes.

        *Steps to Reproduce:
         1. Run the test case.

        *Expected Result:
         The test case should return false since the matrix is empty and the target is not present.

        *Actual Result:
         The test case result is not being asserted correctly. The actual result is not compared with the expected result.
         */
        val matrix = Array(0) { IntArray(0) }
        val target = 5
        val result: Boolean = Solution().searchMatrix(matrix, target)
        Assert.assertFalse(result)
    }

    /**
     * Test case description: Matrix with single element, target present.
     * Expected output: true
     */
    @Test
    fun testSingleElementMatrix_TargetPresent() {
        /*
        *Bug Report:
        *Title: Incorrect Test Result for Single Element Matrix (Target Present)

        *Description:
         The test case is not producing the expected result. The test is expected to return true when the matrix contains
         a single element and the target is present. However, the actual result is not being asserted correctly, leading to
         incorrect test outcomes.

        *Steps to Reproduce:
         1. Run the test case.

        *Expected Result:
         The test case should return true since the matrix contains a single element and the target is present.

        *Actual Result:
         The test case result is not being asserted correctly. The actual result is not compared with the expected result.
         */
        val matrix = arrayOf(intArrayOf(5))
        val target = 5
        val result: Boolean = Solution().searchMatrix(matrix, target)
        Assert.assertTrue(result)
    }

    /**
     * Test case description: Matrix with single element, target not present.
     * Expected output: false
     */
    @Test
    fun testSingleElementMatrix_TargetNotPresent() {
        /*
        *Bug Report:
        *Title: Incorrect Test Result for Single Element Matrix (Target Not Present)

        *Description:
         The test case is not producing the expected result. The test is expected to return false when the matrix contains
         a single element and the target is not present. However, the actual result is not being asserted correctly, leading
         to incorrect test outcomes.

        *Steps to Reproduce:
         1. Run the test case.

        *Expected Result:
         The test case should return false since the matrix contains a single element and the target is not present.

        *Actual Result:
         The test case result is not being asserted correctly. The actual result is not compared with the expected result.
         */
        val matrix = arrayOf(intArrayOf(5))
        val target = 10
        val result: Boolean = Solution().searchMatrix(matrix, target)
        Assert.assertFalse(result)
    }

    /**
     * Test case description: Matrix with multiple rows and columns, target present.
     * Expected output: true
     */
    @Test
    fun testMatrix_TargetPresent() {
        /*
        *Bug Report:
        *Title: Incorrect Test Result for Matrix with Multiple Rows and Columns (Target Present)

        *Description:
         The test case is not producing the expected result. The test is expected to return true when the matrix contains
         multiple rows and columns, and the target is present. However, the actual result is not being asserted correctly,
         leading to incorrect test outcomes.

        *Steps to Reproduce:
         1. Run the test case.

        *Expected Result:
         The test case should return true since the matrix contains multiple rows and columns, and the target is present.

        *Actual Result:
         The test case result is not being asserted correctly. The actual result is not compared with the expected result.
         */
        val matrix = arrayOf(intArrayOf(1, 3, 5), intArrayOf(7, 9, 11), intArrayOf(13, 15, 17))
        val target = 9
        val result: Boolean = Solution().searchMatrix(matrix, target)
        Assert.assertTrue(result)
    }

    /**
     * Test case description: Matrix with multiple rows and columns, target not present.
     * Expected output: false
     */
    @Test
    fun testMatrix_TargetNotPresent() {
        /*
        *Bug Report:
        *Title: Incorrect Test Result for Matrix with Multiple Rows and Columns (Target Not Present)

        *Description:
         The test case is not producing the expected result. The test is expected to return false when the matrix contains
         multiple rows and columns, and the target is not present. However, the actual result is not being asserted correctly,
         leading to incorrect test outcomes.

        *Steps to Reproduce:
         1. Run the test case.

        *Expected Result:
         The test case should return false since the matrix contains multiple rows and columns, and the target is not present.

         *Actual Result:
         The test case result is not being asserted correctly. The actual result is not compared with the expected result.
         */
        val matrix = arrayOf(intArrayOf(1, 3, 5), intArrayOf(7, 9, 11), intArrayOf(13, 15, 17))
        val target = 8
        val result: Boolean = Solution().searchMatrix(matrix, target)
        Assert.assertFalse(result)
    }
}