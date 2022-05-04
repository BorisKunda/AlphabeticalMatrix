object MatrixPrograms {
    @JvmStatic
    fun main(args: Array<String>) {
        print(grid(14))
    }

    /**
     * ALPHABETICAL GRID
     *
     * Matrix (2D array of alphabet letters(char))
     *
     * Alphabet char array [0 .. 25]
     *
     * Alphabet Letter(Char) INDEX = ROW INDEX + COLUMN INDEX
     *
     * Example: matrix 3*3
     *
     * Char in row 3 (index=2) and column 3 (index =2)
     *
     * AlphabetArray[2+2] -> AlphabetArray[4] -> 'e'
     *
     *     C     C     C
     * R [0,0] [0,1] [0,2]
     * R [1,0] [1,1] [1,2]
     * R [2,0] [2,1] [2,2]
     *
     *     C   C   C
     * R [a] [b] [c]
     * R [b] [c] [d]
     * R [c] [d] [e]
     *
     *
     */

    /**
    Alphabet

    A - 0
    B - 1
    C - 2
    D - 3
    E - 4
    F - 5
    G - 6
    H - 7
    I - 8
    J - 9
    K - 10
    L - 11
    M - 12
    N - 13
    O - 14
    P - 15
    Q - 16
    R - 17
    S - 18
    T - 19
    U - 20
    V - 21
    W - 22
    X - 23
    Y - 24
    Z - 25

     */

}

fun grid(gridSize: Int): String? {
    if (gridSize >= 0) {
        val builder: StringBuilder = StringBuilder()
        val newLine = "\n"
        val zeroToGridSizeRange: IntRange = 0 until gridSize

        for (columnIndex in zeroToGridSizeRange) {

            for (rowIndex in zeroToGridSizeRange) {
                val columnRowsIndicesSum = columnIndex + rowIndex
                val quotient = columnRowsIndicesSum / 25
                val remainder = columnRowsIndicesSum % 25

                if (columnRowsIndicesSum <= 25) {
                    builder.append(arrayAlphabet[columnRowsIndicesSum])
                } else {
                    //todo
                    // pay attention! if value of dividend less then divisor then '%' will return dividend value
                    // check if remainder > 0, if does  for(i in 0 .. remainder) {builder.append(arrayAlphabet[remainder])}
                    // check if quotient > 1, if does repeat quotient * times for(i2 in 0...25) { builder.append(arrayAlphabet[columnRowsIndicesSum]) }
                }
            }

            if (columnIndex != zeroToGridSizeRange.last) {
                builder.append(newLine)
            }

        }


        return builder.toString()

    } else {
        return null
    }

}
