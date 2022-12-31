package pr17;

public enum Season {
    Summer (20) {
        public String getDescription (){
            return "Warm season";
        }
    },
    Autumn (5), Spring (10), Winter (-10);
    private final int temperature;
    Season (int temperature){
        this.temperature = temperature;
    }

    public String getSeason(Season x){
        return switch (x){
            case Autumn -> "Autumn lasts from September to November";
            case Winter -> "Winter lasts from December to February";
            case Spring -> "Spring lasts from March to May";
            case Summer -> "Summer lasts from June to August";
        };
    }

    public String getFavorite(Season x){
        return switch (x) {
            case Autumn -> "I like Autumn";
            case Spring -> "I like Spring";
            case Summer -> "I like Summer";
            case Winter -> "I like Winter";
        };
    }

    public int getTemperature(){
        return temperature;
    }

    public String getDescription (){
        return "Cold season";
    }

}
