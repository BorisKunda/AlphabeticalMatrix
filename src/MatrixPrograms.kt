object MatrixPrograms {
    @JvmStatic
    fun main(args: Array<String>) {
        print(grid(14))
    }

    // !!! Exception when gridSize 14

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
    todo solve these scenarios
    1. n < 0 - DONE
    2. n = 0 - DONE
    3. z after a (n>13)
    4. improve algorithm instead nested loop
     */


}

fun grid(gridSize: Int): String? {
    if (gridSize >= 0) {
        val builder: StringBuilder = StringBuilder()
        val newLine = "\n"
        val zeroToGridSizeRange: IntRange = 0 until gridSize

        for (columnIndex in zeroToGridSizeRange) {

            for (rowIndex in zeroToGridSizeRange) {
                try {
                    val columnRowsIndicesSum = columnIndex + rowIndex

                    if (columnRowsIndicesSum <= 25) {
                        builder.append(arrayAlphabet[columnIndex + rowIndex])
                    } else {
                        //todo grid(recursion)
                        //a starts after z
                        //alphabet counter restarts
                        //current solution solves grid(14) case only
                        builder.append(arrayAlphabet[0])
                    }
                } catch (e: Exception) {
                }
            }

            if (columnIndex != zeroToGridSizeRange.last) {
                builder.append(newLine)
            } else {
                //print("test")
            }

        }


        return builder.toString()

    } else {
        return null
    }

}


//            print("******************************************\n")