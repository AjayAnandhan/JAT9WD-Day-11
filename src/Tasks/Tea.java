package Tasks;

// Q5)


public class Tea {
    private boolean isPrepared;
    private boolean hasMilk;
    private boolean hasSugar;

    public Tea() {
        this.isPrepared = false;
        this.hasMilk = false;
        this.hasSugar = false;
    }

    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing basic tea with hot water and tea leaves.");
            isPrepared = true;
        } else {
            System.out.println("Tea is already prepared.");
        }
    }

    public void addMilk() {
        if (isPrepared && !hasMilk) {
            System.out.println("Adding milk to the tea.");
            hasMilk = true;
        } else if (!isPrepared) {
            System.out.println("Please prepare the tea first.");
        } else {
            System.out.println("Milk is already added to the tea.");
        }
    }

    public void addSugar() {
        if (isPrepared && !hasSugar) {
            System.out.println("Adding sugar to the tea.");
            hasSugar = true;
        } else if (!isPrepared) {
            System.out.println("Please prepare the tea first.");
        } else {
            System.out.println("Sugar is already added to the tea.");
        }
    }
    
    
// Q6) ---------------------------------------------------------------------------------------------------------
    public static class BlackTea extends Tea {
        @Override
        public void prepareTea() {
            System.out.println("Preparing black tea with hot water, black tea leaves, and brewing for 5 minutes.");
        }
    }

    public static class GreenTea extends Tea {
        @Override
        public void prepareTea() {
            System.out.println("Preparing green tea with hot water, green tea leaves, and brewing for 3 minutes.");
        }
    }

    public static class HerbalTea extends Tea {
        @Override
        public void prepareTea() {
            System.out.println("Preparing herbal tea with hot water, herbal tea leaves, and brewing for 7 minutes.");
        }
    }

// Q5)))
    
    public static void main(String[] args) {
        Tea myTea = new Tea();
        myTea.prepareTea(); // Prepare the basic tea
        myTea.addMilk();    // Add milk to the basic tea
        myTea.addSugar();   // Add sugar to the basic tea
        System.out.println();
    
// Q6)))
        
        BlackTea blackTea = new BlackTea();
        GreenTea greenTea = new GreenTea();
        HerbalTea herbalTea = new HerbalTea();

        blackTea.prepareTea();  // Prepare black tea
        greenTea.prepareTea();  // Prepare green tea
        herbalTea.prepareTea(); // Prepare herbal tea
        System.out.println();
        
// Q7)))
        Tea[] teas = new Tea[4];
        teas[0] = new Tea();
        teas[1] = new BlackTea();
        teas[2] = new GreenTea();
        teas[3] = new HerbalTea();

        for (Tea tea : teas) {
            tea.prepareTea();
        }
    }
    
}