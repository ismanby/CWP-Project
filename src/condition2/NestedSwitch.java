package condition2;

public class NestedSwitch {
    public String getSelection(int category, int choice) {
        String result;

        switch (category) {
            case 1: // Drinks
                switch (choice) {
                    case 2:
                        result = "You selected: Coffee"; 
                        break;
                    default:
                        result = "Invalid drink choice";
                        break;
                }
                return category + ", " + result;                
            case 2: // Food
                switch (choice) {
                    case 1:
                        result = "You selected: Pizza"; 
                        break;
                    default:
                        result = "Invalid food choice";
                        break;
                }
                return category + ", " + result;

                default:
                    return category + ", Invalid category";
        }
    }
}
