package skillstest.util;

public class TotallyUnnecessaryStringUtils {

	/**
     * <p>Checks if the CharSequence contains only Unicode letters or digits.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code false}.</p>
     *
     * <pre>
     * isAlphanumeric(null)   = false
     * isAlphanumeric("")     = false
     * isAlphanumeric("  ")   = false
     * isAlphanumeric("abc")  = true
     * isAlphanumeric("ab c") = false
     * isAlphanumeric("ab2c") = true
     * isAlphanumeric("ab-c") = false
     * </pre>
     */
	public static boolean isAlphanumeric(CharSequence s) {
		// TODO implement this
		return true;
	}

	/**
     * <p>Reverses a String.</p>
     *
     * <p>A {@code null} String returns {@code null}.</p>
     *
     * <pre>
     * reverse(null)  = null
     * reverse("")    = ""
     * reverse("bat") = "tab"
     * </pre>
     */
	public static String reverse(String s) {
		// TODO implement this
		return s;
	}

}
