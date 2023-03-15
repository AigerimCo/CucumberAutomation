package beginningPractice;

public enum OrderStatus {

        Delivered("Your things already delivered"),
        ReadyToShip("ready to ship"),
        Taken("this is has taken");

        private final String text;

        OrderStatus(String text){
            this.text = text;
        }

    public String getText() {
        return text;
    }


}
