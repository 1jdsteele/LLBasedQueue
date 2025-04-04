public class Main {


    public static void main(String[] args) {


        

        Queue restaurantFireOrder = new Queue();
        
        restaurantFireOrder.enqueue("Cheeseburger Combo");
        restaurantFireOrder.enqueue("Charcuterie Board");
        restaurantFireOrder.enqueue("Beer Flight");

        System.out.println(restaurantFireOrder.dequeue());
        System.out.println(restaurantFireOrder.dequeue());
        System.out.println(restaurantFireOrder.peek());




    }

}