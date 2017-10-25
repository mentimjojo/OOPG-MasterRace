package nl.han.ica.MasterRace.Map.Builder;


import java.io.File;

public class LevelBuilder {


    public LevelBuilder(){
        // Load json files
        this.getLevelFiles();
    }

    /**
     * Get level files from /src/levels
     */
    private void getLevelFiles(){
        File folder = new File("src/levels/");
        File[] listOfLevels = folder.listFiles();

        System.out.println("LOL");

        for(File test: listOfLevels){
            System.out.println(test.getName());
        }
    }

}
