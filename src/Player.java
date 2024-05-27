public class Player implements Information{

    String nameOfPlayer ;
    String SportType;
    int numberPosition;
    String teamName;

    Player(){

    }
    Player(String nameOfPlayer, String SportType, int numberPosition, String teamName){
        this.nameOfPlayer=nameOfPlayer;
        this.SportType = SportType;
        this.numberPosition = numberPosition;
        this.teamName = teamName;
    }
    @Override
    public void getInfo() {
        System.out.println("Name of player: "+nameOfPlayer);
        System.out.println("Sport type: "+SportType);
        System.out.println("Number position: "+numberPosition);
    }

    @Override
    public void getTeamName() {
        System.out.println("Team name: "+teamName);
    }
}
