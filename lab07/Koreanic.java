package Package;

public class Koreanic extends Language {



    Koreanic(String name, int numSpeakers){
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.wordOrder = "subject-object-verb";
        this.regionSpoken = "Korean peninsula(South Korea, North Korea, Jeju) and several prefectures of China";
        if (name.contains("Jeju")){
            this.regionSpoken = "Jeju island";
        }
    }
}
