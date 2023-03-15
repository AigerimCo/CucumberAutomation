package beginningPractice.oopp;

public class Phone extends Technology implements MakingCalls, TakingPictures {
    private String type;
    private String purpose;
    private boolean hasTouchScreen;

    public Phone() {

    }

    public Phone(int memory, boolean hasInternet, boolean hasCamera, String type, String purpose, boolean hasTouchScreen) {
            super(memory, hasInternet, hasCamera);
            this.type = type;
            this.purpose = purpose;
            this.hasTouchScreen = hasTouchScreen;
        }

        public String getType () {
            return type;
        }

        public void setType (String type){
            this.type = type;
        }

        public String getPurpose () {
            return purpose;
        }

        public void setPurpose (String purpose){
            this.purpose = purpose;
        }

        public boolean getHasTouchScreen () {
            return hasTouchScreen;
        }

        public void setHasTouchScreen ( boolean hasTouchScreen){
            this.hasTouchScreen = hasTouchScreen;
        }

    @Override
    public String toString() {
        return super.toString()+
         "Phone{" +
                "type='" + type + '\'' +
                ", purpose='" + purpose + '\'' +
                ", hasTouchScreen=" + hasTouchScreen +
                '}';
    }

    public void canCall(String text){
        System.out.println("It can make a calls");
    }

    public String textMessage(String message, int number){
        return message + number;
    }
    public void makePhoto(String name){
        System.out.println(name + "can make a high quality photos");
    }
}

