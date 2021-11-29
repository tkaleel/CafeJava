public class CafeJava {
    public static void main(String[] args) {

        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = "Your order will be ready shortly...";
        String readyMessage = ", your order is ready.";
        String displayTotalMessage = "Your total is $";

        double mochaPrice = 3.5;
        double dripPrice = 2.0;
        double lattePrice = 3.0;
        double cappuccinoPrice = 3.0;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jorge";
        String customer4 = "Noah";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        System.out.println(generalGreeting + customer1);
        System.out.println(pendingMessage);

        if(isReadyOrder4 == true){
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice );
        }
        else{
            System.out.println(pendingMessage);
        }

        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + (lattePrice * 2));

        if(isReadyOrder2 == true) {
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(pendingMessage);
        }

        System.out.println(generalGreeting + customer3);
        System.out.println(displayTotalMessage + dripPrice);
        System.out.println(displayTotalMessage + (lattePrice - dripPrice));
    }
}