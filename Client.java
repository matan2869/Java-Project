public class Client {

    private String address;
    private int persons;
    private int current;
    private int prev;

    public Client(String address, int persons, int current, int prev) {
        this.address = address;
        this.persons = persons;
        this.current = current;
        this.prev = prev;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getPrev() {
        return prev;
    }

    public void setPrev(int prev) {
        this.prev = prev;
    }

    public void updateCurrent(int newCurrent){

        this.prev = this.current;
        this.current = newCurrent;

    }

    public double payment(double rate1, double rate2){

        int consumed = current - prev;

        int discountedAmount = persons * 7;

        if (consumed <= discountedAmount){
            return consumed * rate1;
        }

        int remainingAmount = consumed - discountedAmount;
        return (discountedAmount * rate1) + (remainingAmount * rate2);
    }

    public String toString() {
        return "Client{" +
                "address='" + address + '\'' +
                ", persons=" + persons +
                ", current=" + current +
                ", prev=" + prev +
                '}';
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