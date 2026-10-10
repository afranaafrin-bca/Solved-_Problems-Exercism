public class Lasagna {
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven()
    {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int inOvenMinute)
    {
        int remainingMinute=40-inOvenMinute;
        return remainingMinute;
    }
    
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers)
    {
        int prepareTime= numberOfLayers * 2;
        return prepareTime;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers,int inOvenMinute)
    {
        int totalTime = (numberOfLayers*2 )+inOvenMinute;
        return totalTime; 
    }
}
