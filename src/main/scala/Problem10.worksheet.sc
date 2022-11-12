object Solution {
    def isMatch(text: String, pattern: String): Boolean = {
        if (pattern.isEmpty) return text.isEmpty

        val first_match: Boolean = text.nonEmpty &&
            (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.')

        if (pattern.length >= 2 && pattern.charAt(1) == '*')
            isMatch(text, pattern.substring(2)) || (first_match && isMatch(text.substring(1), pattern))
        else
            first_match && isMatch(text.substring(1), pattern.substring(1))
    }
}
