public abstract class Console implements IConsole {
 
    
    private String ConsoleType();
    private String Store();
    private int TotalSales();
    
    public Console(String ConsoleType,String Store,Int Total sales) {
        
        this.ConsoleType = ConsoleType;
        this.Store = Store;
        this.TotalSales = TotalSales;
    }
    
    @Override
    public String GetConsoleType() {
        return ConsoleType;
    }
    
    @override
    public String getStore() {
        return store;
    } 
    @Override
    public int getTotalsales() {
        return TotalSales;
    }
}


