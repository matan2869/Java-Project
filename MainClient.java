public class MainClient {
    public static void main(String[] args) {

        Client client = new Client("123 Main", 4, 35, 30);

        System.out.println(client);

        client.updateCurrent(40);
        System.out.println(client);

        System.out.println("---------------------------------");

        double rate1 = 2.5;
        double rate2 = 5.0;
        double payment = client.payment(rate1, rate2);

        System.out.println("Total payment: " + payment);

        System.out.println("------------------------------------");




        Client client1 = new Client("123 Main", 4, 35, 30);
        Client client2 = new Client("456 Elm St", 4, 50, 30);
        Client client3 = new Client("789 Oak St", 3, 40, 30);
        Client client4 = new Client("101 Pine St", 4, 45, 30);

        Client[] clients = {client1, client2, client3, client4};

        proposal(clients, 4, 2.5, 50);



    }

    public static void proposal (Client[] arr, int num, double rate1, double rate2){

        double totalPayment = 0;
        int count = 0;

        for (Client client : arr){
            if (client.getPersons() == num){
                totalPayment += client.payment(rate1, rate2);
                count++;
            }
        }

        double averagePayment = (count == 0) ? 0 : totalPayment / count;

        for (Client client : arr){
            if (client.getPersons() == num && client.payment(rate1, rate2) > averagePayment){
                System.out.println(client.getAddress());

            }
        }
    }
}
