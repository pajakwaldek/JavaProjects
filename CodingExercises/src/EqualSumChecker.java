public class EqualSumChecker {

    public static void main(String[] args) {
        hasEqualSum(1,1,2);
    }

    public static boolean hasEqualSum(int par1, int par2, int par3) {
        if ((par1 + par2) == par3) {
            return true;
        } else {
            return false;
        }
    }
}
