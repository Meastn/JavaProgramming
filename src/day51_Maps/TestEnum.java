package day51_Maps;

public class TestEnum {
    public static void main(String[] args) {
        String browser1 ="wooden spoon"; // must avoid this type of mistakes using enum
        Browser browser = Browser.SAFARI;

        switch (browser){
            case EDGE:
                System.out.println("Edge is selected");
                break;
            case OPERA:
                System.out.println("Opera is selected");
                break;
            case SAFARI:
                System.out.println("Safari is selected");
                break;
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;
            default:
                System.out.println("Chrome is selected");
                break;
        }

    }
}
