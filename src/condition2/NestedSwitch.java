package condition2;

public class NestedSwitch {
    public String getSelection(int category, int choice) {
        String result;

        switch (category) {
            case 1: // Drinks
                switch (choice) {
                    case 2: // choice 2 untuk Coffee
                        result = "You selected: Coffee"; 
                        break;
                    default: // selain choice 2, invalid drink choice
                        result = "Invalid drink choice";
                        break;
                }
                return category + ", " + result;                
            case 2: // Food
                switch (choice) { 
                    case 1: // choice 1 untuk Pizza
                        result = "You selected: Pizza"; 
                        break;
                    default: // selain choice 1, invalid food choice
                        result = "Invalid food choice";
                        break;
                }
                return category + ", " + result;

                // kategori selain 1 dan 2, invalid category
                default:
                    return category + ", Invalid category";
        }
    }
}
