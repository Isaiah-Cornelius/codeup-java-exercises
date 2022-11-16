public class ServerNameGenerator {

    static String [] adjectiveArrayAppearance = {"attractive", "bald", "beautiful", "chubby", "clean", "dazzling", "drab", "elegant", "fancy", "fit", "flabby", "glamorous", "gorgeous", "handsome", "magnificent", "muscular", "plain", "plump", "scruffy", "shapely", "skinny", "stocky", "unkempt", "unsightly"};
    static String[] adjectiveArrayPersonality = {"agreeable", "ambitious", "brave", "calm", "delightful", "eager", "faithful", "gentle", "happy", "jolly", "kind", "lively", "nice", "obedient", "polite", "proud", "silly", "thankful", "victorious", "witty", "wonderful", "zealous"};
    static String[] nounArray = {"airplane", "bread", "bridge", "bucket", "bus", "carrot", "coffee", "corncob", "cup", "fridge", "pantry", "pen", "pencil", "potato", "sweater", "tomato", "tree", "wheelbarrow"};

    public static int getRandomElementStringArray(String[] stringArray) {
        int max = stringArray.length - 1;
        return ((int)(Math.floor(Math.random() * (max))));
    }

    public static String makeServerName() {
        String adjectiveApperance = adjectiveArrayAppearance[getRandomElementStringArray(adjectiveArrayAppearance)];
        String adjectivePersonality = adjectiveArrayPersonality[getRandomElementStringArray(adjectiveArrayPersonality)];
        String noun = nounArray[getRandomElementStringArray(nounArray)];
        String returnString = adjectiveApperance + "-" + adjectivePersonality + "-" + noun;
        return returnString;
    }

    public static void main(String[] args) {

        System.out.println("Here is your server name: " + makeServerName());
        System.out.println("Here is your server name: " + makeServerName());
        System.out.println("Here is your server name: " + makeServerName());
        System.out.println("Here is your server name: " + makeServerName());
        System.out.println("Here is your server name: " + makeServerName());
    }
}
