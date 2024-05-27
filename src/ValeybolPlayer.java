public class ValeybolPlayer extends Player{
    int numberOfPoint;
ValeybolPlayer(){}
    ValeybolPlayer(int numberOfPoint,String nameOfPlayer, String SportType, int numberPosition, String teamName){
    this.numberOfPoint = numberOfPoint;
        this.nameOfPlayer=nameOfPlayer;
        this.SportType = SportType;
        this.numberPosition = numberPosition;
        this.teamName = teamName;
    }
    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Valeybol uyinidagi nuqtalar soni: "+ numberOfPoint);
    }

    @Override
    public void getTeamName() {
        super.getTeamName();
    }

    public static void main(String[] args) {
        ValeybolPlayer valeybolPlayer = new ValeybolPlayer(12,"Firdavs","Valeybool",3,"Chaqqonlar");
        valeybolPlayer.getInfo();
        valeybolPlayer.getTeamName();
    }
}

