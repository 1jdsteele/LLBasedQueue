class Queue{
    private Node head;
    private Node tail;

    public Queue(){
        head = null;
        tail = null;
    }


    public void enqueue(String newData){
        Node newNode = new Node(newData);
        if (head == null){
            head = newNode;
            tail = newNode;
        } 
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public String dequeue(){
        String tempString = "";
        //logic if there is no items in list
        if (head == null) return tempString;
        //logic if 1 item in list
        if (head == tail){
            tempString = head.data;
            head = null;
            tail = null;
     
            return tempString;
        } else {//logic if list is > 1 
            tempString = head.data;
            head = head.next;
        
            return tempString;
        }

    }


    public String peek(){
        if (head == null) return "";
        return head.data;
    }
}