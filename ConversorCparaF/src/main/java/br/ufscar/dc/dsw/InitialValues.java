package br.ufscar.dc.dsw;

public class InitialValues{

    private long minValue;
    private long maxValue;
    private long increment;

    public InitialValues(){
        setMinValue(-100);
        setMaxValue(100);
        setIncrement(5);
    }

    // SETTERS E GETTERS //
    
    public void setMinValue(long minValue){
        this.minValue = minValue;
    }
    public long getMinVaue(){
        return minValue;
    }

    public void setMaxValue(long maxValue){
        this.maxValue = maxValue;
    }
    public long getMaxVaue(){
        return maxValue;
    }

    public void setIncrement(long increment){
        this.increment = increment;
    }
    public long getIncrement(){
        return increment;
    }

    ///////////////////////
}