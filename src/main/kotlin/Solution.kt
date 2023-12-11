class Solution {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val columns = BooleanArray(matrix[0].size)
        var setZero: Boolean
        for (i in matrix.indices) {
            setZero = false
            matrix[i].forEachIndexed { j, v ->
                if (v == 0) {
                    columns[j] = true
                    setZero = true
                }
            }
            if (setZero) {
                matrix[i] = IntArray(matrix[0].size) { 0 }
            }
        }

        for (i in matrix.indices) {
            if (matrix[i][0] != 0) {
                for (j in matrix[0].indices) {
                    if (columns[j]) {
                        matrix[i][j] = 0
                    }
                }
            }
        }
    }
}
