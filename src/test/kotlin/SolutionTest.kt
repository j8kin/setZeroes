import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {
    private val solution = Solution()

    @Test
    fun setZeroes1() {
        val input = arrayOf(intArrayOf(1,1,1), intArrayOf(1,0,1), intArrayOf(1,1,1))
        val expect = arrayOf(intArrayOf(1,0,1), intArrayOf(0,0,0), intArrayOf(1,0,1))
        solution.setZeroes(input)
        assertArrayEquals(expect, input)
    }
    @Test
    fun setZeroes2() {
        val input = arrayOf(intArrayOf(0,1,2,0), intArrayOf(3,4,5,2), intArrayOf(1,3,1,5))
        val expect = arrayOf(intArrayOf(0,0,0,0), intArrayOf(0,4,5,0), intArrayOf(0,3,1,0))
        solution.setZeroes(input)
        assertArrayEquals(expect, input)
    }
}