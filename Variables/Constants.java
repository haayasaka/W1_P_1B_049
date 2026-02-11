package Variables;

public class Constants {
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        double paper_width = 8.5;
        double paper_height = 11;
        System.out.println(
                "Paper size in centimeters: " + paper_width * CM_PER_INCH + " by " + paper_height * CM_PER_INCH);
    }
}