package variables_task;

public class phoneDemo {
    public static void main(String[] args) {
        int totalPrice;
        Phone iphone11 = new Phone(1154.4,"+375449285", "White", 1000);
        Phone iphone12 = new Phone(1235.1,"+375543235", "Black",1500);
        //totalPrice = iphone12.price + iphone11.price;
        System.out.println("First phone  - " + iphone11.buildVersion + " ; " + iphone11.callNumber + " ; " + iphone11.color + " ; " + iphone11.sensDisplay);
        System.out.println("Second phone  - " + iphone12.buildVersion + " ; " + iphone12.callNumber + " ; " + iphone12.color + " ; " + iphone12.sensDisplay);
        //if we don't use uninitialized field/var there are no error,otherwise compile error
        //System.out.println("Total price is " + totalPrice);
    }

}
