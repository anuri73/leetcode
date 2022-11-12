object Solution {
    def reverse(x: Int): Int = {
        var copy = x
        var rev = 0
        while (0 != copy) {
            val pop = copy % 10
            copy = copy / 10
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                return 0
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
                return 0
            rev = rev * 10 + pop
        }
        rev
    }
}
