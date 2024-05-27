public class Setter extends ValeybolPlayer{
    int countOfSet;
Setter(){}
    Setter(int countOfSet, String nameOfPlayer, String SportType, int numberPosition, String teamName){
    this.countOfSet=countOfSet;
    this.nameOfPlayer=nameOfPlayer;
    this.SportType = SportType;
    this.numberPosition = numberPosition;
    this.teamName = teamName;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Count of sets: "+countOfSet);
    }

    public static void main(String[] args) {
        Setter setter = new Setter(2,"Damir","valeybol",4,"Chaqqonlar");
        setter.getInfo();
        setter.getTeamName();
    }
}
