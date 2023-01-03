public class PC1 implements Builder{
    private PC pc = new PC();
    private String processor,Extra;
    private int processorPrice,ExtraFeaturePrice;

    public PC1()
   {
       this.processor = "Core i5" ;
       this.Extra = "CPU cooler";
       this.ExtraFeaturePrice =36000;
       this.processorPrice = 20000;
   }

    public int getProcessorPrice() {
        return processorPrice;
    }

    public int getExtraFeaturePrice() {
        return ExtraFeaturePrice;
    }

    public String getProcessor()
    {
        return this.processor;
    }
    public String getExtra()
    {
        return this.Extra;
    }
    public int getPriceExtra()
    {
        return 56000;
    }
    @Override
    public void AddRam(String ram) {
        if(ram.equalsIgnoreCase("2666 MHz"))
            pc.AddRam("2666 MHz");
        else if(ram.equalsIgnoreCase("3200 MHz"))
            pc.AddRam("3200 MHz");
        else
            pc.AddRam(null);
    }

    @Override
    public void AddGraphicsCard(String card) {
        if(card.equalsIgnoreCase("4 GB"))
            pc.AddGraphics("4 GB");
        else if(card.equalsIgnoreCase("2 GB"))
            pc.AddGraphics("2 GB");
        else
            pc.AddGraphics(null);
    }

    @Override
    public PC getPC() {
        return pc;
    }
}
