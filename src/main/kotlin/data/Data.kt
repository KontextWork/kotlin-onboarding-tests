package data

/**
 * Should not be used with when trying to override getter or setter.
 * See https://stackoverflow.com/a/46376746/3625317
 */
data class Data (
    /**
     * Immutable
     */
    val field1: String,
    /**
     * Mutable
     */
    var field2: Int
);
