import java.io.File;

class Siblings {

    public static boolean areSiblings(File f1, File f2) {
        if (f1 == null || f2 == null) {
            return false;
        }
        File parent1 = f1.getParentFile();
        File parent2 = f2.getParentFile();

        // return true if both parents are not null and equal
        return parent1 != null && parent1.equals(parent2);
    }
}
