package day42_Exceptions;

public class MultiCatchExample {
    public static void main(String[] args) {
        String word = "Java";
        word = null;
        try {
            System.out.println(word.substring(20));
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("e.getClass().getSimpleName() =" + e.getClass().getSimpleName());
        } catch (NullPointerException n){
            System.out.println("n.getClass().getSimpleName() =" + n.getClass().getSimpleName());
        } catch (RuntimeException r){
            System.out.println("r.n.getClass().getSimpleName()" + r.getClass().getSimpleName());
        }
        catch (Throwable t){
            System.out.println("t.n.getClass().getSimpleName()" + t.getClass().getSimpleName());
        } finally {
            System.out.println("IN THE END. ");
        }

        System.out.println("SOME CODE HERE");
    }
}

