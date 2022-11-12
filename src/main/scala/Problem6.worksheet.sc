object Solution {
    def convert(s: String, numRows: Int): String = {
        if (1 == numRows) {
            return s
        }

        val rows: Array[StringBuilder] = Array.fill(Math.min(numRows, s.length))(new StringBuilder)

        var currentRow: Int = 0

        var isGoingDown: Boolean = false

        for (c: Char <- s.toCharArray) {

            rows(currentRow).append(c)

            if (currentRow == 0 || currentRow == numRows - 1)
                isGoingDown = !isGoingDown

            if (isGoingDown)
                currentRow += 1
            else
                currentRow -= 1
        }

        val result: StringBuilder = new StringBuilder()

        for (row <- rows)
            result.append(row)

        result.toString()
    }
}
